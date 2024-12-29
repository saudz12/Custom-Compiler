using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Misc;

namespace CustomCompiler;

public class CustomCompilerVisitor : CustomLanguageBaseVisitor<ProgramData>
{
    ProgramData _programData = new ProgramData();


    public override ProgramData VisitBase_structure([NotNull] CustomLanguageParser.Base_structureContext context)
    {
        return VisitChildren(context);
    }
    
    public override ProgramData VisitMain([NotNull] CustomLanguageParser.MainContext context)
    {
        int line = context.Start.Line;

        string token = "";

        string lexem = "";

        if(context.MAIN_FUNC() != null)
        {
            token = "MAIN_FUNC";
            lexem = context.MAIN_FUNC().GetText();
        }
        else
        {
            throw new Exception("No main function found...");
        }

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }

    public override ProgramData VisitGlobal([NotNull] CustomLanguageParser.GlobalContext context)
    {
        return VisitChildren(context);
    }

    public override ProgramData VisitFunc_decl([NotNull] CustomLanguageParser.Func_declContext context)
    {
        return VisitChildren(context);
    }

    public override ProgramData VisitBody([NotNull] CustomLanguageParser.BodyContext context)
    {
        return VisitChildren(context);
    }

    public override ProgramData VisitIf_statement([NotNull] CustomLanguageParser.If_statementContext context)
    {
        int line = context.Start.Line;

        string token = "IF";

        string lexem = "return";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }

    public override ProgramData VisitOther_statements([NotNull] CustomLanguageParser.Other_statementsContext context)
    {
        return VisitChildren(context);
    }

    public override ProgramData VisitElse_if_statement([NotNull] CustomLanguageParser.Else_if_statementContext context)
    {
        int line = context.Start.Line;

        string token = "ELSE_IF";

        string lexem = "else if";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }

    public override ProgramData VisitElse_statement([NotNull] CustomLanguageParser.Else_statementContext context)
    {
        int line = context.Start.Line;

        string token = "ELSE";

        string lexem = "else";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }

    public override ProgramData VisitLoop([NotNull] CustomLanguageParser.LoopContext context)
    {
        int line = context.Start.Line;

        string token = "";
        string lexem = "";

        if (context.FOR_LOOP() != null)
        {
            token = "FOR_LOOP";
            lexem = "for";
        }
        else if (context.WHILE_LOOP() != null)
        {
            token = "FOR_WHILE";
            lexem = "while";
        }
        //else
        //{
        //    throw new Exception("Invalid loop term");
        //}

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }

    public override ProgramData VisitReturn([NotNull] CustomLanguageParser.ReturnContext context)
    {
        int line = context.Start.Line;

        string token = "RETURN";

        string lexem = "return";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }

    public override ProgramData VisitAditionThenEqExp([NotNull] CustomLanguageParser.AditionThenEqExpContext context)
    {
        int line = context.Start.Line;

        string token = "EQADD";

        string lexem = "+=";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }

    public override ProgramData VisitSubtractThenEqExp([NotNull] CustomLanguageParser.SubtractThenEqExpContext context)
    {
        int line = context.Start.Line;

        string token = "EQSUB";

        string lexem = "-=";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }

    public override ProgramData VisitMultiplyThenEqExp([NotNull] CustomLanguageParser.MultiplyThenEqExpContext context)
    {
        int line = context.Start.Line;

        string token = "EQMUL";

        string lexem = "*=";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }

    public override ProgramData VisitDivideThenEqExp([NotNull] CustomLanguageParser.DivideThenEqExpContext context)
    {
        int line = context.Start.Line;

        string token = "EQDIV";

        string lexem = "/=";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }

    public override ProgramData VisitModuloThenEqExp([NotNull] CustomLanguageParser.ModuloThenEqExpContext context)
    {
        int line = context.Start.Line;

        string token = "MOD";

        string lexem = "%=";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }

