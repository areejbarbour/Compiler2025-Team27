// Generated from C:/Users/DELL/Documents/Compiler2025-Team27-main/src/antlr/WebTemplateParser.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by the {@code DocumentRootNode}
	 * labeled alternative in {@link WebTemplateParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumentRootNode(WebTemplateParser.DocumentRootNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementHtmlNode}
	 * labeled alternative in {@link WebTemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementHtmlNode(WebTemplateParser.ElementHtmlNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementCssNode}
	 * labeled alternative in {@link WebTemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementCssNode(WebTemplateParser.ElementCssNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementJinjaNode}
	 * labeled alternative in {@link WebTemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementJinjaNode(WebTemplateParser.ElementJinjaNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementTextNode}
	 * labeled alternative in {@link WebTemplateParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementTextNode(WebTemplateParser.ElementTextNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElementNode}
	 * labeled alternative in {@link WebTemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementNode(WebTemplateParser.HtmlElementNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlSelfClosingNode}
	 * labeled alternative in {@link WebTemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSelfClosingNode(WebTemplateParser.HtmlSelfClosingNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlOpenDivNode}
	 * labeled alternative in {@link WebTemplateParser#htmlOpenTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlOpenDivNode(WebTemplateParser.HtmlOpenDivNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlOpenSpanNode}
	 * labeled alternative in {@link WebTemplateParser#htmlOpenTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlOpenSpanNode(WebTemplateParser.HtmlOpenSpanNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlOpenPNode}
	 * labeled alternative in {@link WebTemplateParser#htmlOpenTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlOpenPNode(WebTemplateParser.HtmlOpenPNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlOpenH1Node}
	 * labeled alternative in {@link WebTemplateParser#htmlOpenTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlOpenH1Node(WebTemplateParser.HtmlOpenH1NodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlOpenH2Node}
	 * labeled alternative in {@link WebTemplateParser#htmlOpenTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlOpenH2Node(WebTemplateParser.HtmlOpenH2NodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlOpenButtonNode}
	 * labeled alternative in {@link WebTemplateParser#htmlOpenTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlOpenButtonNode(WebTemplateParser.HtmlOpenButtonNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlSelfCloseImgNode}
	 * labeled alternative in {@link WebTemplateParser#htmlSelfClose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSelfCloseImgNode(WebTemplateParser.HtmlSelfCloseImgNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlSelfCloseInputNode}
	 * labeled alternative in {@link WebTemplateParser#htmlSelfClose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSelfCloseInputNode(WebTemplateParser.HtmlSelfCloseInputNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlCloseTagNode}
	 * labeled alternative in {@link WebTemplateParser#htmlCloseTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCloseTagNode(WebTemplateParser.HtmlCloseTagNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrNamedNode}
	 * labeled alternative in {@link WebTemplateParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrNamedNode(WebTemplateParser.AttrNamedNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrTextNode}
	 * labeled alternative in {@link WebTemplateParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrTextNode(WebTemplateParser.AttrTextNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrValueDoubleQuotedNode}
	 * labeled alternative in {@link WebTemplateParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrValueDoubleQuotedNode(WebTemplateParser.AttrValueDoubleQuotedNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrValueSingleQuotedNode}
	 * labeled alternative in {@link WebTemplateParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrValueSingleQuotedNode(WebTemplateParser.AttrValueSingleQuotedNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrValueUnquotedNode}
	 * labeled alternative in {@link WebTemplateParser#attrValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrValueUnquotedNode(WebTemplateParser.AttrValueUnquotedNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBlockNode}
	 * labeled alternative in {@link WebTemplateParser#cssBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlockNode(WebTemplateParser.CssBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssOpenBraceNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssOpenBraceNode(WebTemplateParser.CssOpenBraceNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssCloseBraceNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCloseBraceNode(WebTemplateParser.CssCloseBraceNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssColonNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssColonNode(WebTemplateParser.CssColonNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssSemiNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSemiNode(WebTemplateParser.CssSemiNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssCommaNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCommaNode(WebTemplateParser.CssCommaNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssParenOpenNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssParenOpenNode(WebTemplateParser.CssParenOpenNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssParenCloseNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssParenCloseNode(WebTemplateParser.CssParenCloseNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssCombinatorNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCombinatorNode(WebTemplateParser.CssCombinatorNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssSelIdNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelIdNode(WebTemplateParser.CssSelIdNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssSelClassNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelClassNode(WebTemplateParser.CssSelClassNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssAttrSelectorNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssAttrSelectorNode(WebTemplateParser.CssAttrSelectorNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssPseudoNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssPseudoNode(WebTemplateParser.CssPseudoNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssAtRuleNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssAtRuleNode(WebTemplateParser.CssAtRuleNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssIdentNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssIdentNode(WebTemplateParser.CssIdentNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssNumberNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssNumberNode(WebTemplateParser.CssNumberNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssPercentageNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssPercentageNode(WebTemplateParser.CssPercentageNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssDimensionNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDimensionNode(WebTemplateParser.CssDimensionNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssHashColorNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssHashColorNode(WebTemplateParser.CssHashColorNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssStringDoubleNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStringDoubleNode(WebTemplateParser.CssStringDoubleNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssStringSingleNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStringSingleNode(WebTemplateParser.CssStringSingleNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssUrlNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssUrlNode(WebTemplateParser.CssUrlNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssFunctionNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssFunctionNode(WebTemplateParser.CssFunctionNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssOtherNode}
	 * labeled alternative in {@link WebTemplateParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssOtherNode(WebTemplateParser.CssOtherNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaIfBlockNode}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfBlockNode(WebTemplateParser.JinjaIfBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaForBlockNode}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForBlockNode(WebTemplateParser.JinjaForBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaGenericBlockNode}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaGenericBlockNode(WebTemplateParser.JinjaGenericBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaExprBlockNode}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExprBlockNode(WebTemplateParser.JinjaExprBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaCommentBlockNode}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCommentBlockNode(WebTemplateParser.JinjaCommentBlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaIfNode}
	 * labeled alternative in {@link WebTemplateParser#jinjaIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfNode(WebTemplateParser.JinjaIfNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaElifNode}
	 * labeled alternative in {@link WebTemplateParser#jinjaElif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaElifNode(WebTemplateParser.JinjaElifNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaElseNode}
	 * labeled alternative in {@link WebTemplateParser#jinjaElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaElseNode(WebTemplateParser.JinjaElseNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaForNode}
	 * labeled alternative in {@link WebTemplateParser#jinjaFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForNode(WebTemplateParser.JinjaForNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaGenericStmtNode}
	 * labeled alternative in {@link WebTemplateParser#genericJinjaStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaGenericStmtNode(WebTemplateParser.JinjaGenericStmtNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaExprNode}
	 * labeled alternative in {@link WebTemplateParser#jinjaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExprNode(WebTemplateParser.JinjaExprNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaCommentNode}
	 * labeled alternative in {@link WebTemplateParser#jinjaComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCommentNode(WebTemplateParser.JinjaCommentNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextContentNode}
	 * labeled alternative in {@link WebTemplateParser#textNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextContentNode(WebTemplateParser.TextContentNodeContext ctx);
}