package abstraction.animal;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        dog.eat();
        cat.eat();
        bird.eat();
    }
}
