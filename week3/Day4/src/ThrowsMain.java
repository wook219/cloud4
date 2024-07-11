import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsMain {
    public static void main(String[] args) {
        try{
            String content = readFile("example.txt");
            System.out.println(content);
        }catch(IOException e){
            System.out.println("파일 읽기 중 오류 발생 : " + e.getMessage());
        }
    }

    public static String readFile(String fileName) throws IOException{
        StringBuilder contentBuilder = new StringBuilder();

        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String currentLine;
            while((currentLine = br.readLine()) != null){
                contentBuilder.append(currentLine).append("\n");
            }
        }
        return contentBuilder.toString();
    }
}
