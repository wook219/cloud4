import java.io.FileReader;
import java.io.IOException;

public class CharacterInputStreamMain {
    public static void main(String[] args) {
        FileReader fr = null;

        try{
            fr = new FileReader("example.txt"); //FileReader인스턴스 생성 생성자를 통해 파일의 경로 전달
            int i;

            while((i = fr.read()) != -1){ // 한문자씩 데이터 읽기, 읽을 문자 없을 경우 -1반환
                System.out.println((char) i);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(fr != null){
                try{
                    fr.close(); // 자원 해제
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
