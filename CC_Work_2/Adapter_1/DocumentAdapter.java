package Practice_2.Adapter_1;

public class DocumentAdapter implements DocumentProcessor{
    public DOCProcessor docProcessor;

    public DocumentAdapter(DOCProcessor docProcessor) {
        this.docProcessor = docProcessor;
    }
    @Override
    public void process() {
        System.out.println("Конвертация документа");
        docProcessor.openAsWordDocument();
    }
}