    public override ProgramData VisitEqualExp([NotNull] CustomLanguageParser.EqualExpContext context)
    {
        int line = context.Start.Line;

        string token = "EQUAL";

        string lexem = "=";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }

    public override ProgramData VisitParam_decl([NotNull] CustomLanguageParser.Param_declContext context)
    {

        return VisitChildren(context);
    }

    public override ProgramData VisitVar_decl([NotNull] CustomLanguageParser.Var_declContext context)
    {   

        return VisitChildren(context);
    }
    
    public override ProgramData VisitSmallerEqExp([NotNull] CustomLanguageParser.SmallerEqExpContext context)
    {
        int line = context.Start.Line;

        string token = "SMALLER_EQ";

        string lexem = "<=";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }
    
    public override ProgramData VisitPreincrementExp([NotNull] CustomLanguageParser.PreincrementExpContext context)
    {
        int line = context.Start.Line;

        string token = "INCREMENT";

        string lexem = "&++";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }

    public override ProgramData VisitVariableAtomExp([NotNull] CustomLanguageParser.VariableAtomExpContext context)
    {
        return VisitChildren(context);
    }
    
    public override ProgramData VisitValueAtomEXp([NotNull] CustomLanguageParser.ValueAtomEXpContext context)
    {
        return VisitChildren(context);
    }

    public override ProgramData VisitPredecrementExp([NotNull] CustomLanguageParser.PredecrementExpContext context)
    {
        int line = context.Start.Line;

        string token = "DEC";

        string lexem = "--&";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }

    public override ProgramData VisitLogicNotExp([NotNull] CustomLanguageParser.LogicNotExpContext context)
    {
        int line = context.Start.Line;

        string token = "NOT";

        string lexem = "!";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }
    
    public override ProgramData VisitFunctionCallExp([NotNull] CustomLanguageParser.FunctionCallExpContext context)
    {
        

        return VisitChildren(context);
    }
    
    public override ProgramData VisitPostdecrementExp([NotNull] CustomLanguageParser.PostdecrementExpContext context)
    {
        int line = context.Start.Line;

        string token = "DEC";

        string lexem = "&--";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }
    
    public override ProgramData VisitModuloExp([NotNull] CustomLanguageParser.ModuloExpContext context)
    {
        int line = context.Start.Line;

        string token = "MOD";

        string lexem = "%";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }
    
    public override ProgramData VisitGreaterEqExp([NotNull] CustomLanguageParser.GreaterEqExpContext context)
    {
        int line = context.Start.Line;

        string token = "GREATER_EQ";

        string lexem = ">=";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }
    
    public override ProgramData VisitSmallerExp([NotNull] CustomLanguageParser.SmallerExpContext context)
    {
        int line = context.Start.Line;

        string token = "SMALLER";

        string lexem = "<";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }
    
    public override ProgramData VisitGreaterExp([NotNull] CustomLanguageParser.GreaterExpContext context)
    {
        int line = context.Start.Line;

        string token = "GREATER";

        string lexem = ">";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }
    
    public override ProgramData VisitLogicAndExp([NotNull] CustomLanguageParser.LogicAndExpContext context)
    {
        int line = context.Start.Line;

        string token = "AND";

        string lexem = "&&";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }
    
    public override ProgramData VisitLogicOrExp([NotNull] CustomLanguageParser.LogicOrExpContext context)
    {
        int line = context.Start.Line;

        string token = "OR";

        string lexem = "||";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }
    
    public override ProgramData VisitParanhesisExp([NotNull] CustomLanguageParser.ParanhesisExpContext context)
    {
        

        return VisitChildren(context);
    }
   
    public override ProgramData VisitSubtractExp([NotNull] CustomLanguageParser.SubtractExpContext context)
    {
        int line = context.Start.Line;

        string token = "SUB";

        string lexem = "-";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }
    
