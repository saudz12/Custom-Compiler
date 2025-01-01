using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;
using static CustomCompiler.ProgramData;

namespace CustomCompiler;

public class CustomCompilerVisitor : CustomLanguageBaseVisitor<ProgramData>
{
    ProgramData _programData = new ProgramData();

    List<ProgramData.Function> _currentScope = new List<ProgramData.Function>();
   
    List<ProgramData.Variable> _variables = new List<ProgramData.Variable>();

    bool _inAntet = false;
    bool _inGlobalScope = true;
    bool _declareTypeName = false;
    bool _declareValue = false;
    bool _callingFunction = false;
    bool _attribValue = false;

    public override ProgramData VisitBase_structure([NotNull] CustomLanguageParser.Base_structureContext context) //Done
    {
        VisitChildren(context);
        return _programData;
    }
    
    public override ProgramData VisitGlobal([NotNull] CustomLanguageParser.GlobalContext context)
    {
        _inGlobalScope = true;
        VisitChildren(context);
        _inGlobalScope = false;

        return _programData;
    }

    public override ProgramData VisitGlobal_var([NotNull] CustomLanguageParser.Global_varContext context)
    {
        _inGlobalScope = true;

        VisitChildren(context);

        if(context.SEMICOLON() == null)
            throw new Exception($"At Line {context.Start.Line}: Missing semicolon..");
        
        _programData.WriteLexic($"<TOKEN: SEMICOLON | LEXEM: {context.SEMICOLON().GetText()} | LINE: {context.Start.Line}>");

        return _programData;
    }

    public override ProgramData VisitFunc_decl([NotNull] CustomLanguageParser.Func_declContext context)
    {
        _inGlobalScope = false;
        _programData.FunctionList.Add(new ProgramData.Function());
        _currentScope.Add(_programData.FunctionList.Last());
        _programData.FunctionList.Last().FunctionType = ProgramData.FuncType.Normal;
        _programData.FunctionList.Last().IterationType = ProgramData.IterationType.Iterative;

        Visit(context.return_type());

        if (context.NAME() != null)
        {
            _programData.WriteLexic($"<TOKEN: NAME | LEXEM: {context.NAME().GetText()} | LINE: {context.Start.Line}>");
            _programData.FunctionList.Last().Name = context.NAME().GetText();

            if (_programData.FunctionList.Last().Name == "main")
            {
                if (_programData.HasMain)
                    throw new Exception($"At Line {context.Start.Line}: Main already delcared..");
                else
                    _programData.HasMain = true;
                _programData.FunctionList.Last().FunctionType = FuncType.Main;
            }
        }

        else
        {
            throw new Exception($"At Line {context.Start.Line}: Missing opened brackets..");
        }


        if (context.OPENPTHS() != null)
        {
            _programData.WriteLexic($"<TOKEN: OPENPTHS | LEXEM: {context.OPENPTHS().GetText()} | LINE: {context.Start.Line}>");
        }
        else
        {
            throw new Exception($"At Line {context.Start.Line}: Function requires a valid name..");
        }

        Visit(context.param_decl());

        if (_programData.CheckFunctionReoccurance(_programData.FunctionList.Last()))
            throw new Exception($"At Line {context.Start.Line}: Function {_programData.FunctionList.Last().Name} already declared..");

        if (context.CLOSEPTHS() != null)
        {
            _programData.WriteLexic($"<TOKEN: CLOSEPTHS | LEXEM: {context.CLOSEPTHS().GetText()} | LINE: {context.Start.Line}>");
        }
        else
        {
            throw new Exception($"At Line {context.Start.Line}: Missing closed brackets..");
        }

        Visit(context.body());

        _currentScope.Remove(_currentScope.Last());
        _inGlobalScope = true;

        return _programData;
    }

    public override ProgramData VisitBody([NotNull] CustomLanguageParser.BodyContext context)
    {
        VisitChildren(context);

        return _programData;
    }

    public override ProgramData VisitOpenedblock([NotNull] CustomLanguageParser.OpenedblockContext context) 
    {
        if(context.OPENEDBLOCK() == null)
            throw new Exception($"At Line {context.Start.Line}: Missing open brackets..");

        _programData.WriteLexic($"<TOKEN: OPENBLOCK | LEXEM: {context.OPENEDBLOCK().GetText()} | LINE: {context.Start.Line}>");

        return _programData;
    }

