package list;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList<Integer> likedList = new LinkedList<>();

        likedList.addFirst(2);
        likedList.addLast(3);
        likedList.addFirst(1);

        System.out.println(likedList);
        System.out.println(likedList.removeFirst());
    }
}
