package ex.Q2;

@FunctionalInterface
interface StringTransformer {
    // 지시사항을 참고하여 코드를 작성해 보세요.
    String transform(String str);
}

public class StringConversion {
    public static StringTransformer toUpperCaseTransformer = str -> str.toUpperCase();
    public static StringTransformer removeSpacesTransformer = str -> str.replaceAll(" ", "");
    public static StringTransformer addAsteriskTransformer = str -> "*" + str.trim() + "*";

    public static void main(String[] args) {
        String inputString = " Hello, Functional Interface! ";

        System.out.println("대문자 변환 후: " + toUpperCaseTransformer.transform(inputString));
        System.out.println("공백 제거 후: " + removeSpacesTransformer.transform(inputString));
        System.out.println("\"*\" 기호 추가 후: " + addAsteriskTransformer.transform(inputString));
    }
}
