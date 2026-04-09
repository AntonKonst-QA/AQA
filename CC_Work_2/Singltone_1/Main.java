package Practice_2.Singltone_1;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager url1 = ConfigurationManager.getInstance();
        ConfigurationManager url2 = ConfigurationManager.getInstance();
        ConfigurationManager folder1 = ConfigurationManager.getInstance();
        ConfigurationManager folder2 = ConfigurationManager.getInstance();
        ConfigurationManager log1 = ConfigurationManager.getInstance();
        ConfigurationManager log2 = ConfigurationManager.getInstance();

        url1.setDbUrl("URL1");
        url2.setDbUrl("URL2");
        folder1.setFolderPath("Folder1");;
        folder2.setFolderPath("Folder2");
        log1.setLogPath("Log1");
        log2.setLogPath("Log2");

        url1.printConfig();
        url2.printConfig();
        folder1.printConfig();
        folder2.printConfig();
        log1.printConfig();
        log2.printConfig();
    }
}
