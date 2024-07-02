package constructor;

class Person4{
    private String name;
    private String nickname;
    private int age;

    Person4(){
        this("기본 이름", "기본 닉네임", 1);
    }

    Person4(String name, String nickname){
        this(name, nickname, 1);
    }

    Person4(String name, String nickname, int age){
        this.name = name;
        this.nickname = nickname;
        this.age = age;
    }
}


public class This {
    public static void main(String[] args) {
        Person4 person1 = new Person4();
        Person4 person2 = new Person4("엘리스","헬로빗");
        Person4 person3 = new Person4("캐터필러","닉네임",21);
    }
}
