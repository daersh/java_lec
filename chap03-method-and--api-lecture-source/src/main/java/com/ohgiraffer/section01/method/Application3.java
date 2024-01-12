package com.ohgiraffer.section01.method;

public class Application3 {


    static int global = 10;                                     // 참고. 전역변수이자 클래스 변수이다.

    public static void main(String[] args) {
        /*수업목표. 메소드 전달 인자와 매개 변수에 대해 이해하고 메소드 호출 시 활용할 수 있다.*/
        /*필기.
            * 전달인자(argument)와 매개변수(parameter)를 이용한 메소드호출
                * 참고. 지금까지 배운 변수는 지역변수에 해당
        * 필기.변수의 종류
                * 1. 지역변수
                * 2. 매개변수
                * 3. 전역변수(필드)
                * 4. 클래스(static)변수
        * */
        testMethod(14);
        Application3 application3 = new Application3();
        application3.testMethod(123);
        application3.testMethod('A');                       // 참고. CHAR도 넣을 수 있네...?
        application3.testMethod((int)12.123);                    // 참고. 소수값도 넣을 수 있네...?
        application3.testMethod(Application3.global);            // 참고. 클래스변수 넣을 수 있네...?

    }

    public static void testMethod(int age){                     // 참고. age: parameter
        System.out.println("당신의 나이는 " + age + "세 입니다.");
        System.out.printf("당신의 나이는 %d세 입니다.\n",age);
    }
}
