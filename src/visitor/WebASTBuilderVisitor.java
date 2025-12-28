package visitor;

import antlr.WebTemplateParser;
import antlr.WebTemplateParserBaseVisitor;
import ast.web.*;

public class WebASTBuilderVisitor extends WebTemplateParserBaseVisitor<WebASTNode> {

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
        return new JinjaExprNode(
                ctx.JINJA_EXPR_CONTENT().getText(),
                ctx.start.getLine()
        );
    }
}