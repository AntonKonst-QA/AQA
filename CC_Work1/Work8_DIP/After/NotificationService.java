package Work8_DIP.After;

interface MessageSender {
    void send(String message);
}
class EmailSender implements MessageSender {
    public void send(String message) {
        System.out.println("Отправка email: " + message);
    }
}

class SmsSender implements MessageSender {
    public void send(String message) {
        System.out.println("Отправка sms: " + message);
    }
}

class NotificationService {
    private MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    void sendNotification(String message) {
        sender.send(message);
    }
}

