package set;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(100);
        set.add(30);
        set.add(79);
        set.add(3);
        set.add(28);
        set.add(111);
        set.add(25);

        List<Integer> list1 = new ArrayList<>(set.headSet(30));
        List<Integer> list2 = new ArrayList<>(set.headSet(80));
        List<Integer> list3 = new ArrayList<>(set.subSet(30, 80));

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
}
