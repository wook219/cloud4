package lambdaMaster;

@FunctionalInterface
interface MyFunction2{
    void run();
}

public class Ex03 {
    static void excute(MyFunction2 f){
        f.run();
    }

    static MyFunction2 getMyFunction(){
        MyFunction2 f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        MyFunction2 f1 = () -> System.out.println("f1.run()");

        MyFunction2 f2 = new MyFunction2() {
            @Override
            public void run(){
                System.out.println("f2.run()");
            }
        };

        MyFunction2 f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        excute(f1);
        excute( () -> System.out.println("run()"));

    }
}
