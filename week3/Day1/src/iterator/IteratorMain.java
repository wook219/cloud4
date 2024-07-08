package iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        for(int i = 0; i < 1000; i++){
            list.add(i);
        }

        Iterator<Integer> iterator = list.listIterator();

        for (int i = 0; i < 500; i++) {
            iterator.next();
        }
    }
}
