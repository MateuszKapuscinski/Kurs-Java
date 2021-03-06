package pl.sda.zdjavapol75.zaawansowana.wzorceProjektowe.wzorceStrukturalne.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterUżycie {
    private static List<TextEditor> listaEdytorow = new ArrayList<>();
    public static void main(String[] args) {
        WordEditor wordEditor =  new WordEditor("ALA ma kota");
        PdfEditor pdfEditor =  new PdfEditor("JOHN Duch zdobył nowe punkty");
        ExcelEditor excelEditor = new ExcelEditor("Google wprowadziło nowe rozwiazania.");
        HtmlEditor htmlEditor = new HtmlEditor("Amazon jest swietny.");
        HtmlAdapter htmlAdapter = new HtmlAdapter(htmlEditor);
        System.out.println(htmlAdapter.getText());
        PdfEditor pdfEditor2 = new PdfEditor(htmlAdapter.getText());
        System.out.println(pdfEditor2.getText());
        WordEditor wordEditor2 =  new WordEditor(new PdfAdapter(pdfEditor2).getText());
        System.out.println(wordEditor2.getText());

        listaEdytorow.add(new WordAdapter(wordEditor));
        listaEdytorow.add(new PdfAdapter(pdfEditor));
        listaEdytorow.add(new ExcelAdapter(excelEditor));
        wyswietlRózneTeksty();

    }
    private static void wyswietlRózneTeksty(){
        for(TextEditor editor : listaEdytorow){
            System.out.println(editor.getText() + "\n");
        }
    }
}
