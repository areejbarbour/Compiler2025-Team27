// Generated from C:/Users/DELL/Documents/Compiler2025-Team27-main/src/antlr/pythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pythonParser}.
 */
public interface pythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pythonParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(pythonParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(pythonParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(pythonParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(pythonParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallStmt(pythonParser.CallStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallStmt(pythonParser.CallStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDefStmt(pythonParser.DefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDefStmt(pythonParser.DefStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecorateStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDecorateStmt(pythonParser.DecorateStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecorateStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDecorateStmt(pythonParser.DecorateStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(pythonParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(pythonParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(pythonParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(pythonParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(pythonParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(pythonParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(pythonParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(pythonParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmt(pythonParser.EmptyStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmt(pythonParser.EmptyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(pythonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(pythonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(pythonParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(pythonParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(pythonParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(pythonParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dict}.
	 * @param ctx the parse tree
	 */
	void enterDict(pythonParser.DictContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dict}.
	 * @param ctx the parse tree
	 */
	void exitDict(pythonParser.DictContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void enterKeyValue(pythonParser.KeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void exitKeyValue(pythonParser.KeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void enterCallFunc(pythonParser.CallFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void exitCallFunc(pythonParser.CallFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#defFunction}.
	 * @param ctx the parse tree
	 */
	void enterDefFunction(pythonParser.DefFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#defFunction}.
	 * @param ctx the parse tree
	 */
	void exitDefFunction(pythonParser.DefFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#decorate}.
	 * @param ctx the parse tree
	 */
	void enterDecorate(pythonParser.DecorateContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#decorate}.
	 * @param ctx the parse tree
	 */
	void exitDecorate(pythonParser.DecorateContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(pythonParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(pythonParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(pythonParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(pythonParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(pythonParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(pythonParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#elif}.
	 * @param ctx the parse tree
	 */
	void enterElif(pythonParser.ElifContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#elif}.
	 * @param ctx the parse tree
	 */
	void exitElif(pythonParser.ElifContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(pythonParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(pythonParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterComparisonCondition(pythonParser.ComparisonConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitComparisonCondition(pythonParser.ComparisonConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsNotNoneCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterIsNotNoneCondition(pythonParser.IsNotNoneConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsNotNoneCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitIsNotNoneCondition(pythonParser.IsNotNoneConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterFalseCondition(pythonParser.FalseConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitFalseCondition(pythonParser.FalseConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsNoneCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterIsNoneCondition(pythonParser.IsNoneConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsNoneCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitIsNoneCondition(pythonParser.IsNoneConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterTrueCondition(pythonParser.TrueConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitTrueCondition(pythonParser.TrueConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOrCondition(pythonParser.OrConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOrCondition(pythonParser.OrConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAndCondition(pythonParser.AndConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAndCondition(pythonParser.AndConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(pythonParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(pythonParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(pythonParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(pythonParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(pythonParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(pythonParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#loopIf}.
	 * @param ctx the parse tree
	 */
	void enterLoopIf(pythonParser.LoopIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#loopIf}.
	 * @param ctx the parse tree
	 */
	void exitLoopIf(pythonParser.LoopIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#loopElif}.
	 * @param ctx the parse tree
	 */
	void enterLoopElif(pythonParser.LoopElifContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#loopElif}.
	 * @param ctx the parse tree
	 */
	void exitLoopElif(pythonParser.LoopElifContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#loopElse}.
	 * @param ctx the parse tree
	 */
	void enterLoopElse(pythonParser.LoopElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#loopElse}.
	 * @param ctx the parse tree
	 */
	void exitLoopElse(pythonParser.LoopElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void enterLoopBlock(pythonParser.LoopBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#loopBlock}.
	 * @param ctx the parse tree
	 */
	void exitLoopBlock(pythonParser.LoopBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoopStmt(pythonParser.LoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoopStmt(pythonParser.LoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDouble(pythonParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDouble(pythonParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInteger(pythonParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInteger(pythonParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(pythonParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(pythonParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBool(pythonParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBool(pythonParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NONE}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNONE(pythonParser.NONEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NONE}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNONE(pythonParser.NONEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterID(pythonParser.IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitID(pythonParser.IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexAccess}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIndexAccess(pythonParser.IndexAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexAccess}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIndexAccess(pythonParser.IndexAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dictValue}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDictValue(pythonParser.DictValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dictValue}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDictValue(pythonParser.DictValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listValue}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListValue(pythonParser.ListValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listValue}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListValue(pythonParser.ListValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callFunclabel}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallFunclabel(pythonParser.CallFunclabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callFunclabel}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallFunclabel(pythonParser.CallFunclabelContext ctx);
}