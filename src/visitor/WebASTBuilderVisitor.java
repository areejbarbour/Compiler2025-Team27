package visitor;

import ast.web.*;

import antlr.WebTemplateParser;
import antlr.WebTemplateParserBaseVisitor;

import symbol_table.SymbolTable;

public class WebASTBuilderVisitor extends WebTemplateParserBaseVisitor<WebASTNode> {
public SymbolTable symTab=new SymbolTable();
    @Override
    public WebASTNode visitDocumentRootNode(
            WebTemplateParser.DocumentRootNodeContext ctx) {
        DocumentNode doc = new DocumentNode(ctx.start.getLine());
        for (WebTemplateParser.ElementContext el : ctx.element()) {
            WebASTNode node = visit(el);
            if (node != null) {
                doc.addChild(node);
            }
        }
        return doc;
    }

    @Override
    public WebASTNode visitTextContentNode(WebTemplateParser.TextContentNodeContext ctx) {
        return new TextNode(ctx.getText(), ctx.start.getLine());
    }

    @Override
    public WebASTNode visitHtmlElementNode(WebTemplateParser.HtmlElementNodeContext ctx) {
        String tag = ctx.htmlOpenTag().getStart().getText();
        HtmlElementNode node = new HtmlElementNode(tag, ctx.start.getLine());

        for (var el : ctx.element()) {
            node.addChild(visit(el));
        }
        return node;
    }

    @Override
    public WebASTNode visitCssBlockNode(WebTemplateParser.CssBlockNodeContext ctx) {
        CssBlockNode block = new CssBlockNode(ctx.start.getLine());

        for (var c : ctx.cssContent()) {
            String text = c.getText().trim();
            if (!text.isEmpty()) {
                block.addChild(new CssTextNode(text, c.getStart().getLine()));
            }
        }

        return block;
    }

    @Override
    public WebASTNode visitJinjaExprNode(WebTemplateParser.JinjaExprNodeContext ctx) {
        String name = ctx.JINJA_EXPR_CONTENT().getText();
        int line = ctx.start.getLine();

        if (symTab.lookup(name) == null) {
            System.err.println(
                    "Semantic Error: Jinja variable '" + name +
                            "' not defined (line " + line + ")"
            );
        }

        return new JinjaExprNode(name, line);
//        return new JinjaExprNode(
//                ctx.JINJA_EXPR_CONTENT().getText(),
//                ctx.start.getLine()
//        );
    }



    @Override
    public WebASTNode visitAttrNamedNode(WebTemplateParser.AttrNamedNodeContext ctx) {
        String name = ctx.HTML_ATTR_NAME_KEY().getText();
        String value = ctx.attrValue() != null
                ? ctx.attrValue().getText()
                : "";

        return new AttributeNode(name, value, ctx.start.getLine());
    }

    @Override
    public WebASTNode visitHtmlSelfCloseImgNode(
            WebTemplateParser.HtmlSelfCloseImgNodeContext ctx) {

        String tag = ctx.HTML_TAG_IMG_OPEN().getText();
        HtmlSelfClosingNode node =
                new HtmlSelfClosingNode(tag, ctx.start.getLine());

        for (var attr : ctx.attribute()) {
            WebASTNode attrNode = visit(attr);
            if (attrNode != null) {
                node.addChild(attrNode);
            }
        }

        return node;
    }

    @Override
    public WebASTNode visitJinjaIfNode(WebTemplateParser.JinjaIfNodeContext ctx) {
        String condition = ctx.JINJA_STMT_CONTENT().getText();

        JinjaIfNode node = new JinjaIfNode(condition, ctx.start.getLine());

        for (var el : ctx.element()) {
            WebASTNode child = visit(el);
            if (child != null) {
                node.addChild(child);
            }
        }

        return node;
    }

    @Override
    public WebASTNode visitJinjaForNode(WebTemplateParser.JinjaForNodeContext ctx) {
        String expr = ctx.JINJA_STMT_CONTENT().getText();

        JinjaForNode node = new JinjaForNode(expr, ctx.start.getLine());

        for (var el : ctx.element()) {
            WebASTNode child = visit(el);
            if (child != null) {
                node.addChild(child);
            }
        }

        return node;
    }
}