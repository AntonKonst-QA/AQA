package Practice_2.Singltone_1;

import java.sql.SQLOutput;

public class ConfigurationManager {
    private String dbUrl = "Default URL";
    private String folderPath = "Default folder";
    private String logPath = "Default log";

    private static ConfigurationManager instanсe;

    private ConfigurationManager(){}

    public static ConfigurationManager getInstance() {
        if (instanсe == null) {
            instanсe = new ConfigurationManager();
        } return instanсe;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getFolderPath() {
        return folderPath;
    }

    public String getLogPath() {
        return logPath;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    public void printConfig() {
        System.out.println(dbUrl);
        System.out.println(folderPath);
        System.out.println(logPath);
    }
}
