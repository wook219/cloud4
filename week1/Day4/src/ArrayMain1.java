import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        //정수배열 선언
        int[] data1;
        //정수배열 생성
        data1 = new int[5];

        //정수배열 사용
        for (int num : data1) {
            System.out.println(num);
        }

        //문자열 배열 선언과 생성 동시에
        String[] data2 = new String[3];

        //문자열 배열 사용
        for (String value : data2) {
            System.out.println(value);
        }
    }
}
