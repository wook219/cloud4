package ex.Q3;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    static private final Map<String, Integer> menuMap = new HashMap<>();

    static public void execute(int instruction, String key, Integer value) {
        // 이곳에 답안을 작성해 주세요.
        if(instruction == 0){
            if(menuMap.containsKey(key)){
                menuMap.replace(key,value);
            }else{
                menuMap.put(key,value);
            }
        }else if(instruction == 1){
            menuMap.remove(key);
        }else{
            if(!(menuMap.containsKey(key))){
                System.out.println(0);
            }else{
                int price = menuMap.get(key) * value;
                System.out.println(price);
            }
        }
    }

    private Menu() {}
}
