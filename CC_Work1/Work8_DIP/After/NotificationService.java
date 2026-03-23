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
    final MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void sendNotification(String message) {
        sender.send(message);
    }
}

