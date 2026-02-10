package Work4_SRP.After;

public class Main {
    public static void main(String[] args) {
        ProcessOrder processor = new ProcessOrder();
        SendEmailConfirmation mailer = new SendEmailConfirmation();
        GenerateInvoice invoice = new GenerateInvoice();

        processor.processOrder();
        mailer.sendEmailConfirmation();
        invoice.generateInvoice();
    }
}
