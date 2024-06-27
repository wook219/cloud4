public class IfMain3 {
    public static void main(String[] args) {
        int age = 10;

        if(age >= 19){
            System.out.println("성인");
        }else if(age < 13){
            System.out.println("어린이");
        }else{
            System.out.println("청소년");
        }

        /*
        if(조건식){
            //1. 조건식이 참인 경우 실행
        } else if(조건식2){
            //2. 조건식이 참인 경우 실행
        } else{
            //3. 앞의 조건에 해당하지 않는 모든 경우 실행
        }
         */
    }
}
