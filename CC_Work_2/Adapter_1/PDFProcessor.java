package Practice_2.Adapter_1;

public class PDFProcessor implements DocumentProcessor{
    @Override
    public void process() {
        System.out.println("Обработка PDF документа");
    }
}
