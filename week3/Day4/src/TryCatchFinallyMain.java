import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinallyMain {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("someFile.txt"));
            System.out.println(reader.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(reader != null){
                try{
                    reader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
