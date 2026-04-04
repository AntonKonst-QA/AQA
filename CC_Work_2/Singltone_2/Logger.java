package Practice_2.Singltone_2;

public class Logger {
    public String info = "No info";
    public String error = "No error";
    public String exception = "No exception";

    private static Logger instanse;

    private Logger() {}

    public static Logger getInstance() {
        if (instanse == null) {
            instanse = new Logger();
        }
        return instanse;
    }

    public void printLog() {
        System.out.println(info);
        System.out.println(error);
        System.out.println(exception);
    }
}
