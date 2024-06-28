import java.util.Scanner;

/*
사용한 변수 : int schoolYear(학년),
            final int SCHOOL_YEAR(막학년),
            int drinkCount(음주 횟수),
            int halfYear(학기),
            double grade(학점),
            int activity(활동),
            Scanner scanner
*/

 /* 메서드
      1. printHelp() : 도움말 출력
      2. graduationReview() : 졸업 심사
      3. printStudentGrade() : 학점 출력
 */

// 1주차에 배운 내용 중 적용 해본 것 : 주석, 변수, 자료형, 연산자, 사용자 입출력, 조건문, 반복문

/*
경우의 수 테스트 해본 것 :
1. 학점 ok 음주 no -> 확인
2. 학점 no 음주 ok -> 이 경우는 나올 수가 없음
3. 학점 ok 음주 ok -> 확인
4. 학점 no 음주 no -> 확인
*/

public class RaiseCollegeStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int schoolYear = 1; // 학년
        final int SCHOOL_YEAR = 4; // 막학년
        int drinkCount = 0; // 음주 횟수
        int halfYear = 1; // 학기
        double grade = 5.0; // 학점

        //게임 소개, 도움말 출력
        printHelp();

        //이름 입력받기
        System.out.print("이름을 입력해주세요.");
        String name = scanner.nextLine();

        //게임 시작
        System.out.println("\n" + name + "키우기를 시작합니다!!!!!");
        while(true){ // 외부 while start!!
            //1,2학기 루프 끝내고 학년+1, 다시 1학기로 초기화
            if(halfYear == 3){
                schoolYear++;
                halfYear = 1;
                if(schoolYear < 5){
                    System.out.println("\n★★★★★★★★★★★★★★★★★★★\n★★★★★" + schoolYear + "학년이 되었습니다★★★★★\n★★★★★★★★★★★★★★★★★★★");
                }
            }

            //5학년이 되면 외부 while문 종료
            if(schoolYear > SCHOOL_YEAR){
                break;
            }

            System.out.println("\n★★★새 학기가 시작되었습니다★★★");

                // 1,2학기 활동 선택 시작
                while(halfYear < 3){ // 내부 while start!!
                    printStudentGrade(name,schoolYear,halfYear,drinkCount,grade); //학생 정보 출력
                    System.out.println("이번 학기는 어떤 활동을 하며 지내실껀가요?\n");

                    System.out.println("1. 공부 2. 스터디 3. 음주 4.도움말");
                    int activity = scanner.nextInt();
                    scanner.nextLine();

                    //activity가 1~4가 아닐 경우, 오류 메시지 출력, 맞을 경우 활동에 따른 로직
                    if(activity >=1 && activity <= 4){
                        if(activity == 3){
                            grade -= 0.5;
                            halfYear++;
                            drinkCount++;
                            break;
                        }else if(activity == 1 || activity == 2){
                            if(grade < 5.0){
                                grade += 0.5;
                                halfYear++;
                                break;
                            }else{
                                halfYear++;
                                break;
                            }
                        }else{
                            printHelp();
                            continue;
                        }
                    }else{
                        System.out.println("잘못된 번호를 입력하셨습니다. 1,2,3중 하나를 골라주세요.");
                    }
                } // 내부 while start!!
                // 1,2학기 활동선택 끝
                
            }// 외부 while end!!

            graduationReview(name, grade, drinkCount); //졸업요건 확인하며 게임 종료
        } // main 메서드 끝


        //도움말 출력 메서드
        static void printHelp() {
            System.out.println("\n================대학생 키우기를 시작합니다.================" +
                    "\n1. 1~4학년까지 대학생을 키우는 게임입니다. 시험은 따로 없고 방과 후 생활에 따른 학점 변화가 있습니다." +
                    "\n2. 학생은 학점 5.0를 가진 상태로 시작하며, 하는 행동에 따라 학점이 유지/감소 됩니다. 학점의 만점은 5이며, 최소 졸업 학점과 음주 횟수 조건에 만족해야 졸업에 성공합니다." +
                    "\n3. 1학기와 2학기로 나뉘며, 이 싸이클이 두번 반복되면 다음 학년으로 올라갑니다." +
                    "\n4. 음주를 하게 되면 0.5의 학점 차감이 있습니다." +
                    "\n5. 공부, 스터디를 하게 되면 0.5의 학점 상승이 있습니다." +
                    "\n6. 4학년 2학기를 마쳐야 졸업 심사를 받게 됩니다." +
                    "\n======================================================="
                    );
            System.out.println("\n=======================졸업 요건=========================\n1. 졸업 학점 : 3.0\n2. 음주 횟수 : 5회까지 허용\n=======================================================\n");
        }


        //졸업 심사 메서드
        static void graduationReview(String name, double grade, int drinkCount){

            if(grade < 3.0 || drinkCount > 5){
                System.out.println("\n학점 : " + grade + "\n" + "음주 횟수 : " + drinkCount + "\n" + name + "님은 졸업 요건을 만족하지 못하였습니다. 졸업에 실패하였습니다ㅠㅠ");
            }else{
                System.out.println("\nCongratulation!!!!!!!!!!!!!!!\n학점 : " + grade + "\n" + "음주 횟수 : " + drinkCount + "\n"+ name + "님은 졸업 요건을 만족하셨습니다. 졸업 축하드립니다!!");
            }
        }

        // 학생 정보 출력 메서드
        static void printStudentGrade(String name, int schoolYear, int halfYear, int drinkCount, double grade){
            System.out.println(
                    "==========학생 정보==========\n" + name + " 학생의 현재 학년/학기 : " + schoolYear + "-" + halfYear + "" +
                    "\n음주 횟수 : " + drinkCount +
                    "\n현재 학점 : " + grade +
                    "\n===========================");
        }

}
