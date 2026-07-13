// Generated from C:/Users/DELL/Desktop/Compiler2025-Team27/src/antlr/WebTemplateParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WebTemplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WebTemplateParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code DocumentRoot}
	 * labeled alternative in {@link WebTemplateParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumentRoot(WebTemplateParser.DocumentRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementHtml}
	 * labeled alternative in {@link WebTemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementHtml(WebTemplateParser.ElementHtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementCss}
	 * labeled alternative in {@link WebTemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementCss(WebTemplateParser.ElementCssContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementJinja}
	 * labeled alternative in {@link WebTemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementJinja(WebTemplateParser.ElementJinjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementText}
	 * labeled alternative in {@link WebTemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementText(WebTemplateParser.ElementTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElementVoid}
	 * labeled alternative in {@link WebTemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementVoid(WebTemplateParser.HtmlElementVoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElementContainer}
	 * labeled alternative in {@link WebTemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementContainer(WebTemplateParser.HtmlElementContainerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElementSelfClosing}
	 * labeled alternative in {@link WebTemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementSelfClosing(WebTemplateParser.HtmlElementSelfClosingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlVoidTagFull}
	 * labeled alternative in {@link WebTemplateParser#htmlVoidTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlVoidTagFull(WebTemplateParser.HtmlVoidTagFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlOpenTagFull}
	 * labeled alternative in {@link WebTemplateParser#htmlOpenTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlOpenTagFull(WebTemplateParser.HtmlOpenTagFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlSelfClosingTagFull}
	 * labeled alternative in {@link WebTemplateParser#htmlSelfCloseTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSelfClosingTagFull(WebTemplateParser.HtmlSelfClosingTagFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlCloseTagFull}
	 * labeled alternative in {@link WebTemplateParser#htmlCloseTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCloseTagFull(WebTemplateParser.HtmlCloseTagFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAttributeWithValue}
	 * labeled alternative in {@link WebTemplateParser#tagAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeWithValue(WebTemplateParser.HtmlAttributeWithValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAttributeBoolean}
	 * labeled alternative in {@link WebTemplateParser#tagAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributeBoolean(WebTemplateParser.HtmlAttributeBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrValueDouble}
	 * labeled alternative in {@link WebTemplateParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrValueDouble(WebTemplateParser.AttrValueDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrValueSingle}
	 * labeled alternative in {@link WebTemplateParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrValueSingle(WebTemplateParser.AttrValueSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrValueUnquoted}
	 * labeled alternative in {@link WebTemplateParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrValueUnquoted(WebTemplateParser.AttrValueUnquotedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBlockWithContent}
	 * labeled alternative in {@link WebTemplateParser#cssBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlockWithContent(WebTemplateParser.CssBlockWithContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBlockSelfClosed}
	 * labeled alternative in {@link WebTemplateParser#cssBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlockSelfClosed(WebTemplateParser.CssBlockSelfClosedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleAttributeWithValue}
	 * labeled alternative in {@link WebTemplateParser#styleAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleAttributeWithValue(WebTemplateParser.StyleAttributeWithValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleAttributeBoolean}
	 * labeled alternative in {@link WebTemplateParser#styleAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleAttributeBoolean(WebTemplateParser.StyleAttributeBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssRuleStandard}
	 * labeled alternative in {@link WebTemplateParser#cssRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssRuleStandard(WebTemplateParser.CssRuleStandardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssMediaRuleFull}
	 * labeled alternative in {@link WebTemplateParser#mediaRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaRuleFull(WebTemplateParser.CssMediaRuleFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssMediaCondition}
	 * labeled alternative in {@link WebTemplateParser#mediaCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssMediaCondition(WebTemplateParser.CssMediaConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MediaCondIdent}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaCondIdent(WebTemplateParser.MediaCondIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MediaCondNumber}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaCondNumber(WebTemplateParser.MediaCondNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MediaCondPercentage}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaCondPercentage(WebTemplateParser.MediaCondPercentageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MediaCondDimension}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaCondDimension(WebTemplateParser.MediaCondDimensionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MediaCondColon}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaCondColon(WebTemplateParser.MediaCondColonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MediaCondComma}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaCondComma(WebTemplateParser.MediaCondCommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MediaCondLParen}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaCondLParen(WebTemplateParser.MediaCondLParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MediaCondRParen}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaCondRParen(WebTemplateParser.MediaCondRParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MediaCondDot}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaCondDot(WebTemplateParser.MediaCondDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MediaCondHash}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaCondHash(WebTemplateParser.MediaCondHashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssSelectorList}
	 * labeled alternative in {@link WebTemplateParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelectorList(WebTemplateParser.CssSelectorListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssSelectorSequence}
	 * labeled alternative in {@link WebTemplateParser#selectorItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelectorSequence(WebTemplateParser.CssSelectorSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssCompoundSelector}
	 * labeled alternative in {@link WebTemplateParser#compoundSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCompoundSelector(WebTemplateParser.CssCompoundSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssTypeSelector}
	 * labeled alternative in {@link WebTemplateParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssTypeSelector(WebTemplateParser.CssTypeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssClassSelector}
	 * labeled alternative in {@link WebTemplateParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssClassSelector(WebTemplateParser.CssClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssIdSelector}
	 * labeled alternative in {@link WebTemplateParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssIdSelector(WebTemplateParser.CssIdSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssPseudoClass}
	 * labeled alternative in {@link WebTemplateParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssPseudoClass(WebTemplateParser.CssPseudoClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssUniversalSelector}
	 * labeled alternative in {@link WebTemplateParser#simpleSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssUniversalSelector(WebTemplateParser.CssUniversalSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssDeclarationFull}
	 * labeled alternative in {@link WebTemplateParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclarationFull(WebTemplateParser.CssDeclarationFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueIdent}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueIdent(WebTemplateParser.CssValueIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueNumber}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueNumber(WebTemplateParser.CssValueNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValuePercentage}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValuePercentage(WebTemplateParser.CssValuePercentageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueDimension}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueDimension(WebTemplateParser.CssValueDimensionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueString}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueString(WebTemplateParser.CssValueStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueHexColor}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueHexColor(WebTemplateParser.CssValueHexColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueHash}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueHash(WebTemplateParser.CssValueHashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueUrl}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueUrl(WebTemplateParser.CssValueUrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueLParen}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueLParen(WebTemplateParser.CssValueLParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueRParen}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueRParen(WebTemplateParser.CssValueRParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueComma}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueComma(WebTemplateParser.CssValueCommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueDot}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueDot(WebTemplateParser.CssValueDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueSlash}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueSlash(WebTemplateParser.CssValueSlashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueImportant}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueImportant(WebTemplateParser.CssValueImportantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaBlockIf}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlockIf(WebTemplateParser.JinjaBlockIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaBlockFor}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlockFor(WebTemplateParser.JinjaBlockForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaBlockSet}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlockSet(WebTemplateParser.JinjaBlockSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaBlockDefinitionNode}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlockDefinitionNode(WebTemplateParser.JinjaBlockDefinitionNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaBlockExpr}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlockExpr(WebTemplateParser.JinjaBlockExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaBlockComment}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlockComment(WebTemplateParser.JinjaBlockCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaIfFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfFull(WebTemplateParser.JinjaIfFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaElifFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaElif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaElifFull(WebTemplateParser.JinjaElifFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaElseFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaElseFull(WebTemplateParser.JinjaElseFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaForFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForFull(WebTemplateParser.JinjaForFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaForTargetList}
	 * labeled alternative in {@link WebTemplateParser#forTargetList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForTargetList(WebTemplateParser.JinjaForTargetListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaSetFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaSetFull(WebTemplateParser.JinjaSetFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaBlockFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlockFull(WebTemplateParser.JinjaBlockFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaExpressionFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpressionFull(WebTemplateParser.JinjaExpressionFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaCommentFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCommentFull(WebTemplateParser.JinjaCommentFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprRoot}
	 * labeled alternative in {@link WebTemplateParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRoot(WebTemplateParser.ExprRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link WebTemplateParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(WebTemplateParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link WebTemplateParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(WebTemplateParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link WebTemplateParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(WebTemplateParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprComparisonRoot}
	 * labeled alternative in {@link WebTemplateParser#notExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComparisonRoot(WebTemplateParser.ExprComparisonRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprComparison}
	 * labeled alternative in {@link WebTemplateParser#comparisonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComparison(WebTemplateParser.ExprComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpCompareJinja}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpCompareJinja(WebTemplateParser.OpCompareJinjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpCompareStmt}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpCompareStmt(WebTemplateParser.OpCompareStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpInJinja}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpInJinja(WebTemplateParser.OpInJinjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpInStmt}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpInStmt(WebTemplateParser.OpInStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpIs}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpIs(WebTemplateParser.OpIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpNotIn}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpNotIn(WebTemplateParser.OpNotInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link WebTemplateParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdd(WebTemplateParser.ExprAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMul}
	 * labeled alternative in {@link WebTemplateParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMul(WebTemplateParser.ExprMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link WebTemplateParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnary(WebTemplateParser.ExprUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPostfixRoot}
	 * labeled alternative in {@link WebTemplateParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPostfixRoot(WebTemplateParser.ExprPostfixRootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPostfix}
	 * labeled alternative in {@link WebTemplateParser#postfixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPostfix(WebTemplateParser.ExprPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomNumberJinja}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNumberJinja(WebTemplateParser.AtomNumberJinjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomNumberStmt}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNumberStmt(WebTemplateParser.AtomNumberStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomStringJinja}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomStringJinja(WebTemplateParser.AtomStringJinjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomStringStmt}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomStringStmt(WebTemplateParser.AtomStringStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomIdJinja}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomIdJinja(WebTemplateParser.AtomIdJinjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomIdStmt}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomIdStmt(WebTemplateParser.AtomIdStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomParen}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomParen(WebTemplateParser.AtomParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuffixAttribute}
	 * labeled alternative in {@link WebTemplateParser#postfixSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffixAttribute(WebTemplateParser.SuffixAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuffixIndex}
	 * labeled alternative in {@link WebTemplateParser#postfixSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffixIndex(WebTemplateParser.SuffixIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuffixCall}
	 * labeled alternative in {@link WebTemplateParser#postfixSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffixCall(WebTemplateParser.SuffixCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SuffixFilter}
	 * labeled alternative in {@link WebTemplateParser#postfixSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuffixFilter(WebTemplateParser.SuffixFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgNamedJinja}
	 * labeled alternative in {@link WebTemplateParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgNamedJinja(WebTemplateParser.ArgNamedJinjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgNamedStmt}
	 * labeled alternative in {@link WebTemplateParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgNamedStmt(WebTemplateParser.ArgNamedStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArgPositional}
	 * labeled alternative in {@link WebTemplateParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgPositional(WebTemplateParser.ArgPositionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprListFull}
	 * labeled alternative in {@link WebTemplateParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprListFull(WebTemplateParser.ExprListFullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextNodeFull}
	 * labeled alternative in {@link WebTemplateParser#textNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextNodeFull(WebTemplateParser.TextNodeFullContext ctx);
}