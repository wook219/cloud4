import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteOutputStreamMain {
    public static void main(String[] args) {
        FileOutputStream fos = null;

        try{
            fos = new FileOutputStream("output.txt"); // FileOutputStream 인스턴스 생성, 생성자를 통해 파일의 경로전달
            String data = "Hello, Java Byte Streams!";

            byte[] bytes = data.getBytes(); //문자열을 바이트 배열로 변환

            fos.write(bytes); // 바이트 배열을 파일에 쓰기

            System.out.println("Data has been written to the file.");
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(fos != null){
                try{
                    fos.close(); // 자원 해제
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
