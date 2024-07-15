import java.io.*;

public class BufferStreamMain {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("example.txt"))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))){
            bw.write("Example of BufferedWriter");
            bw.newLine();
            bw.write("Java I/O is fun!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
