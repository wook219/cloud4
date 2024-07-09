package ex.Q3;

import java.util.Arrays;

public class Person {

    public static int solution(int[] input, int target) {
        // 이곳에 코드를 작성해 주세요.
        Arrays.sort(input);

        int count = Arrays.binarySearch(input, target);

        return count;
    }

    private Person() {}
}
