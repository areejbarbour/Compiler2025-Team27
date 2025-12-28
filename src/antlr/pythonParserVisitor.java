// Generated from C:/Users/DELL/Documents/Compiler2025-Team27-main/src/antlr/pythonParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pythonParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(pythonParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(pythonParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStmt(pythonParser.CallStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefStmt(pythonParser.DefStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecorateStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorateStmt(pythonParser.DecorateStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(pythonParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(pythonParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(pythonParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(pythonParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link pythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(pythonParser.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(pythonParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(pythonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(pythonParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#dict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict(pythonParser.DictContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#keyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValue(pythonParser.KeyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#callFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunc(pythonParser.CallFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#defFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefFunction(pythonParser.DefFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#decorate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorate(pythonParser.DecorateContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(pythonParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(pythonParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(pythonParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#elif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif(pythonParser.ElifContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(pythonParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonCondition(pythonParser.ComparisonConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsNotNoneCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNotNoneCondition(pythonParser.IsNotNoneConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseCondition(pythonParser.FalseConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsNoneCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNoneCondition(pythonParser.IsNoneConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueCondition(pythonParser.TrueConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCondition(pythonParser.OrConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link pythonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCondition(pythonParser.AndConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(pythonParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(pythonParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(pythonParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#loopIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopIf(pythonParser.LoopIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#loopElif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopElif(pythonParser.LoopElifContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#loopElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopElse(pythonParser.LoopElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#loopBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopBlock(pythonParser.LoopBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#loopStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStmt(pythonParser.LoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(pythonParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(pythonParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(pythonParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(pythonParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NONE}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNONE(pythonParser.NONEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID(pythonParser.IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexAccess}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAccess(pythonParser.IndexAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dictValue}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictValue(pythonParser.DictValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listValue}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListValue(pythonParser.ListValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callFunclabel}
	 * labeled alternative in {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunclabel(pythonParser.CallFunclabelContext ctx);
}