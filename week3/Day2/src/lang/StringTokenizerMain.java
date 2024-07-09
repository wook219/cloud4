package lang;

import java.util.StringTokenizer;

public class StringTokenizerMain {
    public static void main(String[] args) {
        String s = "apple,banana,grape";
        StringTokenizer stringTokenizer = new StringTokenizer(s,",");

        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
