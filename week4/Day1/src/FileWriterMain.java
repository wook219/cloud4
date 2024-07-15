import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("example.txt")){ // FileWriter 인스턴스 생성 및 파일 경로 전달
            writer.write("Hello, FileWriter!"); // 텍스트 파일에 특정한 문자 쓰기
            writer.write("\nJava programming is fun.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
