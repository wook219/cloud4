public class ArrayLoop {
    public static void main(String[] args) {
        System.out.println("----------Int Array------------");
        //정수배열 선언
        int[] data1;
        //정수배열 생성
        data1 = new int[5];

        //정수배열 사용 - for문
        for (int i = 0; i < data1.length; i++) {
            System.out.println(data1[i]);
        }

        System.out.println("-------------String Array-----------------");

        //문자열 배열 선언과 생성 동시에
        String[] data2 = new String[3];

        //문자열 배열 사용 - 향상된 for문
        for (String value : data2) {
            System.out.println(value);
        }

        System.out.println("----------After Initialize------------");
        //값 할당
        data2[0] = "첫번째";
        data2[1] = "두번째";
        data2[2] = "세번째";

        for (String value : data2) {
            System.out.println(value);
        }
    }
}
