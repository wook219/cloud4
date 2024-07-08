package ex.Q4;

import java.util.ListIterator;

class Solution {
    public static void solution(ListIterator<Integer> iterator) {
        // 이곳에 정답 코드를 작성해 주세요.
        int cnt = 1;
        int first = iterator.next();
        while(iterator.hasNext()){
            int second = iterator.next();

            if(first < second){
                cnt++;
            }
            first = second;
        }
        System.out.println(cnt);
    }

    private Solution() {}
}
