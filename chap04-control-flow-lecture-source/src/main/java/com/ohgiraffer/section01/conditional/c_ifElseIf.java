package com.ohgiraffer.section01.conditional;

import java.util.HashMap;
import java.util.Scanner;

public class c_ifElseIf {
    static int answer;
    //설명.학생이름, 학생성적, 학점, 학생학점, 학생정보저장
    static String name;
    static int Grade;
     static char []Grade_eng;
    static String student_Grade_eng;
    HashMap<String,String> hashMap= new HashMap<>();
    public void testSimpleIfElseIfStatement() {
        /*수업목표. if-else-if 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.*/
        questions();
        questions_answer();
    }

    public void testNestedIfElseIfStatement() {
        /*수업목표. 중첩된 if-else-if 문의 흐름을 이해하고 적용할 수 있다.*/
        /*필기.
            * ohgiraffers 대학의 김xx 교수님은 학생들 시험 성적을 수기로 계산하여 학점 등급을 매기는 채점방식을 사용하고 있다.
            * 90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D', 마지막으로 60점 미만은 'F' 학점을 준다.
            * 그래서 학생이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.ㅁ
            * * 추가로, 각 등급의 중간점수(95,85,75,65)이상인 경우 '+'를 붙여서 등급을 세분화한다.
        * */
        init();

        while (true) {
            StudentInsert();
            if(name.equals("0") && Grade == 0) {                            //중요. 문자열 비교할 때는 equals 사용할 것. ==하면 주소로 비교하게 되어 false
                System.out.println("프로그램을 종료합니다.");                     //중요. ==: call of reference, equals: call of value
                break;
            }
            StudentGradeEng();
            // hashMap.put(name,student_Grade_eng);
            System.out.println(name + " 학생의 점수는 " + Grade + "점이고, 등급은 " + student_Grade_eng + "입니다.");
        }

    }
    // 설명.학점 init
    private static void init() {
        Grade_eng = new char[5];
        for(int i=0;i<5;i++){
            Grade_eng[i]= (char)(65+i);
        }
    }
    // 설명.학생 이름, 성적 입력
    private static void StudentInsert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("종료(이름:0,성적:0)");
        System.out.println("이름: ");
        name = scanner.nextLine();
        System.out.println("성적: ");
        Grade = scanner.nextInt();
    }
    // 설명.학생 성적 변환
    private static void StudentGradeEng() {
        if(Grade<60 ){
            student_Grade_eng = "F";
            return;
        }else if(Grade==100) {
            student_Grade_eng = "A+";
            return;
        }
        student_Grade_eng =  Grade_eng[9-(Grade/10)]+"";
        if(Grade%10 >=5) student_Grade_eng+="+";
    }


    //설명. 질문에 대한 대답
    private static void questions_answer() {
        while (true) {
            input_method();
            if (answer == 1) {
                System.out.println("이런 거짓말쟁이!! 너에게는 아무런 도끼도 줄 수 없구나!! 이 욕심쟁이야!!");
                continue;
            } else if (answer == 2) {
                System.out.println("욕심이 과하지는 않지만 그래도 넌 거짓말을 하고 있구나!! 어서 썩 꺼지거라!!");
                continue;
            }
            System.out.println("오호~ 정직하구나~ 여기 있는 금도끼, 은도끼, 쇠도끼를 다 가져가거라!!");
            System.out.println("그렇게 산신령은 다시 연못 속으로 홀연히 사라지고 말았다...");
            break;
        }
    }
    // 설명. 답 입력
    private static void input_method() {
        System.out.println("어느 도끼가 너의 도끼이냐? (1. 금도끼, 2. 은도끼, 3. 쇠도끼) :");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextInt();
    }

    private static void questions() {
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");
    }
}
