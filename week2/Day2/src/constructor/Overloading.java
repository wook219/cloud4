package constructor;

class Person3{
    private String name;
    private String nickname;
    private int age;

    Person3(){
        this.name = "기본 이름";
        this.nickname = "기본 닉네임";
        this.age = 10;
    }

    Person3(String name, String nickname){
        this.name = name;
        this.nickname = nickname;
        this.age = 10;
    }

    Person3(String name, String nickname, int age){
        this.name = name;
        this.nickname = nickname;
        this.age = age;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Person3 person1 = new Person3();
        Person3 person2 = new Person3("엘리스","헬로빗");
        Person3 person3 = new Person3("캐터필러", "닉네임", 21);
    }
}
