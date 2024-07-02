package method;

class Calculator{

    public int plusAnyTwoDatas(int a, int b){
        return a + b;
    }

    public int plusAnyTwoDatas(String a, int b){
        return Integer.parseInt(a) + b;
    }

    public int plusAnyTwoDatas(int a, String b){
        return a + Integer.parseInt(b);
    }

    public int plusAnyTwoDatas(String a, String b){
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

    }
}
