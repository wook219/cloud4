package lang;

public class MathRoundMain {
    public static void main(String[] args) {
        double radius = 5;
        double circleArea = radius * radius * Math.PI;
        long circleAreaInInt = Math.round(circleArea);

        System.out.println(circleAreaInInt);

    }
}
