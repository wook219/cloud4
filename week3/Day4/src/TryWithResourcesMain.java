import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesMain {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("someFile.txt"))){
            String line = null;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
