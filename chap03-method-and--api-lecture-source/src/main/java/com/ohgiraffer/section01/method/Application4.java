package com.ohgiraffer.section01.method;

public class Application4 {
    public static void main(String[] args) {
        /* 수업목표. 여러 개의 전달 인자를 이용한 메소드 호출을 할 수 있다. */

        /* 목차. 1. 여러 개의 매개변수를 가진 메소드 호출 */
            //참고. 이 클래스의 내용이 메모리에 올라감. 이를 통해 non-static 메소드 사용 가능
        Application4 application4 = new Application4();
        application4.testMethod("홍길동",20,'남');

        /* 목차. 2. 변수에 저장된 값을 전달하여 호출할 수 있다. */
        String name = "유관순";
        int age = 20;
        char gender= '여';
        application4.testMethod(name,age,gender);
    }

    private void testMethod(String name, int age, char gender) {
        System.out.printf("당신의 이름은 '%s' 이고, 나이는 %d세 이며, 성멸은 '%c' 입니다\n",name,age,gender);
    }

}
