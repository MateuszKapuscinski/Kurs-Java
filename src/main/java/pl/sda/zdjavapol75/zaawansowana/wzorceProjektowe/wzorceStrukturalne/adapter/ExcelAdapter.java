package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.adapter;

public class ExcelAdapter implements TextEditor{
    private ExcelEditor excelEditor;

    public ExcelAdapter(ExcelEditor excelEditor) {
        this.excelEditor = excelEditor;
    }

    @Override
    public String getText() {
        return excelEditor.getText().replace("Text w formacie docx: "," ");
    }
}
