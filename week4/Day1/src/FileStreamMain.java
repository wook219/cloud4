import java.io.*;

public class FileStreamMain {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("input.txt");
            FileOutputStream fos = new FileOutputStream("input.txt");

            int byteData;
            while((byteData = fis.read()) != -1){
                fos.write(byteData);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader("input.txt");
            FileWriter fw = new FileWriter("input.txt");

            int charData;
            while((charData = fr.read()) != -1){
                fw.write(charData);
            }

            fr.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
