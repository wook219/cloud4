import java.io.FileInputStream;
import java.io.IOException;

public class ByteInputStreamMain {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try{
            fis = new FileInputStream("example.txt"); //FileInputStream 인스턴스 생성, 생성자를 통해 파일의 경로 전달
            int i;

            while((i = fis.read()) != -1){ // read() 메서드를 사용한 바이트 단위 읽기
                System.out.println((char)i);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(fis != null){
                try{
                    fis.close(); // 스트림을 닫아 자원 해제
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
