package com.ohgiraffer.section01.method;

public class Application5 {

    public static void main(String[] args) {
        /*수업목표. 메소드 리턴에 대해 이해할 수 있다.*/
        /* */
        System.out.println("Application5.main start....");
        Application5 application5 = new Application5();
        application5.testMethod();
        System.out.println("Application5.main end....");
    }

    private void testMethod() {
        System.out.println("Application5.testMethod start....");

        return;
        // 참고. 리턴 이후의 코드는 동작하지 않고 컴파일 에러 발생함
    }

}
