package lang;

public class StringBuilderMain {
    public static void main(String[] args) {
        String[] answers = {"a","b","c"};
        StringBuilder stringBuilder = new StringBuilder();

        for (String answer : answers) {
            stringBuilder.append(answer);
        }

        System.out.println(stringBuilder);
    }
}
