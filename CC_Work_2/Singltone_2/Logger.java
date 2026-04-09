package Practice_2.Singltone_2;

public class Logger {
    private String info = "No info";
    private String error = "No error";
    private String exception = "No exception";

    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public String getInfo() {
        return info;
    }

    public String getError() {
        return error;
    }

    public String getException() {
        return exception;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public void printLog() {
        System.out.println(info);
        System.out.println(error);
        System.out.println(exception);
    }
}
