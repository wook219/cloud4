package ex.Q4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        public static void main(String[] args) {
            String filePath = "./Hello.txt";

            long startTime1 = System.nanoTime();
            try (FileReader fileReader = new FileReader(filePath)) {
                int data;
                while ((data = fileReader.read()) != -1) {
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            long endTime1 = System.nanoTime();
            System.out.println("FileReader 수행 시간: " + (endTime1 - startTime1) + "ns");

            long startTime2 = System.nanoTime();

            // 지시사항을 참고하여 코드를 작성해 보세요.
            try{
                BufferedReader br = new BufferedReader(new FileReader(filePath));
                String line;
                while((line = br.readLine()) != null){

                }
            }catch(IOException e){
                e.printStackTrace();
            }


            long endTime2 = System.nanoTime();

            System.out.println("BufferedReader 수행 시간: " + (endTime2 - startTime2) + "ns");
        }
    }
}
