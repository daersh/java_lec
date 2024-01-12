package com.ohgiraffer.section01.method;

public class Application2 {

    public static void main(String[] args) {
        /*수업목표. 메소드의 호출 흐름에 대해 이해할 수 있다.(메인에서 한번에 순차적으로 호출하기)*/
        /*
            * 설명.
                * static이 붙어 있지 않은 메소든는 클래스명 변수명 = new 클래스명(); 을 통해 메소드를 호출해야 한다.
                    ** (접근 연산자(.)도 활용) **
        * */

        System.out.println("Application2.main start");
        System.out.println("Application2.main end");
        Application2 application2 = new Application2();
        application2.methodA();
        application2.methodB();
        application2.methodC();
    }

    public  void methodA(){
        System.out.println("Application2.methodA start");
        System.out.println("Application2.methodA end");
    }

    public  void methodB(){
        System.out.println("Application2.methodB start");
        System.out.println("Application2.methodB end");
    }

    public  void methodC(){
        System.out.println("Application2.methodC start");
        System.out.println("Application2.methodC end");
    }
}