    public override ProgramData VisitClosedblock([NotNull] CustomLanguageParser.ClosedblockContext context)
    {
        if (context.CLOSEDBLOCK() == null)
            throw new Exception($"At Line {context.Start.Line}: Missing closed brackets..");

        _programData.WriteLexic($"<TOKEN: CLOSEDBLOCK | LEXEM: {context.CLOSEDBLOCK().GetText()} | LINE: {context.Start.Line}>");

        return _programData;
    }

    public override ProgramData VisitIf_statement([NotNull] CustomLanguageParser.If_statementContext context)
    {
        if (context.IF() != null)
        {
            _programData.WriteLexic($"<TOKEN: IF | LEXEM: if | Line: {context.Start.Line}>");

            if (context.OPENPTHS() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing opening brackets..");
            else
                _programData.WriteLexic($"<TOKEN: OPENPTHS | LEXEM: ( | Line: {context.Start.Line}>");

            if(context.instruction() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");
            else
                Visit(context.instruction());

            if (context.CLOSEPTHS() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing closing brackets..");
            else
                _programData.WriteLexic($"<TOKEN: CLOSEPTHS | LEXEM: ) | Line: {context.Start.Line}>");

            _programData.FunctionList.Last().ControlStructures.Add(new Pair<string, int>("If", context.Start.Line));

            Visit(context.body());

        }
        Visit(context.other_statements());

        return _programData;
    }

    public override ProgramData VisitOther_statements([NotNull] CustomLanguageParser.Other_statementsContext context)
    {
        VisitChildren(context);

        return _programData;
    }

    public override ProgramData VisitElse_if_statement([NotNull] CustomLanguageParser.Else_if_statementContext context)
    {
        if (context.ELSE_IF() != null)
        {
            _programData.WriteLexic($"<TOKEN: ELSE_IF | LEXEM: else if | Line: {context.Start.Line}>");

            _programData.WriteLexic($"<TOKEN: IF | LEXEM: if | Line: {context.Start.Line}>");

            if (context.OPENPTHS() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing opening brackets..");
            else
                _programData.WriteLexic($"<TOKEN: OPENPTHS | LEXEM: ( | Line: {context.Start.Line}>");

            if (context.instruction() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");
            else
                Visit(context.instruction());

            if (context.CLOSEPTHS() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing closing brackets..");
            else
                _programData.WriteLexic($"<TOKEN: CLOSEPTHS | LEXEM: ) | Line: {context.Start.Line}>");

            if (context.body() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing body..");

            _programData.FunctionList.Last().ControlStructures.Add(new Pair<string, int>("Else If", context.Start.Line));

            Visit(context.body());
        }

        return _programData;
    }

    public override ProgramData VisitElse_statement([NotNull] CustomLanguageParser.Else_statementContext context)
    {
        if(context.ELSE() != null)
        {
            _programData.WriteLexic($"<TOKEN: ELSE | LEXEM: else | Line: {context.Start.Line}>");

            if (context.body() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing body..");

            _programData.FunctionList.Last().ControlStructures.Add(new Pair<string, int>("Else", context.Start.Line));

            Visit(context.body());
        }


        return _programData;
    }

    public override ProgramData VisitLoop([NotNull] CustomLanguageParser.LoopContext context)
    {
        string token = "";
        string lexem = "";

        if (context.FOR_LOOP() != null)
        {
            token = "FOR_LOOP";
            lexem = "for";
        }
        else if (context.WHILE_LOOP() != null)
        {
            token = "WHILE";
            lexem = "while";
        }

        _programData.WriteLexic($"<TOKEN: {token} | LEXEM: {lexem} | Line: {context.Start.Line}>");

        _programData.FunctionList.Last().ControlStructures.Add(new Pair<string, int>(lexem, context.Start.Line));

        VisitChildren(context);
        
        return _programData;
    }

    public override ProgramData VisitReturn([NotNull] CustomLanguageParser.ReturnContext context)
    {
        _programData.WriteLexic($"<TOKEN: RETURN | LEXEM: return | Line: {context.Start.Line}>");

        VisitChildren(context);
    
        return _programData;
    }

    public override ProgramData VisitCode_line([NotNull] CustomLanguageParser.Code_lineContext context) 
    {
        VisitChildren(context);

        if (context.SEMICOLON == null)
        {
            throw new Exception($"At Line {context.Start.Line}: Missing semicolon..");
        }
        else
            _programData.WriteLexic($"<TOKEN: SEMICOLON | LEXEM: ; | Line: {context.Start.Line}>");

        return _programData;
    }

    public override ProgramData VisitAditionThenEqExp([NotNull] CustomLanguageParser.AditionThenEqExpContext context)
    {
        if (context.EQADD() != null)
        {
            if (context.name() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing vareiable..");

            Visit(context.name());

            Visit(context.EQADD());

            _programData.WriteLexic($"<TOKEN: EQADD | LEXEM: += | Line: {context.Start.Line}>");

            if (context.instruction() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            Visit(context.instruction());
        }

        return _programData;
    }

    public override ProgramData VisitSubtractThenEqExp([NotNull] CustomLanguageParser.SubtractThenEqExpContext context)
    {
        if (context.EQSUB() != null)
        {
            if (context.name() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing vareiable..");

            Visit(context.name());

            Visit(context.EQSUB());

            _programData.WriteLexic($"<TOKEN: EQSUB | LEXEM: -= | Line: {context.Start.Line}>");

            if (context.instruction() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            Visit(context.instruction());
        }

        return _programData;
    }

    public override ProgramData VisitMultiplyThenEqExp([NotNull] CustomLanguageParser.MultiplyThenEqExpContext context)
    {
        if (context.EQMUL() != null)
        {
            if (context.name() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing vareiable..");

            Visit(context.name());

            Visit(context.EQMUL());

            _programData.WriteLexic($"<TOKEN: EQMUL | LEXEM: *= | Line: {context.Start.Line}>");

            if (context.instruction() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            Visit(context.instruction());
        }

        return _programData;
    }

    public override ProgramData VisitDivideThenEqExp([NotNull] CustomLanguageParser.DivideThenEqExpContext context)
    {
        if (context.EQDIV() != null)
        {
            if (context.name() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing vareiable..");

            Visit(context.name());

            Visit(context.EQDIV());

            _programData.WriteLexic($"<TOKEN: EQDIV | LEXEM: /= | Line: {context.Start.Line}>");

            if (context.instruction() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            Visit(context.instruction());
        }

        return _programData;
    }

    public override ProgramData VisitModuloThenEqExp([NotNull] CustomLanguageParser.ModuloThenEqExpContext context)
    {
        if (context.EQMOD() != null)
        {
            if (context.name() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing vareiable..");

            Visit(context.name());

            Visit(context.EQMOD());

            _programData.WriteLexic($"<TOKEN: EQMOD | LEXEM: %= | Line: {context.Start.Line}>");

            if (context.instruction() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            Visit(context.instruction());
        }

        return _programData;
    }

    public override ProgramData VisitEqualExp([NotNull] CustomLanguageParser.EqualExpContext context)
    {
        if (context.EQUAL() != null)
        {
            if (context.name() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing vareiable..");

            Visit(context.name());

            Visit(context.EQUAL());

            _programData.WriteLexic($"<TOKEN: EQUAL | LEXEM: = | Line: {context.Start.Line}>");

            if (context.instruction() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            Visit(context.instruction());
        }

        return _programData;
    }

    public override ProgramData VisitParam_decl([NotNull] CustomLanguageParser.Param_declContext context)
    {
        _declareTypeName = true;
        _inGlobalScope = false;
        _inAntet = true;
        _declareValue = false;

        if (context.init_param() != null)
            VisitChildren(context);
        else if (context.other_param() != null)
            throw new Exception($"At Line {context.Start.Line}: Missing parameter..");

        _declareTypeName = false;
        _inAntet = false;

        return _programData;
    }

    public override ProgramData VisitOther_param([NotNull] CustomLanguageParser.Other_paramContext context)
    {
        if(context.COMMA() != null)
        {
            _programData.WriteLexic($"<TOKEN: COMMA | LEXEM: , | Line: {context.Start.Line}>");

            if (context.init_param() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing type assingment..");

            Visit(context.init_param());
        }

        return _programData;
    }

    public override ProgramData VisitInit_param([NotNull] CustomLanguageParser.Init_paramContext context) 
    {
        Visit(context.data_type());
        Visit(context.name());

        return _programData;
    }

    public override ProgramData VisitVar_decl([NotNull] CustomLanguageParser.Var_declContext context)
    { 
        VisitChildren(context);

        return _programData;
    }

    public override ProgramData VisitOther_var([NotNull] CustomLanguageParser.Other_varContext context)
    {
        if (context.COMMA() != null)
        {
            Variable chainVar = new Variable();

            chainVar.VariableType = _variables.Last().VariableType;

            _programData.WriteLexic($"<TOKEN: COMMA | LEXEM: , | Line: {context.Start.Line}>");

            if (context.init_var() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing value assingment..");

            chainVar.VariableType = _variables.Last().VariableType;

            _variables.Add(chainVar);

            Visit(context.init_var());
        }

        return _programData;
    }

    public override ProgramData VisitInit_var([NotNull] CustomLanguageParser.Init_varContext context)
    {
        _declareTypeName = true;

        Visit(context.name());

        _declareTypeName = false;

        if(context.EQUAL() != null)
        {
            _programData.WriteLexic($"<TOKEN: EQUAL | LEXEM: = | Line: {context.Start.Line}>");

            if (context.instruction() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing value assingment..");
            
            _declareValue = true;

            Visit(context.instruction());

            _declareValue = false;

        }

        return _programData;
    }

    public override ProgramData VisitSmallerEqExp([NotNull] CustomLanguageParser.SmallerEqExpContext context)
    {
        if (context.SMALLER_EQ() != null)
        {
            if (context.instruction(0) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (context.instruction(1) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction(0));

            Visit(context.SMALLER_EQ());

            _programData.WriteLexic($"<TOKEN: SMALLER_EQ | LEXEM: <= | Line: {context.Start.Line}>");


            Visit(context.instruction(1));

        }

        return _programData;
    }
    
    public override ProgramData VisitPreincrementExp([NotNull] CustomLanguageParser.PreincrementExpContext context)
    {
        if (context.INCREMENT() != null)
        {
            Visit(context.INCREMENT());

            _programData.WriteLexic($"<TOKEN: INCREMENT | LEXEM: ++& | Line: {context.Start.Line}>");

            if (context.instruction() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                if (_variables.Last().VariableType == ReturnType.String)
                    throw new Exception($"At Line {context.Start.Line}: Ivalid variable type attribution..");
                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction());
        }

        return _programData;
    }

    public override ProgramData VisitVariableAtomExp([NotNull] CustomLanguageParser.VariableAtomExpContext context)
    {
        Visit(context.name());

        if(_declareValue)
        {
            _declareValue = false;
        }
        return _programData;
    }
    
    public override ProgramData VisitValueAtomEXp([NotNull] CustomLanguageParser.ValueAtomEXpContext context)
    {
        Visit(context.data_value());

        if (_declareValue)
        {
            _declareValue = false;
        }

        return _programData;
    }

    public override ProgramData VisitPredecrementExp([NotNull] CustomLanguageParser.PredecrementExpContext context)
    {
        if (context.DECREMENT() != null)
        {
            Visit(context.DECREMENT());

            _programData.WriteLexic($"<TOKEN: DECREMENT | LEXEM: --& | Line: {context.Start.Line}>");

            if (context.instruction() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                if (_variables.Last().VariableType == ReturnType.String)
                    throw new Exception($"At Line {context.Start.Line}: Ivalid variable type attribution..");
                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction());
        }

        return _programData;
    }

    public override ProgramData VisitLogicNotExp([NotNull] CustomLanguageParser.LogicNotExpContext context)
    {
        if(context.NOT() != null)
        {
            Visit(context.NOT());

            _programData.WriteLexic($"<TOKEN: NOT | LEXEM: ! | Line: {context.Start.Line}>");

            if(context.instruction() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                if(_variables.Last().VariableType == ReturnType.String)
                    throw new Exception($"At Line {context.Start.Line}: Ivalid variable type attribution..");

                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction());
        }

        return _programData;
    }
    
    public override ProgramData VisitFunctionCallExp([NotNull] CustomLanguageParser.FunctionCallExpContext context)
    {
        _callingFunction = true;

        Visit(context.name());

        _callingFunction = false;

        if(context.OPENPTHS() != null)
        {
            if(context.CLOSEPTHS() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing closed brackets");

            _programData.WriteLexic($"<TOKEN: OPENPTHS | LEXEM: ( | Line: {context.Start.Line}>");

            if (_declareValue)
            {
                _declareValue = false;
                _variables.Last().Value = context.GetText();
            }

            if (context.instruction_list() != null)
            {
                Visit(context.instruction_list());
            }

            _programData.WriteLexic($"<TOKEN: CLOSEPTHS | LEXEM: ) | Line: {context.Start.Line}>");
        }

        return _programData;
    }
    
    public override ProgramData VisitPostdecrementExp([NotNull] CustomLanguageParser.PostdecrementExpContext context)
    {
        if (context.DECREMENT() != null)
        {
            if (context.instruction() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                if (_variables.Last().VariableType == ReturnType.String)
                    throw new Exception($"At Line {context.Start.Line}: Ivalid variable type attribution..");
                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction());

            Visit(context.DECREMENT());

            _programData.WriteLexic($"<TOKEN: DECREMENT | LEXEM: &-- | Line: {context.Start.Line}>");

        }

        return _programData;
    }
    
    public override ProgramData VisitModuloExp([NotNull] CustomLanguageParser.ModuloExpContext context)
    {
        if (context.MOD() != null)
        {
            if (context.instruction(0) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (context.instruction(1) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction(0));

            Visit(context.MOD());

            _programData.WriteLexic($"<TOKEN: MOD | LEXEM: - | Line: {context.Start.Line}>");


            Visit(context.instruction(1));
        }

        return _programData;
    }
    
    public override ProgramData VisitGreaterEqExp([NotNull] CustomLanguageParser.GreaterEqExpContext context)
    {
        if (context.GREATER_EQ() != null)
        {
            if (context.instruction(0) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (context.instruction(1) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                if (_variables.Last().VariableType == ReturnType.String)
                    throw new Exception($"At Line {context.Start.Line}: Ivalid variable type attribution..");
                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction(0));

            Visit(context.GREATER_EQ());

            _programData.WriteLexic($"<TOKEN: GREATER_EQ | LEXEM: >= | Line: {context.Start.Line}>");

            Visit(context.instruction(1));
        }

        return _programData;
    }
    
    public override ProgramData VisitSmallerExp([NotNull] CustomLanguageParser.SmallerExpContext context)
    {
        if (context.SMALLER() != null)
        {
            if (context.instruction(0) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (context.instruction(1) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                if (_variables.Last().VariableType == ReturnType.String)
                    throw new Exception($"At Line {context.Start.Line}: Ivalid variable type attribution..");
                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction(0));

            Visit(context.SMALLER());

            _programData.WriteLexic($"<TOKEN: SMALLER | LEXEM: < | Line: {context.Start.Line}>");

            Visit(context.instruction(1));
        }

        return _programData;
    }
    
    public override ProgramData VisitGreaterExp([NotNull] CustomLanguageParser.GreaterExpContext context)
    {
        if (context.GREATER() != null)
        {
            if (context.instruction(0) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (context.instruction(1) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                if (_variables.Last().VariableType == ReturnType.String)
                    throw new Exception($"At Line {context.Start.Line}: Ivalid variable type attribution..");
                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction(0));

            Visit(context.GREATER());

            _programData.WriteLexic($"<TOKEN: GREATER | LEXEM: > | Line: {context.Start.Line}>");
            Visit(context.instruction(1));
        }

        return _programData;
    }
    
    public override ProgramData VisitLogicAndExp([NotNull] CustomLanguageParser.LogicAndExpContext context)
    {
        if (context.AND() != null)
        {
            if (context.instruction(0) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (context.instruction(1) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                if (_variables.Last().VariableType == ReturnType.String)
                    throw new Exception($"At Line {context.Start.Line}: Ivalid variable type attribution..");
                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction(0));

            Visit(context.AND());

            _programData.WriteLexic($"<TOKEN: AND | LEXEM: && | Line: {context.Start.Line}>");
            Visit(context.instruction(1));
        }

        return _programData;
    }
    
    public override ProgramData VisitLogicOrExp([NotNull] CustomLanguageParser.LogicOrExpContext context)
    {
        if (context.OR() != null)
        {
            if (context.instruction(0) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (context.instruction(1) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction(0));

            Visit(context.OR());

            _programData.WriteLexic($"<TOKEN: OR | LEXEM: || | Line: {context.Start.Line}>");
            Visit(context.instruction(1));
        }

        return _programData;
    }
    
    public override ProgramData VisitParanhesisExp([NotNull] CustomLanguageParser.ParanhesisExpContext context)
    {
        if (context.OPENPTHS() != null)
        {
            _programData.WriteLexic($"<TOKEN: OPENPTHS | LEXEM: ( | LINE: {context.Start.Line}>");

            if(context.instruction() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction");

            if (context.CLOSEPTHS() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing closed brackets");

            if (_declareValue)
            {
                _declareValue = false;

                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction());
            _programData.WriteLexic($"<TOKEN: CLOSEPTHS | LEXEM: ) | LINE: {context.Start.Line}>");
        }

        return _programData;
    }
   
    public override ProgramData VisitSubtractExp([NotNull] CustomLanguageParser.SubtractExpContext context)
    {
        if (context.SUB() != null)
        {
            if (context.instruction(0) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (context.instruction(1) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction(0));

            Visit(context.SUB());

            _programData.WriteLexic($"<TOKEN: SUB | LEXEM: - | Line: {context.Start.Line}>");
            Visit(context.instruction(1));
        }

        return _programData;
    }
    
    public override ProgramData VisitSameValueExp([NotNull] CustomLanguageParser.SameValueExpContext context)
    {
        if (context.SAME() != null)
        {
            if (context.instruction(0) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (context.instruction(1) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                if (_variables.Last().VariableType == ReturnType.String)
                    throw new Exception($"At Line {context.Start.Line}: Ivalid variable type attribution..");
                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction(0));

            Visit(context.SAME());

            _programData.WriteLexic($"<TOKEN: SAME | LEXEM: == | Line: {context.Start.Line}>");
            Visit(context.instruction(1));
        }

        return _programData;
    }
    
    public override ProgramData VisitDiffValueExp([NotNull] CustomLanguageParser.DiffValueExpContext context)
    {
        if (context.DIFF() != null)
        {
            if (context.instruction(0) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (context.instruction(1) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                if (_variables.Last().VariableType == ReturnType.String)
                    throw new Exception($"At Line {context.Start.Line}: Ivalid variable type attribution..");
                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction(0));

            Visit(context.DIFF());

            _programData.WriteLexic($"<TOKEN: DIFF | LEXEM: != | Line: {context.Start.Line}>");
            Visit(context.instruction(1));
        }

        return _programData;
    }
    
    public override ProgramData VisitMultiplyExp([NotNull] CustomLanguageParser.MultiplyExpContext context)
    {
        if (context.MUL() != null)
        {
            if (context.instruction(0) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (context.instruction(1) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction(0));

            Visit(context.MUL());

            _programData.WriteLexic($"<TOKEN: MUL | LEXEM: * | Line: {context.Start.Line}>");
            Visit(context.instruction(1));
        }

        return _programData;
    }
    
    public override ProgramData VisitDivideExp([NotNull] CustomLanguageParser.DivideExpContext context)
    {
        if (context.DIV() != null)
        {
            if (context.instruction(0) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (context.instruction(1) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction(0));

            Visit(context.DIV());

            _programData.WriteLexic($"<TOKEN: DIV | LEXEM: / | Line: {context.Start.Line}>");
            Visit(context.instruction(1));
        }

        return _programData;
    }
    
    public override ProgramData VisitAditionExp([NotNull] CustomLanguageParser.AditionExpContext context)
    {
        if (context.ADD() != null)
        {
            if (context.instruction(0) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (context.instruction(1) == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction(0));

            Visit(context.ADD());

            _programData.WriteLexic($"<TOKEN: ADD | LEXEM: + | Line: {context.Start.Line}>");
            Visit(context.instruction(1));
        }

        return _programData;
    }
    
    public override ProgramData VisitPostincrementExp([NotNull] CustomLanguageParser.PostincrementExpContext context)
    {
        if (context.INCREMENT() != null)
        {
            if (context.instruction() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            if (_declareValue)
            {
                _declareValue = false;
                if (_variables.Last().VariableType == ReturnType.String)
                    throw new Exception($"At Line {context.Start.Line}: Ivalid variable type attribution..");
                _variables.Last().Value = context.GetText();
            }

            Visit(context.instruction());

            Visit(context.INCREMENT());

            _programData.WriteLexic($"<TOKEN: INCREMENT | LEXEM: &++ | Line: {context.Start.Line}>");
        }

        return _programData;
    }

    public override ProgramData VisitInstruction_list([NotNull] CustomLanguageParser.Instruction_listContext context)
    {
        VisitChildren(context);

        return _programData;
    }

    public override ProgramData VisitOther_instructions([NotNull] CustomLanguageParser.Other_instructionsContext context)
    {
        if(context.COMMA() != null)
        {
            _programData.WriteLexic($"<TOKEN: COMMA | LEXEM: , | Line: {context.Start.Line}>");

            if (context.instruction() == null)
                throw new Exception($"At Line {context.Start.Line}: Missing instruction..");

            Visit(context.instruction());
        }

        return _programData;
    }

    public override ProgramData VisitReturn_type([NotNull] CustomLanguageParser.Return_typeContext context) //Done
    {
        //Console.WriteLine($"Return Type at {context.Start.Line}");
        string token = "";

        string lexem = "";

        if (context.VOID_TYPE() != null)
        {
            _programData.FunctionList.Last().ReturnType = ProgramData.ReturnType.Void;
            token = "VOID_TYPE";
        }
        else if(context.INTEGER_TYPE() != null)
        {
            _programData.FunctionList.Last().ReturnType = ProgramData.ReturnType.Int;
            token = "INT_TYPE";
        }
        else if (context.STRING_TYPE() != null)
        {
            _programData.FunctionList.Last().ReturnType = ProgramData.ReturnType.String;
            token = "STRING_TYPE";
        }
        else if (context.DOUBLE_TYPE() != null)
        {
            _programData.FunctionList.Last().ReturnType = ProgramData.ReturnType.Double;
            token = "DOUBLE_TYPE";
        }
        else if (context.FLOAT_TYPE() != null)
        {
            _programData.FunctionList.Last().ReturnType = ProgramData.ReturnType.Float;
            token = "FLOAT_TYPE";
        }
        else
        {
            throw new Exception("Invalid return type");
        }
        lexem = context.GetText();

        _programData.WriteLexic($"<TOKEN: {token} | LEXEM: {lexem} | Line: {context.Start.Line}>");

        return _programData;
    }
    
    public override ProgramData VisitData_type([NotNull] CustomLanguageParser.Data_typeContext context) //Done
    {
        var token = "";

        ProgramData.Variable varDefinition = new ProgramData.Variable();

        if (context.INTEGER_TYPE() != null)
        {
            //token = ProgramData.ReturnType.Int.ToString();
            token = "INT";
            varDefinition.VariableType = ProgramData.ReturnType.Int;
        }
        else if (context.FLOAT_TYPE() != null)
        {
            //token = ProgramData.ReturnType.Float.ToString();
            token = "FLOAT";
            varDefinition.VariableType = ProgramData.ReturnType.Float;
        }
        else if (context.DOUBLE_TYPE() != null)
        {
            //token = ProgramData.ReturnType.Double.ToString();
            token = "DOUBLE";
            varDefinition.VariableType = ProgramData.ReturnType.Double;
        }
        else if (context.STRING_TYPE() != null)
        {
            //token = ProgramData.ReturnType.String.ToString();
            token = "STRING";
            varDefinition.VariableType = ProgramData.ReturnType.String;
        }
        else
        {
            throw new Exception("Invalid data type");
        }

        string lexem = context.GetText();

        _programData.WriteLexic($"<TOKEN: {token} | LEXEM: {lexem} | Line: {context.Start.Line}>");

        _variables.Add( varDefinition );

        return _programData;
    }

    public override ProgramData VisitData_value([NotNull] CustomLanguageParser.Data_valueContext context)
    {
        string token = "";

        if (context.INTEGER_VALUE() != null)
        {
            if(_declareValue && _variables.Last().VariableType == ProgramData.ReturnType.String)
                throw new Exception($"At Line {context.Start.Line}: Value not matching type..");

            token = "INT";
        }
        else if (_declareValue && context.FLOAT_VALUE() != null)
        {
            if (_variables.Last().VariableType == ProgramData.ReturnType.String)
                throw new Exception($"At Line {context.Start.Line}: Value not matching type..");

            token = "FLOAT";
        }
        else if (_declareValue && context.STRING_VALUE() != null)
        {
            if (_variables.Last().VariableType != ProgramData.ReturnType.String)
                throw new Exception($"At Line {context.Start.Line}: Value not matching type..");

            token = "STRING";
        }
        string lexem = context.GetText();

        _programData.WriteLexic($"<TOKEN: {token} | LEXEM: {lexem} | Line: {context.Start.Line}>");

        if (_declareValue)
        {
            _declareValue = false;
            _variables.Last().Value = lexem;
        }

        return VisitChildren(context);
    }

    public override ProgramData VisitName([NotNull] CustomLanguageParser.NameContext context)
    {
        string token = "NAME";
        string lexem = "";

        if (context.NAME() != null)
        {
            lexem = context.NAME().GetText();
        }
        else
        {
            throw new Exception($"At Line {context.Start.Line}: Invalid variable name..");
        }

        _programData.WriteLexic($"<TOKEN: {token} | LEXEM: {lexem} | Line: {context.Start.Line}>");

        if (_callingFunction)
        {
            bool ok = false;

            foreach(var f in _programData.FunctionList)
            {
                if(f.Name == lexem)
                {
                    ok = true;
                    break;
                }
            }

            if(!ok)
                throw new Exception($"At Line {context.Start.Line}: Invalid function name..");

            if(lexem == "main")
                throw new Exception($"At Line {context.Start.Line}: Cannot call <Main>..");

            if (_currentScope.Count != 0)
                if(_currentScope.Last().Name == lexem)
                    _currentScope.Last().IterationType = IterationType.Recursive;
        }

        if (_declareValue && !_callingFunction)
        {
            bool ok = false;

            foreach(var v in _programData.GlobalVariables)
                if (v.Name == lexem)
                {
                    ok = true;
                    break;
                }

            if(_currentScope.Count != 0)
            {
                for (int i = 0; i < _currentScope.Last().Parameters.Count(); i++)
                    if (_currentScope.Last().Parameters[i].Name == lexem)
                    {
                        ok = true;
                        break;
                    }
                for (int i = 0; i < _currentScope.Last().Variables.Count() - 1; i++)
                    if (_currentScope.Last().Variables[i].Name == lexem)
                    {
                        ok = true;
                        break;
                    }
            }

            if(!ok)
                throw new Exception($"At Line {context.Start.Line}: Variable not found..");


            _variables.Last().Value = lexem;
        }

        if (_declareTypeName)
        {
            if (_currentScope.Count != 0)
                if (_currentScope.Last().CheckReoccurance(lexem))
                    throw new Exception($"At Line {context.Start.Line}: Parameter/Variable already declared..");
            if (_programData.CheckGlobalReoccurence(lexem))
                throw new Exception($"At Line {context.Start.Line}: Naming conflict with Global variables..");

            _variables.Last().Name = lexem;

            if (_inGlobalScope)
            {
                _programData.GlobalVariables.Add(_variables.Last());
            }
            else if(_inAntet) 
            {
                _programData.FunctionList.Last().Parameters.Add(_variables.Last());
            }
            else
            {
                _programData.FunctionList.Last().Variables.Add(_variables.Last());
            }
        }

        return _programData;
    }
}