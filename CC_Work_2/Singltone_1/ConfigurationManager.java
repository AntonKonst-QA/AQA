package Practice_2.Singltone_1;

import java.sql.SQLOutput;

public class ConfigurationManager {
    public String dbUrl = "Default URL";
    public String folderPath = "Default folder";
    public String logPath = "Default log";

    private static ConfigurationManager instanse;

    public ConfigurationManager(){}

    public static ConfigurationManager getInstance() {
        if (instanse == null) {
            instanse = new ConfigurationManager();
        } return instanse;
    }

    public void printConfig() {
        System.out.println(dbUrl);
        System.out.println(folderPath);
        System.out.println(logPath);
    }
}
