package ex.Q3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {

    public static List<String> sortList(List<String> inputList) {
        // 지시 사항을 참고하여 코드를 구현해 보세요.
        Collections.sort(inputList, String::compareToIgnoreCase);
        return inputList;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Steve", "Rachel", "Mike", "peter", "anna");

        List<String> strings = sortList(names);

        System.out.println(strings);
    }
}
