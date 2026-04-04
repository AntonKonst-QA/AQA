package Practice_2.Singltone_2;

public class Main {
    public static void main(String[] args) {
        Logger info1 = Logger.getInstance();
        Logger info2 = Logger.getInstance();
        Logger error1 = Logger.getInstance();
        Logger error2 = Logger.getInstance();
        Logger exception1 = Logger.getInstance();
        Logger exception2 = Logger.getInstance();

        info1.info = "Info1";
        info2.info = "Info2";
        error1.error = "Error1";
        error2.error = "Error2";
        exception1.exception = "Exception1";
        exception2.exception = "Exception2";

        info1.printLog();
        info2.printLog();
        error1.printLog();
        error2.printLog();
        exception1.printLog();
        exception2.printLog();
    }
}
