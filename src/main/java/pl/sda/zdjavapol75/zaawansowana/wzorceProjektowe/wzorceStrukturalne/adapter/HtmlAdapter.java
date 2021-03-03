package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.adapter;

public class HtmlAdapter implements TextEditor{
    private HtmlEditor htmlEditor;
    public HtmlAdapter(HtmlEditor htmlEditor) {
        this.htmlEditor = htmlEditor;
    }
    @Override
    public String getText() {
        return htmlEditor.getText().replace("<html>", "").replace("</html>", "");
    }
}
