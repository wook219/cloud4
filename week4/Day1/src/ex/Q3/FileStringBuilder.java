package ex.Q3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStringBuilder {
    public static void main(String[] args) {
        String inputFilename = "./Hello.txt";
        System.out.println("파일 내용: " + readFileContent(inputFilename));
    }

    public static String readFileContent(String inputFilename) {
        // 지시 사항에 따라 코드를 작성해 보세요.
        try{
            FileInputStream fis = new FileInputStream(inputFilename);

            StringBuilder sb = new StringBuilder();

            int i;
            while((i = fis.read()) != -1){
                sb.append((char)i);
            }

            return sb.toString();

        }catch(FileNotFoundException e){
            e.printStackTrace();
            return "파일을 찾을 수 없습니다.";
        }catch(IOException e){
            e.printStackTrace();
            return "파일을 읽는 중 오류가 발생했습니다.";
        }
    }
}
