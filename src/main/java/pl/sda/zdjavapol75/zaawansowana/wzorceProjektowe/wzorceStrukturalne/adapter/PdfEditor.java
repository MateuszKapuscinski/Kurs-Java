package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.adapter;

public class PdfEditor {
    private String text;

    public PdfEditor(String text) {
        this.text = text;
    }
    public String getText() {
        return "Text w formacie pdf: " + text;
    }
}
