package com.ohgiraffers.section01.intenum;


import java.util.Scanner;

/**
 * 목표<br><br>
 * Int Enum <br>
 */
public class Application {
    public static void main(String[] args) {
        System.out.println(Subjects.JAVA);
        System.out.println(Subjects.MARIADB);
        System.out.println(Subjects.JDBC);

        System.out.println(Subjects.HTML);
        System.out.println(Subjects.CSS);
        System.out.println(Subjects.JAVASCRIPT);

        int sub1= Subjects.JAVA;
        /*설명. Enum 안 쓸 떄의 단점들*/
        /*설명 1. 둘 다 상수이자 숫자일 뿐인데 같은 숫자일 경우 구분할 수 없는 문제 발생*/
        System.out.println(sub1 == Subjects.HTML); // 결과. TRUE;;

        /*설명 2 . 이름 충돌 방지를 위해서는 접두어를 써서 구분할 것 (이름, 번호가 같을 때)
            * 예) JAVASCRIPT -> BACK_JAVASCRIPT, FRONT_JAVASCRIPT
        * 설명 3 . 변수명에 쓰인 이름/문자열 출력은 어려움(feat. switch)
        * */
        Scanner sc =new Scanner(System.in);
        int fieldNo = sc.nextInt();
        String subName ="";

        switch (fieldNo){
            case Subjects.JAVA : subName= "JAVA"; break;
            case Subjects.MARIADB:  subName= "MARIADB"; break;
            case Subjects.JDBC:  subName= "JDBC"; break;
        }
        System.out.println("subName = " + subName);
        /*설명 4. 같은 클래스에 속한 상수들을 순회(반복자,반복문)할 수 없다(전체 필드의 갯수도 알 수 없음.)*/
        /*설명 5. 타입 안전성을 보장할 수 없다. (Subject.JAVA라는 것과 단순 정수값이 구분이 안되기 때문)*/
        printSubject(Subjects.JAVA);
        printSubject(0);        // 중요. 대충 아무 int값이나 전달해도 해당 메소드가 실행되는 문제 있다. (필드 갯수도 알 수 없음)

    }

    private static void printSubject(int java) {}


}
