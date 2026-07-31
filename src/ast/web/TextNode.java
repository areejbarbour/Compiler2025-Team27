package ast.web;

public class TextNode extends WebASTNode {

    private String text;

    public TextNode(String text, int lineNumber) {
        super("Text", lineNumber);
        this.text = text;
    }

//    @Override
//    public void print(String indent) {
//        System.out.println(indent + nodeName + " : \"" + text + "\"");
//    }

    @Override
    public void print(String indent) {
        if (text == null || text.trim().isEmpty()) return;   // ✅ السطر المُضاف: تجاهل النص الفاضي/المسافات بس
        System.out.println(indent + "Text : \"" + text + "\"");
    }



    public String getText() {
        return text;
    }



}