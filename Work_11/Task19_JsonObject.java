package Homework.Work_11;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Task19_JsonObject {
    public boolean isValidJson(String json) {
        try {
            new ObjectMapper().readTree(json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
