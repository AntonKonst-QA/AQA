package Practice_2.Adapter_1;

public class Main {
    public static void main(String[] args) {
        DocumentProcessor pdf = new PDFProcessor();

        pdf.process();

        DOCProcessor docFile = new DOCProcessor();
        DocumentProcessor adapter = new DocumentAdapter(docFile);
        adapter.process();
    }
}