    public override ProgramData VisitSameValueExp([NotNull] CustomLanguageParser.SameValueExpContext context)
    {
        int line = context.Start.Line;

        string token = "DIFF";

        string lexem = "!=";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }
    
    public override ProgramData VisitDiffValueExp([NotNull] CustomLanguageParser.DiffValueExpContext context)
    {
        int line = context.Start.Line;

        string token = "DIFF";

        string lexem = "!=";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }
    
    public override ProgramData VisitMultiplyExp([NotNull] CustomLanguageParser.MultiplyExpContext context)
    {
        int line = context.Start.Line;

        string token = "MUL";

        string lexem = "*";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }
    
    public override ProgramData VisitDivideExp([NotNull] CustomLanguageParser.DivideExpContext context)
    {
        int line = context.Start.Line;

        string token = "DIV";

        string lexem = "/";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }
    
    public override ProgramData VisitAditionExp([NotNull] CustomLanguageParser.AditionExpContext context)
    {
        int line = context.Start.Line;

        string token = "ADD";

        string lexem = "+";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }
    
    public override ProgramData VisitPostincrementExp([NotNull] CustomLanguageParser.PostincrementExpContext context)
    {
        int line = context.Start.Line;

        string token = "INCREMENT";

        string lexem = "&++";

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context); 
    }

    public override ProgramData VisitReturn_type([NotNull] CustomLanguageParser.Return_typeContext context) 
    {
        if (context.VOID_TYPE() != null)
        {

            int line = context.Start.Line;

            string token = "NAME";

            string lexem = context.GetText();

            string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

            _programData.WriteLexic(format);
        }

        return VisitChildren(context);
    }
    
    public override ProgramData VisitData_type([NotNull] CustomLanguageParser.Data_typeContext context)
    {
        int line = context.Start.Line;
        string token = "";

        if (context.INTEGER_TYPE() != null)
        {
            _programData.Variables.Add(new ProgramData.Variable { VariableType = ProgramData.Type.Int });
            token = ProgramData.Type.Int.ToString();
            token = "INT";
        }
        else if (context.FLOAT_TYPE() != null)
        {
            _programData.Variables.Add(new ProgramData.Variable { VariableType = ProgramData.Type.Float });
            token = ProgramData.Type.Float.ToString();
            token = "FLOAT";
        }
        else if (context.DOUBLE_TYPE() != null)
        {
            _programData.Variables.Add(new ProgramData.Variable { VariableType = ProgramData.Type.Double });
            token = ProgramData.Type.Double.ToString();
            token = "DOUBLE";
        }
        else if (context.STRING_TYPE() != null)
        {
            _programData.Variables.Add(new ProgramData.Variable { VariableType = ProgramData.Type.String });
            token = ProgramData.Type.String.ToString();
            token = "STRING";
        }

        string lexem = context.GetText();

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);

        return VisitChildren(context);
    }

    public override ProgramData VisitData_value([NotNull] CustomLanguageParser.Data_valueContext context)
    {
        int line = context.Start.Line;
        string token = "";


        if (context.INTEGER_VALUE() != null)
        {
            //token = ProgramData.Type.Int.ToString();
            token = "INT";
        }
        else if (context.FLOAT_VALUE() != null)
        {
            //token = ProgramData.Type.Float.ToString();
            token = "FLOAT";
        }
        else if (context.STRING_VALUE() != null)
        {
            //token = ProgramData.Type.String.ToString();
            token = "STRING";
        }
        else
        {
            throw new Exception($"Value not matching type");
        }
        string lexem = context.GetText();

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);


        return VisitChildren(context);
    }

    public override ProgramData VisitName([NotNull] CustomLanguageParser.NameContext context)
    {
        int line = context.Start.Line;

        string token = "NAME";

        string lexem = context.GetText();

        string format = $"<TOKEN: {token}| LEXEM: {lexem}| Line: {line}>";

        _programData.WriteLexic(format);
 
        return VisitChildren(context);
    }
}