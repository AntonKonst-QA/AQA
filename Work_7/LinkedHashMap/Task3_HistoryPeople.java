package Homework.Work_7.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task3_HistoryPeople {
    private static final int maxSize = 10;

    public static void main(String[] args) {
        LinkedHashMap<String, String> history = new LinkedHashMap<>();
        addHistory(history,"1", "1");
        addHistory(history,"2", "2");
        addHistory(history,"3", "3");
        addHistory(history,"4", "4");
        addHistory(history,"5", "5");
        addHistory(history,"6", "6");
        addHistory(history,"7", "7");
        addHistory(history,"8", "8");
        addHistory(history,"9", "9");
        addHistory(history,"10", "10");
        addHistory(history,"11", "11");


        System.out.println("История просмотров: ");
        for (Map.Entry<String, String> entry : history.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void addHistory (LinkedHashMap<String, String> map, String name, String id) {
        if (map.size() == maxSize) {
            String firstElem = map.keySet().iterator().next();
            map.remove(firstElem);
        }
        map.put(name, id);
    }
}
