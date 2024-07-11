public class TryCatchMain {
    public static void main(String[] args) {
        try{
            Class.forName("com.som.nonexistent.ClassName");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
