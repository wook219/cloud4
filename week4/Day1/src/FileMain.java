import java.io.File;

public class FileMain {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if(file.exists()){
            System.out.println("File name : " + file.getName());
            System.out.println("Absolute path : " + file.getAbsolutePath());
            System.out.println("Writeable : " + file.canWrite());
            System.out.println("Readable : " + file.canRead());
            System.out.println("File size in bytes : " + file.length());
        }else{
            System.out.println("The file does not exist.");
        }
    }
}
