package com.ohgiraffer.section01.method;

public class Application1 {

    public static void main(String[] args) {
        /*수업목표. 메소드의 호출 흐름에 대해 이해할 수 있다.(메소드 호출 시 내부에서 또 다른 메소드 다시 호출하기)*/
        /*
            * 필기.
            *  메소드란?
                * 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.= 함수
            * 참고. 메인도 함수다!!
        * */

        System.out.println("Application1.main");                //

        methodeA();                                             // 중요. static으로 선언해야 객체 생성 없이 바로 사용 가능

        Application1 application1 = new Application1();         // 설명. 객체 선언 후 메소드 호출하는 방법
        application1.methodeA();
    }

    public static void methodeA(){
        System.out.println("Application1.methodeA start");
        methodB();
        System.out.println("Application1.methodeA end");
    }
    public static void methodB(){
        System.out.println("Application1.methodB start");
        methodeC();
        System.out.println("Application1.methodB end");
    }

    public static void methodeC(){
        System.out.println("Application1.methodeC start");
        System.out.println("Application1.methodeC end");
    }
}
