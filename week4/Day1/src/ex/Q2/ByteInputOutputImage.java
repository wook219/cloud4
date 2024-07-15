package ex.Q2;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteInputOutputImage {
    public static void main(String[] args) {

        String sourceFilePath = System.getProperty("user.dir") + "/image.png";
        String destinationFilePath = System.getProperty("user.dir") + "/copied-image.png";

        // 지시 사항을 참고하여 코드를 작성해 보세요.
        try{
            FileInputStream fis = new FileInputStream(sourceFilePath);
            FileOutputStream fos = new FileOutputStream(destinationFilePath);

            int byteData;
            while((byteData = fis.read()) != -1){
                fos.write(byteData);
            }
        } catch(FileNotFoundException e){
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch(IOException e){
            System.out.println("파일 작성 중 오류가 발생했습니다.");
            e.printStackTrace();
        }

    }
}
