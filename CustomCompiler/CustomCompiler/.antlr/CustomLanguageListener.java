// Generated from d:/UNIV/ANUL_II/LFC - Limbaje Formale si Compilatoare/Custom-Compiler/CustomCompiler/CustomCompiler/CustomLanguage.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CustomLanguageParser}.
 */
public interface CustomLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#base_structure}.
	 * @param ctx the parse tree
	 */
	void enterBase_structure(CustomLanguageParser.Base_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#base_structure}.
	 * @param ctx the parse tree
	 */
	void exitBase_structure(CustomLanguageParser.Base_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(CustomLanguageParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(CustomLanguageParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#global_var}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_var(CustomLanguageParser.Global_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#global_var}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_var(CustomLanguageParser.Global_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(CustomLanguageParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(CustomLanguageParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CustomLanguageParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CustomLanguageParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#openedblock}.
	 * @param ctx the parse tree
	 */
	void enterOpenedblock(CustomLanguageParser.OpenedblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#openedblock}.
	 * @param ctx the parse tree
	 */
	void exitOpenedblock(CustomLanguageParser.OpenedblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#closedblock}.
	 * @param ctx the parse tree
	 */
	void enterClosedblock(CustomLanguageParser.ClosedblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#closedblock}.
	 * @param ctx the parse tree
	 */
	void exitClosedblock(CustomLanguageParser.ClosedblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(CustomLanguageParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(CustomLanguageParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#other_statements}.
	 * @param ctx the parse tree
	 */
	void enterOther_statements(CustomLanguageParser.Other_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#other_statements}.
	 * @param ctx the parse tree
	 */
	void exitOther_statements(CustomLanguageParser.Other_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_statement(CustomLanguageParser.Else_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#else_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_statement(CustomLanguageParser.Else_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(CustomLanguageParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(CustomLanguageParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(CustomLanguageParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(CustomLanguageParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#code_line}.
	 * @param ctx the parse tree
	 */
	void enterCode_line(CustomLanguageParser.Code_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#code_line}.
	 * @param ctx the parse tree
	 */
	void exitCode_line(CustomLanguageParser.Code_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(CustomLanguageParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(CustomLanguageParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aditionThenEqExp}
	 * labeled alternative in {@link CustomLanguageParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterAditionThenEqExp(CustomLanguageParser.AditionThenEqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aditionThenEqExp}
	 * labeled alternative in {@link CustomLanguageParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitAditionThenEqExp(CustomLanguageParser.AditionThenEqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractThenEqExp}
	 * labeled alternative in {@link CustomLanguageParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterSubtractThenEqExp(CustomLanguageParser.SubtractThenEqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractThenEqExp}
	 * labeled alternative in {@link CustomLanguageParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitSubtractThenEqExp(CustomLanguageParser.SubtractThenEqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyThenEqExp}
	 * labeled alternative in {@link CustomLanguageParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyThenEqExp(CustomLanguageParser.MultiplyThenEqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyThenEqExp}
	 * labeled alternative in {@link CustomLanguageParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyThenEqExp(CustomLanguageParser.MultiplyThenEqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideThenEqExp}
	 * labeled alternative in {@link CustomLanguageParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterDivideThenEqExp(CustomLanguageParser.DivideThenEqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideThenEqExp}
	 * labeled alternative in {@link CustomLanguageParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitDivideThenEqExp(CustomLanguageParser.DivideThenEqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moduloThenEqExp}
	 * labeled alternative in {@link CustomLanguageParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterModuloThenEqExp(CustomLanguageParser.ModuloThenEqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moduloThenEqExp}
	 * labeled alternative in {@link CustomLanguageParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitModuloThenEqExp(CustomLanguageParser.ModuloThenEqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalExp}
	 * labeled alternative in {@link CustomLanguageParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterEqualExp(CustomLanguageParser.EqualExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalExp}
	 * labeled alternative in {@link CustomLanguageParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitEqualExp(CustomLanguageParser.EqualExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl(CustomLanguageParser.Param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl(CustomLanguageParser.Param_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#other_param}.
	 * @param ctx the parse tree
	 */
	void enterOther_param(CustomLanguageParser.Other_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#other_param}.
	 * @param ctx the parse tree
	 */
	void exitOther_param(CustomLanguageParser.Other_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#init_param}.
	 * @param ctx the parse tree
	 */
	void enterInit_param(CustomLanguageParser.Init_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#init_param}.
	 * @param ctx the parse tree
	 */
	void exitInit_param(CustomLanguageParser.Init_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(CustomLanguageParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(CustomLanguageParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#other_var}.
	 * @param ctx the parse tree
	 */
	void enterOther_var(CustomLanguageParser.Other_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#other_var}.
	 * @param ctx the parse tree
	 */
	void exitOther_var(CustomLanguageParser.Other_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#init_var}.
	 * @param ctx the parse tree
	 */
	void enterInit_var(CustomLanguageParser.Init_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#init_var}.
	 * @param ctx the parse tree
	 */
	void exitInit_var(CustomLanguageParser.Init_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallerEqExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSmallerEqExp(CustomLanguageParser.SmallerEqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallerEqExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSmallerEqExp(CustomLanguageParser.SmallerEqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preincrementExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterPreincrementExp(CustomLanguageParser.PreincrementExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preincrementExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitPreincrementExp(CustomLanguageParser.PreincrementExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableAtomExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterVariableAtomExp(CustomLanguageParser.VariableAtomExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableAtomExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitVariableAtomExp(CustomLanguageParser.VariableAtomExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueAtomEXp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterValueAtomEXp(CustomLanguageParser.ValueAtomEXpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueAtomEXp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitValueAtomEXp(CustomLanguageParser.ValueAtomEXpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predecrementExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterPredecrementExp(CustomLanguageParser.PredecrementExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predecrementExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitPredecrementExp(CustomLanguageParser.PredecrementExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicNotExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterLogicNotExp(CustomLanguageParser.LogicNotExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicNotExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitLogicNotExp(CustomLanguageParser.LogicNotExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExp(CustomLanguageParser.FunctionCallExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExp(CustomLanguageParser.FunctionCallExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postdecrementExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterPostdecrementExp(CustomLanguageParser.PostdecrementExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postdecrementExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitPostdecrementExp(CustomLanguageParser.PostdecrementExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moduloExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterModuloExp(CustomLanguageParser.ModuloExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moduloExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitModuloExp(CustomLanguageParser.ModuloExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterEqExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqExp(CustomLanguageParser.GreaterEqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterEqExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqExp(CustomLanguageParser.GreaterEqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallerExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSmallerExp(CustomLanguageParser.SmallerExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallerExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSmallerExp(CustomLanguageParser.SmallerExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterGreaterExp(CustomLanguageParser.GreaterExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitGreaterExp(CustomLanguageParser.GreaterExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicAndExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterLogicAndExp(CustomLanguageParser.LogicAndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicAndExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitLogicAndExp(CustomLanguageParser.LogicAndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicOrExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterLogicOrExp(CustomLanguageParser.LogicOrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicOrExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitLogicOrExp(CustomLanguageParser.LogicOrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paranhesisExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterParanhesisExp(CustomLanguageParser.ParanhesisExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paranhesisExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitParanhesisExp(CustomLanguageParser.ParanhesisExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSubtractExp(CustomLanguageParser.SubtractExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSubtractExp(CustomLanguageParser.SubtractExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sameValueExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSameValueExp(CustomLanguageParser.SameValueExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sameValueExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSameValueExp(CustomLanguageParser.SameValueExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code diffValueExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterDiffValueExp(CustomLanguageParser.DiffValueExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code diffValueExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitDiffValueExp(CustomLanguageParser.DiffValueExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExp(CustomLanguageParser.MultiplyExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExp(CustomLanguageParser.MultiplyExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterDivideExp(CustomLanguageParser.DivideExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitDivideExp(CustomLanguageParser.DivideExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aditionExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAditionExp(CustomLanguageParser.AditionExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aditionExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAditionExp(CustomLanguageParser.AditionExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postincrementExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterPostincrementExp(CustomLanguageParser.PostincrementExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postincrementExp}
	 * labeled alternative in {@link CustomLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitPostincrementExp(CustomLanguageParser.PostincrementExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#instruction_list}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_list(CustomLanguageParser.Instruction_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#instruction_list}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_list(CustomLanguageParser.Instruction_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#other_instructions}.
	 * @param ctx the parse tree
	 */
	void enterOther_instructions(CustomLanguageParser.Other_instructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#other_instructions}.
	 * @param ctx the parse tree
	 */
	void exitOther_instructions(CustomLanguageParser.Other_instructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(CustomLanguageParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(CustomLanguageParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(CustomLanguageParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(CustomLanguageParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#data_value}.
	 * @param ctx the parse tree
	 */
	void enterData_value(CustomLanguageParser.Data_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#data_value}.
	 * @param ctx the parse tree
	 */
	void exitData_value(CustomLanguageParser.Data_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CustomLanguageParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(CustomLanguageParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CustomLanguageParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(CustomLanguageParser.NameContext ctx);
}