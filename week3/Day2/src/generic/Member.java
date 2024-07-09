package generic;

 class Member {
     private int id;
     private int age;

     @Override
     public String toString(){
         return "[MEMBER " + id + "-" + age + "]";
     }
}

class Test{
     public static <T extends Member> String returnString(T input){
         return input.toString();
     }

     private Test(){}
}
