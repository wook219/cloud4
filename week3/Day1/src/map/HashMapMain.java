package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String, Integer> versionMap = new HashMap<>();

        versionMap.put("java", 11);
        versionMap.put("Spring", 6);
        versionMap.put("Spring boot", 3);
        versionMap.put("NotFoundError", 404);

        versionMap.remove("a");

        if(versionMap.containsKey("NotFoundError")){
            versionMap.remove("NotFoundError");
        }

        versionMap.remove("NotFoundError");

        versionMap.get("Spring");
    }
}
