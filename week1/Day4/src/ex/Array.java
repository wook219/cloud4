package ex;

public class Array {
    public static void main(String[] args) {
        // 지시사항 1번을 참고하여 코드를 작성하세요.
        int[] iArray = new int[3];

        for (int i = 0; i < iArray.length; i++) {
            iArray[i] = i+1;
        }
        // 지시사항 2번을 참고하여 코드를 작성하세요.
        for (int i : iArray) {
            System.out.println(i);
        }
    }
}
