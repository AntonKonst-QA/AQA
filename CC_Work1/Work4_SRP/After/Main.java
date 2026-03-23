package Work4_SRP.After;

public class Main {
    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        EmailConfirmationSender mailer = new EmailConfirmationSender();
        InvoiceGenerator invoice = new InvoiceGenerator();

        processor.processOrder();
        mailer.sendEmailConfirmation();
        invoice.generateInvoice();
    }
}
