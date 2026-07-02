package visitor;

import antlr.WebTemplateParser;
import antlr.WebTemplateParserBaseVisitor;
import ast.web.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import symbol_table.PrimitiveType;
import symbol_table.SymbolEntry;
import symbol_table.SymbolTable;
import symbol_table.Type;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class WebASTBuilderVisitor extends WebTemplateParserBaseVisitor<WebASTNode> {

    private List<String> semanticErrors = new ArrayList<>(); // ✅ قائمة الأخطاء
    public SymbolTable symTab;
    private Set<String> flaskVariables = new HashSet<>();

    public WebASTBuilderVisitor(SymbolTable table,
                                Set<String> flaskVariables){

        this.symTab = table;
        this.flaskVariables = flaskVariables;
    }
    public WebASTBuilderVisitor() {}

    @Override
    public WebASTNode visitDocumentRoot(WebTemplateParser.DocumentRootContext ctx) {
        symTab.enterscope("template");
        DocumentNode doc = new DocumentNode(ctx.getStart().getLine());
        for (WebTemplateParser.ElementContext elCtx : ctx.element()) {
            WebASTNode child = visit(elCtx);
            if (child != null) doc.addChild(child);
        }
        symTab.exitscope();
        return doc;
    }

    @Override
    public WebASTNode visitElementHtml(WebTemplateParser.ElementHtmlContext ctx) { return visit(ctx.htmlElement()); }
    @Override
    public WebASTNode visitElementCss(WebTemplateParser.ElementCssContext ctx) { return visit(ctx.cssBlock()); }

    @Override
    public WebASTNode visitElementJinja(WebTemplateParser.ElementJinjaContext ctx) {
        if (ctx.jinjaBlock() != null) {
            return visit(ctx.jinjaBlock());
        }

        String text = ctx.getText();

        if (text.startsWith("{{") && text.contains("}}")) {

            String var = extractVariable(text);

            String baseVar = var.split("\\.")[0];

            SymbolEntry e = symTab.lookup(baseVar);

            if (e == null && !flaskVariables.contains(baseVar)) {
                semanticErrors.add("Semantic Error: Missing Flask Variable '" + baseVar + "' requested in template at line " + ctx.start.getLine());
            }
        }
        return null;
    }

    @Override
    public WebASTNode visitElementText(WebTemplateParser.ElementTextContext ctx) { return new TextNode(ctx.getText(), ctx.getStart().getLine()); }

    @Override
    public WebASTNode visitHtmlElementVoid(WebTemplateParser.HtmlElementVoidContext ctx) {
        String tagName = ctx.getChild(0).getText();
        int line = ctx.getStart().getLine();
        HtmlSelfClosingNode node = new HtmlSelfClosingNode(tagName, line);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) instanceof WebTemplateParser.TagAttributeContext) {
                AttributeNode attr = (AttributeNode) visit(ctx.getChild(i));
                node.addAttribute(attr);
            }
        }
        return node;
    }

    @Override
    public WebASTNode visitHtmlElementContainer(WebTemplateParser.HtmlElementContainerContext ctx) {
        WebTemplateParser.HtmlOpenTagFullContext openCtx = (WebTemplateParser.HtmlOpenTagFullContext) ctx.htmlOpenTag();
        String tagName = openCtx.TAG_NAME().getText();
        HtmlElementNode node = new HtmlElementNode(tagName, ctx.start.getLine());
        for (WebTemplateParser.TagAttributeContext attrCtx : openCtx.tagAttribute()) {
            AttributeNode attr = (AttributeNode) visit(attrCtx);
            if (attr != null) node.addAttribute(attr);
        }
        for (WebTemplateParser.ElementContext elCtx : ctx.element()) {
            WebASTNode child = visit(elCtx);
            if (child != null) node.addChild(child);
        }
        return node;
    }

    @Override
    public WebASTNode visitHtmlElementSelfClosing(WebTemplateParser.HtmlElementSelfClosingContext ctx) { return visit(ctx.htmlSelfCloseTag()); }

    @Override
    public WebASTNode visitHtmlVoidTagFull(WebTemplateParser.HtmlVoidTagFullContext ctx) {
        String tagName = ctx.VOID_TAG_NAME().getText();
        int line = ctx.getStart().getLine();
        HtmlVoidNode node = new HtmlVoidNode(tagName, line);
        for (WebTemplateParser.TagAttributeContext attrCtx : ctx.tagAttribute()) {
            AttributeNode attr = (AttributeNode) visit(attrCtx);
            node.addAttribute(attr);
        }
        return node;
    }

    @Override
    public WebASTNode visitHtmlOpenTagFull(WebTemplateParser.HtmlOpenTagFullContext ctx) {
        String tagName = ctx.TAG_NAME().getText();
        int line = ctx.getStart().getLine();
        HtmlElementNode node = new HtmlElementNode(tagName, line);
        for (WebTemplateParser.TagAttributeContext attrCtx : ctx.tagAttribute()) {
            AttributeNode attr = (AttributeNode) visit(attrCtx);
            node.addAttribute(attr);
        }
        return node;
    }

    @Override
    public WebASTNode visitHtmlSelfClosingTagFull(WebTemplateParser.HtmlSelfClosingTagFullContext ctx) {
        String tagName = ctx.TAG_NAME() != null ? ctx.TAG_NAME().getText() : ctx.VOID_TAG_NAME().getText();
        int line = ctx.getStart().getLine();
        HtmlSelfClosingNode node = new HtmlSelfClosingNode(tagName, line);
        for (WebTemplateParser.TagAttributeContext attrCtx : ctx.tagAttribute()) {
            AttributeNode attr = (AttributeNode) visit(attrCtx);
            node.addAttribute(attr);
        }
        return node;
    }

    @Override
    public WebASTNode visitHtmlCloseTagFull(WebTemplateParser.HtmlCloseTagFullContext ctx) {
        String fullText = ctx.HTML_CLOSE_TAG().getText();
        String tagName = fullText.replaceAll("</|>|\\s", "");
        return new HtmlCloseNode(tagName, ctx.getStart().getLine());
    }

    @Override
    public WebASTNode visitHtmlAttributeBoolean(WebTemplateParser.HtmlAttributeBooleanContext ctx) { return new AttributeNode(ctx.TAG_ATTR_NAME().getText(), "true", ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitAttrValueSingle(WebTemplateParser.AttrValueSingleContext ctx) { String t = ctx.ATTR_VALUE_SINGLE().getText(); return new ValueNode(t.substring(1, t.length() - 1), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitAttrValueDouble(WebTemplateParser.AttrValueDoubleContext ctx) { String t = ctx.ATTR_VALUE_DOUBLE().getText(); return new ValueNode(t.substring(1, t.length() - 1), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitAttrValueUnquoted(WebTemplateParser.AttrValueUnquotedContext ctx) { return new ValueNode(ctx.ATTR_VALUE_UNQUOTED().getText(), ctx.getStart().getLine()); }

    @Override
    public WebASTNode visitCssBlockWithContent(WebTemplateParser.CssBlockWithContentContext ctx) {
        CssBlockNode node = new CssBlockNode(ctx.getStart().getLine());
        for (WebTemplateParser.StyleAttributeContext attrCtx : ctx.styleAttribute()) node.addAttribute((AttributeNode) visit(attrCtx));
        for (WebTemplateParser.CssRuleContext ruleCtx : ctx.cssRule()) { WebASTNode rule = visit(ruleCtx); if (rule != null) node.addRule(rule); }
        for (WebTemplateParser.MediaRuleContext mediaCtx : ctx.mediaRule()) { WebASTNode media = visit(mediaCtx); if (media != null) node.addRule(media); }
        return node;
    }

    @Override
    public WebASTNode visitCssBlockSelfClosed(WebTemplateParser.CssBlockSelfClosedContext ctx) {
        CssBlockNode node = new CssBlockNode(ctx.getStart().getLine());
        for (WebTemplateParser.StyleAttributeContext attrCtx : ctx.styleAttribute()) node.addAttribute((AttributeNode) visit(attrCtx));
        return node;
    }

    @Override
    public WebASTNode visitHtmlAttributeWithValue(WebTemplateParser.HtmlAttributeWithValueContext ctx) {
        String name = ctx.TAG_ATTR_NAME().getText();
        WebASTNode valNode = visit(ctx.attrValue());
        String value = (valNode instanceof ValueNode) ? ((ValueNode) valNode).getValue() : valNode.toString();
        return new AttributeNode(name, value, ctx.getStart().getLine());
    }

    @Override
    public WebASTNode visitStyleAttributeBoolean(WebTemplateParser.StyleAttributeBooleanContext ctx) { return new AttributeNode(ctx.STYLE_ATTR_NAME().getText(), null, ctx.getStart().getLine()); }

    @Override
    public WebASTNode visitCssRuleStandard(WebTemplateParser.CssRuleStandardContext ctx) {
        CssRuleNode node = new CssRuleNode(ctx.selector().getText(), ctx.getStart().getLine());
        for (WebTemplateParser.DeclarationContext declCtx : ctx.declaration()) {
            CssDeclarationNode decl = (CssDeclarationNode) visit(declCtx);
            if (decl != null) node.addDeclaration(decl);
        }
        return node;
    }

    @Override
    public WebASTNode visitCssMediaRuleFull(WebTemplateParser.CssMediaRuleFullContext ctx) {
        CssMediaRuleNode node = new CssMediaRuleNode(ctx.mediaCondition().getText(), ctx.getStart().getLine());
        for (WebTemplateParser.CssRuleContext ruleCtx : ctx.cssRule()) { WebASTNode rule = visit(ruleCtx); if (rule != null) node.addRule(rule); }
        for (WebTemplateParser.MediaRuleContext mediaCtx : ctx.mediaRule()) { WebASTNode media = visit(mediaCtx); if (media != null) node.addRule(media); }
        return node;
    }

    @Override
    public WebASTNode visitCssMediaCondition(WebTemplateParser.CssMediaConditionContext ctx) { return new CssConditionNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitMediaCondIdent(WebTemplateParser.MediaCondIdentContext ctx) { return new CssConditionNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitMediaCondNumber(WebTemplateParser.MediaCondNumberContext ctx) { return new CssConditionNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitMediaCondPercentage(WebTemplateParser.MediaCondPercentageContext ctx) { return new CssConditionNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitMediaCondDimension(WebTemplateParser.MediaCondDimensionContext ctx) { return new CssConditionNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitMediaCondColon(WebTemplateParser.MediaCondColonContext ctx) { return new CssConditionNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitMediaCondComma(WebTemplateParser.MediaCondCommaContext ctx) { return new CssConditionNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitMediaCondLParen(WebTemplateParser.MediaCondLParenContext ctx) { return new CssConditionNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitMediaCondRParen(WebTemplateParser.MediaCondRParenContext ctx) { return new CssConditionNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitMediaCondDot(WebTemplateParser.MediaCondDotContext ctx) { return new CssConditionNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitMediaCondHash(WebTemplateParser.MediaCondHashContext ctx) { return new CssConditionNode(ctx.getText(), ctx.getStart().getLine()); }

    @Override
    public WebASTNode visitCssSelectorList(WebTemplateParser.CssSelectorListContext ctx) {
        CssSelectorListNode list = new CssSelectorListNode(ctx.getStart().getLine());
        for (WebTemplateParser.SelectorItemContext item : ctx.selectorItem()) { CssSelectorNode node = (CssSelectorNode) visit(item); if (node != null) list.add(node); }
        return list;
    }

    @Override
    public WebASTNode visitCssSelectorSequence(WebTemplateParser.CssSelectorSequenceContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (WebTemplateParser.CompoundSelectorContext comp : ctx.compoundSelector()) { CssSelectorNode node = (CssSelectorNode) visit(comp); sb.append(node.getValue()).append(" "); }
        return new CssSelectorNode(sb.toString().trim(), ctx.getStart().getLine());
    }

    @Override
    public WebASTNode visitCssCompoundSelector(WebTemplateParser.CssCompoundSelectorContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (WebTemplateParser.SimpleSelectorContext simple : ctx.simpleSelector()) { CssSelectorNode node = (CssSelectorNode) visit(simple); sb.append(node.getValue()); }
        return new CssSelectorNode(sb.toString(), ctx.getStart().getLine());
    }

    @Override
    public WebASTNode visitCssTypeSelector(WebTemplateParser.CssTypeSelectorContext ctx) { return new CssSelectorNode(ctx.CSS_IDENT().getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitCssClassSelector(WebTemplateParser.CssClassSelectorContext ctx) { return new CssSelectorNode("." + ctx.CSS_IDENT().getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitCssIdSelector(WebTemplateParser.CssIdSelectorContext ctx) { return new CssSelectorNode(ctx.CSS_HASH_IDENT().getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitCssPseudoClass(WebTemplateParser.CssPseudoClassContext ctx) { return new CssSelectorNode(":" + ctx.CSS_IDENT().getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitCssUniversalSelector(WebTemplateParser.CssUniversalSelectorContext ctx) { return new CssSelectorNode("*", ctx.getStart().getLine()); }

    @Override
    public WebASTNode visitCssDeclarationFull(WebTemplateParser.CssDeclarationFullContext ctx) {
        CssDeclarationNode node = new CssDeclarationNode(ctx.CSS_IDENT().getText(), ctx.getStart().getLine());
        for (WebTemplateParser.CssValueContext valCtx : ctx.cssValue()) { CssValueNode valNode = (CssValueNode) visit(valCtx); if (valNode != null) node.addValue(valNode); }
        return node;
    }

    @Override
    public WebASTNode visitCssValueIdent(WebTemplateParser.CssValueIdentContext ctx) { return new CssValueNode(ctx.CSS_IDENT().getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitCssValueNumber(WebTemplateParser.CssValueNumberContext ctx) { return new CssValueNode(ctx.CSS_NUMBER().getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitCssValuePercentage(WebTemplateParser.CssValuePercentageContext ctx) { return new CssValueNode(ctx.CSS_PERCENTAGE().getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitCssValueDimension(WebTemplateParser.CssValueDimensionContext ctx) { return new CssValueNode(ctx.CSS_DIMENSION().getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitCssValueString(WebTemplateParser.CssValueStringContext ctx) { return new CssValueNode(ctx.CSS_STRING().getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitCssValueHexColor(WebTemplateParser.CssValueHexColorContext ctx) { return new CssValueNode(ctx.CSS_HEX_COLOR().getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitCssValueHash(WebTemplateParser.CssValueHashContext ctx) { return new CssValueNode(ctx.CSS_HASH_IDENT().getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitCssValueUrl(WebTemplateParser.CssValueUrlContext ctx) { return new CssValueNode(ctx.CSS_URL().getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitCssValueLParen(WebTemplateParser.CssValueLParenContext ctx) { return new CssValueNode(ctx.CSS_LPAREN().getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitCssValueRParen(WebTemplateParser.CssValueRParenContext ctx) { return new CssValueNode(ctx.CSS_RPAREN().getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitCssValueComma(WebTemplateParser.CssValueCommaContext ctx) { return new CssValueNode(ctx.CSS_COMMA().getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitCssValueDot(WebTemplateParser.CssValueDotContext ctx) { return new CssValueNode(ctx.CSS_DOT().getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitCssValueSlash(WebTemplateParser.CssValueSlashContext ctx) { return new CssValueNode(ctx.CSS_SLASH().getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitCssValueImportant(WebTemplateParser.CssValueImportantContext ctx) { return new CssValueNode(ctx.CSS_BANG().getText(), ctx.getStart().getLine()); }

    @Override
    public WebASTNode visitJinjaBlockIf(WebTemplateParser.JinjaBlockIfContext ctx) { return visit(ctx.jinjaIf()); }
    @Override
    public WebASTNode visitJinjaBlockFor(WebTemplateParser.JinjaBlockForContext ctx) { return visit(ctx.jinjaFor()); }
    @Override
    public WebASTNode visitJinjaBlockSet(WebTemplateParser.JinjaBlockSetContext ctx) { return visit(ctx.jinjaSet()); }
    @Override
    public WebASTNode visitJinjaBlockDefinitionNode(WebTemplateParser.JinjaBlockDefinitionNodeContext ctx) { return visit(ctx.jinjaBlockStmt()); }
    @Override
    public WebASTNode visitJinjaBlockExpr(WebTemplateParser.JinjaBlockExprContext ctx) { return visit(ctx.jinjaExpr()); }
    @Override
    public WebASTNode visitJinjaBlockComment(WebTemplateParser.JinjaBlockCommentContext ctx) { return null; }

    @Override
    public WebASTNode visitJinjaIfFull(WebTemplateParser.JinjaIfFullContext ctx) {
        symTab.enterscope("jinja-if");
        WebASTNode condition = visit(ctx.expr());
        JinjaIfNode node = new JinjaIfNode(condition, ctx.getStart().getLine());
        List<String> vars = extractVariables(ctx.expr().getText());
        for (String var : vars) {
            SymbolEntry e = symTab.lookup(var);
            if (e == null && !flaskVariables.contains(var)) {
                semanticErrors.add("Semantic Error: Undefined variable '" + var + "' in Jinja if at line " + ctx.getStart().getLine());
            }
        }
        for (WebTemplateParser.ElementContext el : ctx.element()) { WebASTNode child = visit(el); if (child != null) node.body.add(child); }
        for (WebTemplateParser.JinjaElifContext elifCtx : ctx.jinjaElif()) node.elifNodes.add((JinjaIfNode) visit(elifCtx));
        if (ctx.jinjaElse() != null) node.elseNode = (JinjaIfNode) visit(ctx.jinjaElse());
        symTab.exitscope();
        return node;
    }

    @Override
    public WebASTNode visitJinjaElifFull(WebTemplateParser.JinjaElifFullContext ctx) {
        symTab.enterscope("jinja-elif");
        WebASTNode condition = visit(ctx.expr());
        JinjaIfNode node = new JinjaIfNode(condition, ctx.getStart().getLine());
        List<String> vars = extractVariables(ctx.expr().getText());
        for (String var : vars) {
            SymbolEntry e = symTab.lookup(var);
            if (e == null && !flaskVariables.contains(var)) {
                semanticErrors.add("Semantic Error: Undefined variable '" + var + "' in Jinja elif at line " + ctx.getStart().getLine());
            }
        }
        for (WebTemplateParser.ElementContext el : ctx.element()) { WebASTNode child = visit(el); if (child != null) node.body.add(child); }
        symTab.exitscope();
        return node;
    }

    @Override
    public WebASTNode visitJinjaElseFull(WebTemplateParser.JinjaElseFullContext ctx) {
        symTab.enterscope("jinja_else");
        JinjaIfNode node = new JinjaIfNode(null, ctx.getStart().getLine());
        for (WebTemplateParser.ElementContext el : ctx.element()) { WebASTNode child = visit(el); if (child != null) node.body.add(child); }
        symTab.exitscope();
        return node;
    }

    @Override
    public WebASTNode visitJinjaForFull(WebTemplateParser.JinjaForFullContext ctx) {
        symTab.enterscope("jinja_For");
        JinjaForNode node = new JinjaForNode(ctx.getText(), ctx.getStart().getLine());

        // ✅ 1. زيارة الـ iterable واستنتاج نوعه
        WebASTNode iterable = visit(ctx.expr());
        Type iterableType = resolveType(iterable);

        // ==========================================
        // 🌟 Semantic Error #2: Type Error (Not Iterable)
        // ==========================================
        // ==========================================
// 🌟 Type Error — النوع الأول: Not Iterable
// ==========================================
        if (!isIterableType(iterableType)) {
            semanticErrors.add("Semantic Error: '" + toPythonTypeName(iterableType) +
                    "' object is not iterable at line " + ctx.getStart().getLine());
        }
        // ==========================================

        // ✅ 2. معالجة متغيرات الحلقة
        WebTemplateParser.ForTargetListContext list = ctx.forTargetList();
        for (int i = 0; i < list.getChildCount(); i++) {
            String text = list.getChild(i).getText();
            if (text.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
                node.variables.add(text);
                SymbolEntry entry = symTab.insert(text, SymbolEntry.SymbolKind.LOOP_VARIABLE);
                if (entry != null) entry.setType(inferElementType(iterableType));
            }
        }

        // ✅ 3. التحقق من المتغيرات في الـ iterable
        String exprText = ctx.getChild(ctx.getChildCount() - 1).getText();
        List<String> vars = extractVariables(exprText);
        for (String var : vars) {
            SymbolEntry e = symTab.lookup(var);
            if (e == null && !flaskVariables.contains(var)) {
                semanticErrors.add("Semantic Error: Undefined iterable variable '" + var + "' at line " + ctx.getStart().getLine());
            }
        }

        // ✅ 4. زيارة جسم الحلقة
        for (WebTemplateParser.ElementContext el : ctx.element()) {
            WebASTNode child = visit(el);
            if (child != null) node.body.add(child);
        }
        symTab.exitscope();
        return node;
    }

    @Override
    public WebASTNode visitJinjaForTargetList(WebTemplateParser.JinjaForTargetListContext ctx) { return null; }

    @Override
    public WebASTNode visitJinjaSetFull(WebTemplateParser.JinjaSetFullContext ctx) {
        String name = ctx.JSTMT_IDENTIFIER().getText();
        WebASTNode value = visit(ctx.expr());
        SymbolEntry entry = symTab.insert(name, SymbolEntry.SymbolKind.VARIABLE);
        if (entry != null) entry.setType(resolveType(value));
        return new JinjaSetNode(name, value, ctx.getStart().getLine());
    }

    private Type resolveType(WebASTNode node)
    {
        if (node == null)
            return new PrimitiveType("UNKNOWN");

        if (node instanceof TextNode)
            return new PrimitiveType("STRING");

        if (node instanceof ValueNode)
            return new PrimitiveType("STRING");

        if (node instanceof AttributeNode)
            return new PrimitiveType("STRING");

        if (node instanceof CssValueNode)
            return new PrimitiveType("STRING");

        if (node instanceof CssConditionNode)
            return new PrimitiveType("BOOL");

        if (node instanceof JinjaExprNode exprNode)
        {
            String text = exprNode.getExpr().trim();

            if (text.matches("\\d+\\.\\d+"))
                return new PrimitiveType("DOUBLE");

            if (text.matches("\\d+"))
                return new PrimitiveType("INT");

            if (text.equals("True") || text.equals("False"))
                return new PrimitiveType("BOOL");

            if (
                    (text.startsWith("\"") && text.endsWith("\"")) ||
                            (text.startsWith("'") && text.endsWith("'"))
            )
            {
                return new PrimitiveType("STRING");
            }

            if (
                    text.contains("+") ||
                            text.contains("-") ||
                            text.contains("*") ||
                            text.contains("/")
            )
            {
                // simple heuristic
                if (text.matches(".*\\d+\\.\\d+.*"))
                    return new PrimitiveType("DOUBLE");

                return new PrimitiveType("INT");
            }

            if (
                    text.contains("==") ||
                            text.contains("!=") ||
                            text.contains(">") ||
                            text.contains("<") ||
                            text.contains(">=") ||
                            text.contains("<=")
            )
            {
                return new PrimitiveType("BOOL");
            }

            if (
                    text.contains(" and ") ||
                            text.contains(" or ") ||
                            text.startsWith("not ")
            )
            {
                return new PrimitiveType("BOOL");
            }

            SymbolEntry e = symTab.lookup(text);

            if (e != null && e.getType() != null)
                return e.getType();

            return new PrimitiveType("UNKNOWN");
        }

        if (node instanceof JinjaSetNode setNode)
        {
            return resolveType(setNode.getValue());
        }

        if (node instanceof JinjaIfNode)
        {
            return new PrimitiveType("BOOL");
        }

        if (node instanceof JinjaForNode)
        {
            return new PrimitiveType("ITERABLE");
        }

        if (
                node instanceof HtmlElementNode ||
                        node instanceof HtmlSelfClosingNode ||
                        node instanceof HtmlVoidNode ||
                        node instanceof HtmlCloseNode
        )
        {
            return new PrimitiveType("HTML");
        }

        if (
                node instanceof CssRuleNode ||
                        node instanceof CssBlockNode ||
                        node instanceof CssDeclarationNode ||
                        node instanceof CssMediaRuleNode
        )
        {
            return new PrimitiveType("CSS");
        }

        return new PrimitiveType("UNKNOWN");
    }

    @Override
    public WebASTNode visitJinjaBlockFull(WebTemplateParser.JinjaBlockFullContext ctx) {
        symTab.enterscope("jinja-block");
        List<WebASTNode> children = new ArrayList<>();
        for (WebTemplateParser.ElementContext el : ctx.element()) children.add(visit(el));
        symTab.exitscope();
        return new JinjaBlockNode(children);
    }

    @Override
    public WebASTNode visitJinjaExpressionFull(WebTemplateParser.JinjaExpressionFullContext ctx) {
        validateExpressionVariables(ctx.expr().getText(), ctx.getStart().getLine());
        return new JinjaExprNode(ctx.expr().getText(), ctx.getStart().getLine());
    }

    @Override
    public WebASTNode visitExprRoot(WebTemplateParser.ExprRootContext ctx) { validateExpressionVariables(ctx.getText(), ctx.getStart().getLine()); return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitExprOr(WebTemplateParser.ExprOrContext ctx) { validateExpressionVariables(ctx.getText(), ctx.getStart().getLine()); return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitExprAnd(WebTemplateParser.ExprAndContext ctx) { validateExpressionVariables(ctx.getText(), ctx.getStart().getLine()); return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitExprNot(WebTemplateParser.ExprNotContext ctx) { validateExpressionVariables(ctx.getText(), ctx.getStart().getLine()); return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitExprComparisonRoot(WebTemplateParser.ExprComparisonRootContext ctx) { validateExpressionVariables(ctx.getText(), ctx.getStart().getLine()); return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitExprComparison(WebTemplateParser.ExprComparisonContext ctx) { validateExpressionVariables(ctx.getText(), ctx.getStart().getLine()); return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitOpCompareJinja(WebTemplateParser.OpCompareJinjaContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitOpCompareStmt(WebTemplateParser.OpCompareStmtContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitOpInJinja(WebTemplateParser.OpInJinjaContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitOpInStmt(WebTemplateParser.OpInStmtContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitOpIs(WebTemplateParser.OpIsContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitOpNotIn(WebTemplateParser.OpNotInContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitExprAdd(WebTemplateParser.ExprAddContext ctx) { validateExpressionVariables(ctx.getText(), ctx.getStart().getLine()); return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitExprMul(WebTemplateParser.ExprMulContext ctx) { validateExpressionVariables(ctx.getText(), ctx.getStart().getLine()); return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitExprUnary(WebTemplateParser.ExprUnaryContext ctx) { validateExpressionVariables(ctx.getText(), ctx.getStart().getLine()); return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitExprPostfixRoot(WebTemplateParser.ExprPostfixRootContext ctx) { validateExpressionVariables(ctx.getText(), ctx.getStart().getLine()); return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitExprPostfix(WebTemplateParser.ExprPostfixContext ctx) { validateExpressionVariables(ctx.getText(), ctx.getStart().getLine()); return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitAtomNumberJinja(WebTemplateParser.AtomNumberJinjaContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitAtomNumberStmt(WebTemplateParser.AtomNumberStmtContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitAtomStringJinja(WebTemplateParser.AtomStringJinjaContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitAtomStringStmt(WebTemplateParser.AtomStringStmtContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }

    @Override
    public WebASTNode visitAtomIdJinja(WebTemplateParser.AtomIdJinjaContext ctx) {
        String name = ctx.getText();
        SymbolEntry e = symTab.lookup(name);
        if (e == null && !flaskVariables.contains(name)) {
            semanticErrors.add("Semantic Error: Undefined variable '" + name + "' at line " + ctx.getStart().getLine());
        }
        return new JinjaExprNode(name, ctx.getStart().getLine());
    }

    @Override
    public WebASTNode visitAtomIdStmt(WebTemplateParser.AtomIdStmtContext ctx) {
        String name = ctx.getText();
        SymbolEntry e = symTab.lookup(name);
        if (e == null) {
            semanticErrors.add("Semantic Error: Undefined variable '" + name + "' at line " + ctx.getStart().getLine());
        }
        return new JinjaExprNode(name, ctx.getStart().getLine());
    }

    @Override
    public WebASTNode visitAtomParen(WebTemplateParser.AtomParenContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitSuffixAttribute(WebTemplateParser.SuffixAttributeContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitSuffixIndex(WebTemplateParser.SuffixIndexContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitSuffixCall(WebTemplateParser.SuffixCallContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitSuffixFilter(WebTemplateParser.SuffixFilterContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitArgNamedJinja(WebTemplateParser.ArgNamedJinjaContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitArgNamedStmt(WebTemplateParser.ArgNamedStmtContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitArgPositional(WebTemplateParser.ArgPositionalContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitExprListFull(WebTemplateParser.ExprListFullContext ctx) { return new JinjaExprNode(ctx.getText(), ctx.getStart().getLine()); }
    @Override
    public WebASTNode visitTextNodeFull(WebTemplateParser.TextNodeFullContext ctx) { return new TextNode(ctx.getText(), ctx.getStart().getLine()); }

    @Override
    public WebASTNode visit(ParseTree tree) { return super.visit(tree); }
    @Override
    public WebASTNode visitChildren(RuleNode node) { return super.visitChildren(node); }
    @Override
    public WebASTNode visitTerminal(TerminalNode node) { return super.visitTerminal(node); }
    @Override
    public WebASTNode visitErrorNode(ErrorNode node) { return super.visitErrorNode(node); }
    @Override
    protected WebASTNode defaultResult() { return super.defaultResult(); }
    @Override
    protected WebASTNode aggregateResult(WebASTNode aggregate, WebASTNode nextResult) { return super.aggregateResult(aggregate, nextResult); }
    @Override
    protected boolean shouldVisitNextChild(RuleNode node, WebASTNode currentResult) { return super.shouldVisitNextChild(node, currentResult); }
    @Override
    public int hashCode() { return super.hashCode(); }
    @Override
    public boolean equals(Object obj) { return super.equals(obj); }
    @Override
    protected Object clone() throws CloneNotSupportedException { return super.clone(); }
    @Override
    public String toString() { return super.toString(); }

    // ✅ دالة طباعة الأخطاء في النهاية
    public void printSemanticErrors() {
        String RED = "\u001B[31m";
        String RESET = "\u001B[0m";
        for (String error : semanticErrors) {
            System.out.println(RED + error + RESET);
        }
    }

    private List<String> extractVariables(String text) {
        List<String> vars = new ArrayList<>();
        if (text == null || text.isEmpty()) return vars;
        text = text.replace("{{", "").replace("}}", "").replace("{%", "").replace("%}", "");
        java.util.regex.Pattern p = java.util.regex.Pattern.compile("\\b[a-zA-Z_][a-zA-Z0-9_]*(?:\\.[a-zA-Z_][a-zA-Z0-9_]*)*\\b");
        java.util.regex.Matcher m = p.matcher(text);
        while (m.find()) {
            String fullMatch = m.group();
            String var = fullMatch.split("\\.")[0];
            if (var.equals("if") || var.equals("else") || var.equals("elif") || var.equals("and") || var.equals("or") || var.equals("not") || var.equals("True") || var.equals("False") || var.equals("None") || var.equals("in")) continue;
            if (!vars.contains(var)) vars.add(var);
        }
        return vars;
    }

    private String extractVariable(String text) {
        if (text == null) return null;
        text = text.trim();
        if (text.startsWith("{{") && text.endsWith("}}")) text = text.substring(2, text.length() - 2).trim();
        String[] parts = text.split("\\|");
        return parts[0].trim();
    }

    private void validateExpressionVariables(String text, int line) {
        if (text != null && text.contains("|")) {
            text = text.split("\\|")[0].trim() + "}}";
        }

        List<String> vars = extractVariables(text);
        for (String var : vars) {
            SymbolEntry e = symTab.lookup(var);
            if (e == null && !flaskVariables.contains(var)) {
                semanticErrors.add("Semantic Error: Flask variable '" + var + "' is not passed from render_template at line " + line);
            }
        }

        checkTypeUsageErrors(text, line);   // ⬅️ السطر الوحيد المُضاف
    }

    private Type inferElementType(Type iterableType) {
        if (iterableType == null) return new PrimitiveType("UNKNOWN");
        if (iterableType instanceof symbol_table.ListType listType) return listType.getElementtype();
        if (iterableType instanceof PrimitiveType p && p.name().equals("STRING")) return new PrimitiveType("STRING");
        return new PrimitiveType("UNKNOWN");
    }

    private boolean isIterableType(Type type) {
        if (type instanceof symbol_table.ListType) return true;
        if (type instanceof symbol_table.DictType) return true;
        if (type instanceof PrimitiveType p) {
            if (p.name().equals("UNKNOWN")) return true;
            return p.name().equals("STRING");
        }
        return true;
    }

    private boolean isSubscriptableType(Type type) {
        if (type instanceof symbol_table.ListType) return true;
        if (type instanceof symbol_table.DictType) return true;
        if (type instanceof PrimitiveType p) {
            if (p.name().equals("UNKNOWN")) return true;
            return p.name().equals("STRING");
        }
        return true;
    }

    private boolean isCallable(SymbolEntry entry){

        return entry.getKind()==SymbolEntry.SymbolKind.FUNCTION
                || entry.getKind()==SymbolEntry.SymbolKind.CLASS;
    }

    private String toPythonTypeName(Type type) {
        if (type instanceof symbol_table.ListType) return "list";
        if (type instanceof symbol_table.DictType) return "dict";
        if (type instanceof PrimitiveType p) {
            return switch (p.name()) {
                case "INT" -> "int";
                case "DOUBLE" -> "float";
                case "STRING" -> "str";
                case "BOOL" -> "bool";
                case "NONE" -> "NoneType";
                default -> "object";
            };
        }
        return "object";
    }
    /**
     * فحص نصّي (بنفس أسلوب extractVariables المستخدم بالمشروع) لاكتشاف:
     * - استدعاء متغيّر عادي كأنه دالة  → Not Callable
     * - فهرسة متغيّر غير قابل للفهرسة → Not Subscriptable
     */
    private void checkTypeUsageErrors(String text, int line) {
        if (text == null || text.isEmpty()) return;

        // 🌟 Type Error — النوع الثاني: Not Callable
        java.util.regex.Matcher callMatcher =
                java.util.regex.Pattern.compile("\\b([a-zA-Z_][a-zA-Z0-9_]*)\\s*\\(").matcher(text);
        while (callMatcher.find()) {
            String name = callMatcher.group(1);
            SymbolEntry entry = symTab.lookup(name);
            if(entry!=null && !isCallable(entry)) {
                semanticErrors.add("Semantic Error: '" + toPythonTypeName(entry.getType()) +
                        "' object is not callable at line " + line);
            }
        }

        // 🌟 Type Error — النوع الثالث: Not Subscriptable
        java.util.regex.Matcher indexMatcher =
                java.util.regex.Pattern.compile("\\b([a-zA-Z_][a-zA-Z0-9_]*)\\s*\\[").matcher(text);
        while (indexMatcher.find()) {
            String name = indexMatcher.group(1);
            SymbolEntry entry = symTab.lookup(name);
            if (entry != null && !isSubscriptableType(entry.getType())) {
                semanticErrors.add("Semantic Error: '" + toPythonTypeName(entry.getType()) +
                        "' object is not subscriptable at line " + line);
            }
        }
    }
}