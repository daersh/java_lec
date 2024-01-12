package com.ohgiraffer.section01.method;

public class Application6 {

    public static void main(String[] args) {
        /*수업목표. 반환값이 있는 메소드 테스트*/
        System.out.println("Application6.main start...");
        Application6 application6= new Application6();
        String returnText = application6.testMethod();
        System.out.println("returnText= "+returnText);
        System.out.println("returnText= "+application6.testMethod());

        System.out.println("Application6.main end...");
    }

    private String testMethod() {

        System.out.println("Application6.testMethod start...");
        System.out.println("Application6.testMethod end...");
        return "back main\n"; // 참고. return null 시켜도 된다.
    }
}
