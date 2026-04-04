package Practice_2.Singltone_1;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager url1 = ConfigurationManager.getInstance();
        ConfigurationManager url2 = ConfigurationManager.getInstance();
        ConfigurationManager folder1 = ConfigurationManager.getInstance();
        ConfigurationManager folder2 = ConfigurationManager.getInstance();
        ConfigurationManager log1 = ConfigurationManager.getInstance();
        ConfigurationManager log2 = ConfigurationManager.getInstance();

        url1.dbUrl = "URL1";
        url2.dbUrl = "URL2";
        folder1.folderPath = "Folder1";
        folder2.folderPath = "Folder2";
        log1.logPath = "Log1";
        log2.logPath = "Log2";

        url1.printConfig();
        url2.printConfig();
        folder1.printConfig();
        folder2.printConfig();
        log1.printConfig();
        log2.printConfig();
    }
}
