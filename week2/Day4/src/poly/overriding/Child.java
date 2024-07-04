package poly.overriding;

class Child extends Parent{

    public String value = "child";

    @Override
    public void method() {
        System.out.println("Child.method");
    }
}