// Generated from C:/Users/DELL/Documents/Compiler2025-Team27-main/src/antlr/WebTemplateParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WebTemplateParser}.
 */
public interface WebTemplateParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code DocumentRoot}
	 * labeled alternative in {@link WebTemplateParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocumentRoot(WebTemplateParser.DocumentRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DocumentRoot}
	 * labeled alternative in {@link WebTemplateParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocumentRoot(WebTemplateParser.DocumentRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementHtml}
	 * labeled alternative in {@link WebTemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementHtml(WebTemplateParser.ElementHtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementHtml}
	 * labeled alternative in {@link WebTemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementHtml(WebTemplateParser.ElementHtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementCss}
	 * labeled alternative in {@link WebTemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementCss(WebTemplateParser.ElementCssContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementCss}
	 * labeled alternative in {@link WebTemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementCss(WebTemplateParser.ElementCssContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementJinja}
	 * labeled alternative in {@link WebTemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementJinja(WebTemplateParser.ElementJinjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementJinja}
	 * labeled alternative in {@link WebTemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementJinja(WebTemplateParser.ElementJinjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementText}
	 * labeled alternative in {@link WebTemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElementText(WebTemplateParser.ElementTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementText}
	 * labeled alternative in {@link WebTemplateParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElementText(WebTemplateParser.ElementTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElementVoid}
	 * labeled alternative in {@link WebTemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementVoid(WebTemplateParser.HtmlElementVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElementVoid}
	 * labeled alternative in {@link WebTemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementVoid(WebTemplateParser.HtmlElementVoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElementContainer}
	 * labeled alternative in {@link WebTemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementContainer(WebTemplateParser.HtmlElementContainerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElementContainer}
	 * labeled alternative in {@link WebTemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementContainer(WebTemplateParser.HtmlElementContainerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElementSelfClosing}
	 * labeled alternative in {@link WebTemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementSelfClosing(WebTemplateParser.HtmlElementSelfClosingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElementSelfClosing}
	 * labeled alternative in {@link WebTemplateParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementSelfClosing(WebTemplateParser.HtmlElementSelfClosingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlVoidTagFull}
	 * labeled alternative in {@link WebTemplateParser#htmlVoidTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlVoidTagFull(WebTemplateParser.HtmlVoidTagFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlVoidTagFull}
	 * labeled alternative in {@link WebTemplateParser#htmlVoidTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlVoidTagFull(WebTemplateParser.HtmlVoidTagFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlOpenTagFull}
	 * labeled alternative in {@link WebTemplateParser#htmlOpenTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlOpenTagFull(WebTemplateParser.HtmlOpenTagFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlOpenTagFull}
	 * labeled alternative in {@link WebTemplateParser#htmlOpenTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlOpenTagFull(WebTemplateParser.HtmlOpenTagFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlSelfClosingTagFull}
	 * labeled alternative in {@link WebTemplateParser#htmlSelfCloseTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSelfClosingTagFull(WebTemplateParser.HtmlSelfClosingTagFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlSelfClosingTagFull}
	 * labeled alternative in {@link WebTemplateParser#htmlSelfCloseTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSelfClosingTagFull(WebTemplateParser.HtmlSelfClosingTagFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlCloseTagFull}
	 * labeled alternative in {@link WebTemplateParser#htmlCloseTag}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCloseTagFull(WebTemplateParser.HtmlCloseTagFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlCloseTagFull}
	 * labeled alternative in {@link WebTemplateParser#htmlCloseTag}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCloseTagFull(WebTemplateParser.HtmlCloseTagFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAttributeWithValue}
	 * labeled alternative in {@link WebTemplateParser#tagAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeWithValue(WebTemplateParser.HtmlAttributeWithValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttributeWithValue}
	 * labeled alternative in {@link WebTemplateParser#tagAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeWithValue(WebTemplateParser.HtmlAttributeWithValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAttributeBoolean}
	 * labeled alternative in {@link WebTemplateParser#tagAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributeBoolean(WebTemplateParser.HtmlAttributeBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttributeBoolean}
	 * labeled alternative in {@link WebTemplateParser#tagAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributeBoolean(WebTemplateParser.HtmlAttributeBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrValueDouble}
	 * labeled alternative in {@link WebTemplateParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrValueDouble(WebTemplateParser.AttrValueDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrValueDouble}
	 * labeled alternative in {@link WebTemplateParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrValueDouble(WebTemplateParser.AttrValueDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrValueSingle}
	 * labeled alternative in {@link WebTemplateParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrValueSingle(WebTemplateParser.AttrValueSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrValueSingle}
	 * labeled alternative in {@link WebTemplateParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrValueSingle(WebTemplateParser.AttrValueSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrValueUnquoted}
	 * labeled alternative in {@link WebTemplateParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void enterAttrValueUnquoted(WebTemplateParser.AttrValueUnquotedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrValueUnquoted}
	 * labeled alternative in {@link WebTemplateParser#attrValue}.
	 * @param ctx the parse tree
	 */
	void exitAttrValueUnquoted(WebTemplateParser.AttrValueUnquotedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBlockWithContent}
	 * labeled alternative in {@link WebTemplateParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void enterCssBlockWithContent(WebTemplateParser.CssBlockWithContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBlockWithContent}
	 * labeled alternative in {@link WebTemplateParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void exitCssBlockWithContent(WebTemplateParser.CssBlockWithContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBlockSelfClosed}
	 * labeled alternative in {@link WebTemplateParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void enterCssBlockSelfClosed(WebTemplateParser.CssBlockSelfClosedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBlockSelfClosed}
	 * labeled alternative in {@link WebTemplateParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void exitCssBlockSelfClosed(WebTemplateParser.CssBlockSelfClosedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleAttributeWithValue}
	 * labeled alternative in {@link WebTemplateParser#styleAttribute}.
	 * @param ctx the parse tree
	 */
	void enterStyleAttributeWithValue(WebTemplateParser.StyleAttributeWithValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleAttributeWithValue}
	 * labeled alternative in {@link WebTemplateParser#styleAttribute}.
	 * @param ctx the parse tree
	 */
	void exitStyleAttributeWithValue(WebTemplateParser.StyleAttributeWithValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleAttributeBoolean}
	 * labeled alternative in {@link WebTemplateParser#styleAttribute}.
	 * @param ctx the parse tree
	 */
	void enterStyleAttributeBoolean(WebTemplateParser.StyleAttributeBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleAttributeBoolean}
	 * labeled alternative in {@link WebTemplateParser#styleAttribute}.
	 * @param ctx the parse tree
	 */
	void exitStyleAttributeBoolean(WebTemplateParser.StyleAttributeBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssRuleStandard}
	 * labeled alternative in {@link WebTemplateParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRuleStandard(WebTemplateParser.CssRuleStandardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssRuleStandard}
	 * labeled alternative in {@link WebTemplateParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRuleStandard(WebTemplateParser.CssRuleStandardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssMediaRuleFull}
	 * labeled alternative in {@link WebTemplateParser#mediaRule}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaRuleFull(WebTemplateParser.CssMediaRuleFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssMediaRuleFull}
	 * labeled alternative in {@link WebTemplateParser#mediaRule}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaRuleFull(WebTemplateParser.CssMediaRuleFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssMediaCondition}
	 * labeled alternative in {@link WebTemplateParser#mediaCondition}.
	 * @param ctx the parse tree
	 */
	void enterCssMediaCondition(WebTemplateParser.CssMediaConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssMediaCondition}
	 * labeled alternative in {@link WebTemplateParser#mediaCondition}.
	 * @param ctx the parse tree
	 */
	void exitCssMediaCondition(WebTemplateParser.CssMediaConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MediaCondIdent}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void enterMediaCondIdent(WebTemplateParser.MediaCondIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MediaCondIdent}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void exitMediaCondIdent(WebTemplateParser.MediaCondIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MediaCondNumber}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void enterMediaCondNumber(WebTemplateParser.MediaCondNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MediaCondNumber}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void exitMediaCondNumber(WebTemplateParser.MediaCondNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MediaCondPercentage}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void enterMediaCondPercentage(WebTemplateParser.MediaCondPercentageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MediaCondPercentage}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void exitMediaCondPercentage(WebTemplateParser.MediaCondPercentageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MediaCondDimension}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void enterMediaCondDimension(WebTemplateParser.MediaCondDimensionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MediaCondDimension}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void exitMediaCondDimension(WebTemplateParser.MediaCondDimensionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MediaCondColon}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void enterMediaCondColon(WebTemplateParser.MediaCondColonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MediaCondColon}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void exitMediaCondColon(WebTemplateParser.MediaCondColonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MediaCondComma}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void enterMediaCondComma(WebTemplateParser.MediaCondCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MediaCondComma}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void exitMediaCondComma(WebTemplateParser.MediaCondCommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MediaCondLParen}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void enterMediaCondLParen(WebTemplateParser.MediaCondLParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MediaCondLParen}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void exitMediaCondLParen(WebTemplateParser.MediaCondLParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MediaCondRParen}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void enterMediaCondRParen(WebTemplateParser.MediaCondRParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MediaCondRParen}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void exitMediaCondRParen(WebTemplateParser.MediaCondRParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MediaCondDot}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void enterMediaCondDot(WebTemplateParser.MediaCondDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MediaCondDot}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void exitMediaCondDot(WebTemplateParser.MediaCondDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MediaCondHash}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void enterMediaCondHash(WebTemplateParser.MediaCondHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MediaCondHash}
	 * labeled alternative in {@link WebTemplateParser#mediaConditionPart}.
	 * @param ctx the parse tree
	 */
	void exitMediaCondHash(WebTemplateParser.MediaCondHashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssSelectorList}
	 * labeled alternative in {@link WebTemplateParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelectorList(WebTemplateParser.CssSelectorListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssSelectorList}
	 * labeled alternative in {@link WebTemplateParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelectorList(WebTemplateParser.CssSelectorListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssSelectorSequence}
	 * labeled alternative in {@link WebTemplateParser#selectorItem}.
	 * @param ctx the parse tree
	 */
	void enterCssSelectorSequence(WebTemplateParser.CssSelectorSequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssSelectorSequence}
	 * labeled alternative in {@link WebTemplateParser#selectorItem}.
	 * @param ctx the parse tree
	 */
	void exitCssSelectorSequence(WebTemplateParser.CssSelectorSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssCompoundSelector}
	 * labeled alternative in {@link WebTemplateParser#compoundSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssCompoundSelector(WebTemplateParser.CssCompoundSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssCompoundSelector}
	 * labeled alternative in {@link WebTemplateParser#compoundSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssCompoundSelector(WebTemplateParser.CssCompoundSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssTypeSelector}
	 * labeled alternative in {@link WebTemplateParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssTypeSelector(WebTemplateParser.CssTypeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssTypeSelector}
	 * labeled alternative in {@link WebTemplateParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssTypeSelector(WebTemplateParser.CssTypeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssClassSelector}
	 * labeled alternative in {@link WebTemplateParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssClassSelector(WebTemplateParser.CssClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssClassSelector}
	 * labeled alternative in {@link WebTemplateParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssClassSelector(WebTemplateParser.CssClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssIdSelector}
	 * labeled alternative in {@link WebTemplateParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssIdSelector(WebTemplateParser.CssIdSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssIdSelector}
	 * labeled alternative in {@link WebTemplateParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssIdSelector(WebTemplateParser.CssIdSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssPseudoClass}
	 * labeled alternative in {@link WebTemplateParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssPseudoClass(WebTemplateParser.CssPseudoClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssPseudoClass}
	 * labeled alternative in {@link WebTemplateParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssPseudoClass(WebTemplateParser.CssPseudoClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssUniversalSelector}
	 * labeled alternative in {@link WebTemplateParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssUniversalSelector(WebTemplateParser.CssUniversalSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssUniversalSelector}
	 * labeled alternative in {@link WebTemplateParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssUniversalSelector(WebTemplateParser.CssUniversalSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssDeclarationFull}
	 * labeled alternative in {@link WebTemplateParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclarationFull(WebTemplateParser.CssDeclarationFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssDeclarationFull}
	 * labeled alternative in {@link WebTemplateParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclarationFull(WebTemplateParser.CssDeclarationFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueIdent}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueIdent(WebTemplateParser.CssValueIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueIdent}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueIdent(WebTemplateParser.CssValueIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueNumber}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueNumber(WebTemplateParser.CssValueNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueNumber}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueNumber(WebTemplateParser.CssValueNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValuePercentage}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValuePercentage(WebTemplateParser.CssValuePercentageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValuePercentage}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValuePercentage(WebTemplateParser.CssValuePercentageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueDimension}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueDimension(WebTemplateParser.CssValueDimensionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueDimension}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueDimension(WebTemplateParser.CssValueDimensionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueString}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueString(WebTemplateParser.CssValueStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueString}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueString(WebTemplateParser.CssValueStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueHexColor}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueHexColor(WebTemplateParser.CssValueHexColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueHexColor}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueHexColor(WebTemplateParser.CssValueHexColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueHash}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueHash(WebTemplateParser.CssValueHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueHash}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueHash(WebTemplateParser.CssValueHashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueUrl}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueUrl(WebTemplateParser.CssValueUrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueUrl}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueUrl(WebTemplateParser.CssValueUrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueLParen}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueLParen(WebTemplateParser.CssValueLParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueLParen}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueLParen(WebTemplateParser.CssValueLParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueRParen}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueRParen(WebTemplateParser.CssValueRParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueRParen}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueRParen(WebTemplateParser.CssValueRParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueComma}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueComma(WebTemplateParser.CssValueCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueComma}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueComma(WebTemplateParser.CssValueCommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueDot}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueDot(WebTemplateParser.CssValueDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueDot}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueDot(WebTemplateParser.CssValueDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueSlash}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueSlash(WebTemplateParser.CssValueSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueSlash}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueSlash(WebTemplateParser.CssValueSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueImportant}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueImportant(WebTemplateParser.CssValueImportantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueImportant}
	 * labeled alternative in {@link WebTemplateParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueImportant(WebTemplateParser.CssValueImportantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaBlockIf}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockIf(WebTemplateParser.JinjaBlockIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaBlockIf}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockIf(WebTemplateParser.JinjaBlockIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaBlockFor}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockFor(WebTemplateParser.JinjaBlockForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaBlockFor}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockFor(WebTemplateParser.JinjaBlockForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaBlockSet}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockSet(WebTemplateParser.JinjaBlockSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaBlockSet}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockSet(WebTemplateParser.JinjaBlockSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaBlockDefinitionNode}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockDefinitionNode(WebTemplateParser.JinjaBlockDefinitionNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaBlockDefinitionNode}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockDefinitionNode(WebTemplateParser.JinjaBlockDefinitionNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaBlockExpr}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockExpr(WebTemplateParser.JinjaBlockExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaBlockExpr}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockExpr(WebTemplateParser.JinjaBlockExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaBlockComment}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockComment(WebTemplateParser.JinjaBlockCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaBlockComment}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockComment(WebTemplateParser.JinjaBlockCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaIfFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaIf}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIfFull(WebTemplateParser.JinjaIfFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaIfFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaIf}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIfFull(WebTemplateParser.JinjaIfFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaElifFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaElif}.
	 * @param ctx the parse tree
	 */
	void enterJinjaElifFull(WebTemplateParser.JinjaElifFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaElifFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaElif}.
	 * @param ctx the parse tree
	 */
	void exitJinjaElifFull(WebTemplateParser.JinjaElifFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaElseFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaElse}.
	 * @param ctx the parse tree
	 */
	void enterJinjaElseFull(WebTemplateParser.JinjaElseFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaElseFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaElse}.
	 * @param ctx the parse tree
	 */
	void exitJinjaElseFull(WebTemplateParser.JinjaElseFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaForFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaFor}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForFull(WebTemplateParser.JinjaForFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaForFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaFor}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForFull(WebTemplateParser.JinjaForFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaForTargetList}
	 * labeled alternative in {@link WebTemplateParser#forTargetList}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForTargetList(WebTemplateParser.JinjaForTargetListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaForTargetList}
	 * labeled alternative in {@link WebTemplateParser#forTargetList}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForTargetList(WebTemplateParser.JinjaForTargetListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaSetFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaSet}.
	 * @param ctx the parse tree
	 */
	void enterJinjaSetFull(WebTemplateParser.JinjaSetFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaSetFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaSet}.
	 * @param ctx the parse tree
	 */
	void exitJinjaSetFull(WebTemplateParser.JinjaSetFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaBlockFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockFull(WebTemplateParser.JinjaBlockFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaBlockFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockFull(WebTemplateParser.JinjaBlockFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExpressionFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpressionFull(WebTemplateParser.JinjaExpressionFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExpressionFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpressionFull(WebTemplateParser.JinjaExpressionFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaCommentFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaComment}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCommentFull(WebTemplateParser.JinjaCommentFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaCommentFull}
	 * labeled alternative in {@link WebTemplateParser#jinjaComment}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCommentFull(WebTemplateParser.JinjaCommentFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprRoot}
	 * labeled alternative in {@link WebTemplateParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprRoot(WebTemplateParser.ExprRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprRoot}
	 * labeled alternative in {@link WebTemplateParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprRoot(WebTemplateParser.ExprRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link WebTemplateParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(WebTemplateParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link WebTemplateParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(WebTemplateParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link WebTemplateParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(WebTemplateParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link WebTemplateParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(WebTemplateParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link WebTemplateParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(WebTemplateParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link WebTemplateParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(WebTemplateParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprComparisonRoot}
	 * labeled alternative in {@link WebTemplateParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprComparisonRoot(WebTemplateParser.ExprComparisonRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprComparisonRoot}
	 * labeled alternative in {@link WebTemplateParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprComparisonRoot(WebTemplateParser.ExprComparisonRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprComparison}
	 * labeled alternative in {@link WebTemplateParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprComparison(WebTemplateParser.ExprComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprComparison}
	 * labeled alternative in {@link WebTemplateParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprComparison(WebTemplateParser.ExprComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpCompareJinja}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void enterOpCompareJinja(WebTemplateParser.OpCompareJinjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpCompareJinja}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void exitOpCompareJinja(WebTemplateParser.OpCompareJinjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpCompareStmt}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void enterOpCompareStmt(WebTemplateParser.OpCompareStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpCompareStmt}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void exitOpCompareStmt(WebTemplateParser.OpCompareStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpInJinja}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void enterOpInJinja(WebTemplateParser.OpInJinjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpInJinja}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void exitOpInJinja(WebTemplateParser.OpInJinjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpInStmt}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void enterOpInStmt(WebTemplateParser.OpInStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpInStmt}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void exitOpInStmt(WebTemplateParser.OpInStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpIs}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void enterOpIs(WebTemplateParser.OpIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpIs}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void exitOpIs(WebTemplateParser.OpIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpNotIn}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void enterOpNotIn(WebTemplateParser.OpNotInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpNotIn}
	 * labeled alternative in {@link WebTemplateParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void exitOpNotIn(WebTemplateParser.OpNotInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link WebTemplateParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(WebTemplateParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link WebTemplateParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(WebTemplateParser.ExprAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMul}
	 * labeled alternative in {@link WebTemplateParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprMul(WebTemplateParser.ExprMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMul}
	 * labeled alternative in {@link WebTemplateParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprMul(WebTemplateParser.ExprMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link WebTemplateParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(WebTemplateParser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link WebTemplateParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(WebTemplateParser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPostfixRoot}
	 * labeled alternative in {@link WebTemplateParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprPostfixRoot(WebTemplateParser.ExprPostfixRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPostfixRoot}
	 * labeled alternative in {@link WebTemplateParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprPostfixRoot(WebTemplateParser.ExprPostfixRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPostfix}
	 * labeled alternative in {@link WebTemplateParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprPostfix(WebTemplateParser.ExprPostfixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPostfix}
	 * labeled alternative in {@link WebTemplateParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprPostfix(WebTemplateParser.ExprPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomNumberJinja}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomNumberJinja(WebTemplateParser.AtomNumberJinjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomNumberJinja}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomNumberJinja(WebTemplateParser.AtomNumberJinjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomNumberStmt}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomNumberStmt(WebTemplateParser.AtomNumberStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomNumberStmt}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomNumberStmt(WebTemplateParser.AtomNumberStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomStringJinja}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomStringJinja(WebTemplateParser.AtomStringJinjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomStringJinja}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomStringJinja(WebTemplateParser.AtomStringJinjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomStringStmt}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomStringStmt(WebTemplateParser.AtomStringStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomStringStmt}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomStringStmt(WebTemplateParser.AtomStringStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomIdJinja}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomIdJinja(WebTemplateParser.AtomIdJinjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomIdJinja}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomIdJinja(WebTemplateParser.AtomIdJinjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomIdStmt}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomIdStmt(WebTemplateParser.AtomIdStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomIdStmt}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomIdStmt(WebTemplateParser.AtomIdStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomParen}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomParen(WebTemplateParser.AtomParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomParen}
	 * labeled alternative in {@link WebTemplateParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomParen(WebTemplateParser.AtomParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuffixAttribute}
	 * labeled alternative in {@link WebTemplateParser#postfixSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuffixAttribute(WebTemplateParser.SuffixAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuffixAttribute}
	 * labeled alternative in {@link WebTemplateParser#postfixSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuffixAttribute(WebTemplateParser.SuffixAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuffixIndex}
	 * labeled alternative in {@link WebTemplateParser#postfixSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuffixIndex(WebTemplateParser.SuffixIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuffixIndex}
	 * labeled alternative in {@link WebTemplateParser#postfixSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuffixIndex(WebTemplateParser.SuffixIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuffixCall}
	 * labeled alternative in {@link WebTemplateParser#postfixSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuffixCall(WebTemplateParser.SuffixCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuffixCall}
	 * labeled alternative in {@link WebTemplateParser#postfixSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuffixCall(WebTemplateParser.SuffixCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SuffixFilter}
	 * labeled alternative in {@link WebTemplateParser#postfixSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuffixFilter(WebTemplateParser.SuffixFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SuffixFilter}
	 * labeled alternative in {@link WebTemplateParser#postfixSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuffixFilter(WebTemplateParser.SuffixFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgNamedJinja}
	 * labeled alternative in {@link WebTemplateParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgNamedJinja(WebTemplateParser.ArgNamedJinjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgNamedJinja}
	 * labeled alternative in {@link WebTemplateParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgNamedJinja(WebTemplateParser.ArgNamedJinjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgNamedStmt}
	 * labeled alternative in {@link WebTemplateParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgNamedStmt(WebTemplateParser.ArgNamedStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgNamedStmt}
	 * labeled alternative in {@link WebTemplateParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgNamedStmt(WebTemplateParser.ArgNamedStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgPositional}
	 * labeled alternative in {@link WebTemplateParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgPositional(WebTemplateParser.ArgPositionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgPositional}
	 * labeled alternative in {@link WebTemplateParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgPositional(WebTemplateParser.ArgPositionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprListFull}
	 * labeled alternative in {@link WebTemplateParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprListFull(WebTemplateParser.ExprListFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprListFull}
	 * labeled alternative in {@link WebTemplateParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprListFull(WebTemplateParser.ExprListFullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextNodeFull}
	 * labeled alternative in {@link WebTemplateParser#textNode}.
	 * @param ctx the parse tree
	 */
	void enterTextNodeFull(WebTemplateParser.TextNodeFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextNodeFull}
	 * labeled alternative in {@link WebTemplateParser#textNode}.
	 * @param ctx the parse tree
	 */
	void exitTextNodeFull(WebTemplateParser.TextNodeFullContext ctx);
}