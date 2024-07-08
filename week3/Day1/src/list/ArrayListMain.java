package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list2.add(8);
        list2.add(9);

        list1.add(1);
        list1.add(1,2);
        for (int i = 2; i < 8; i++) {
            list1.add(i);
        }

        list1.addAll(list2);
        System.out.println(list1);
    }
}
