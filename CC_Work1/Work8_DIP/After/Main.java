package Work8_DIP.After;

public class Main {
    public static void main(String[] args) {
        MessageSender email = new EmailSender();
        NotificationService service = new NotificationService(email);

        service.sendNotification("Добрый день!");

        MessageSender sms = new SmsSender();
        NotificationService service1 = new NotificationService(sms);

        service1.sendNotification("Добрый вечер!");
    }
}
