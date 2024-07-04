package ex.Q3;

class Animal {
    public void speak() {
        System.out.println("이 동물은 어떤 소리를 낼까요?");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("야옹~");
    }
}

class Bird extends Animal {
    @Override
    public void speak() {
        System.out.println("짹짹!");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        Animal[] animals = {dog, cat, bird};

        for(Animal animal : animals){
            animal.speak();
        }
    }
}
