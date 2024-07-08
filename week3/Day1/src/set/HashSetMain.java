package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(4);
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(5);

        set.remove(3);

        if(set.isEmpty()){
            System.out.println("Set is Empty");
        }else{
            System.out.println("Set is not empty.");
        }

        if(set.contains(3)){
            System.out.println("Set contains 3.");
        }else{
            System.out.println("Set does not contain 3.");
        }

        List<Integer> list = new ArrayList<>(set);

        for (Integer i : list) {
            System.out.println(i + " ");
        }
    }
}
