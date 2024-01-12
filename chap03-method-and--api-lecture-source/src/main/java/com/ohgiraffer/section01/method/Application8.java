package com.ohgiraffer.section01.method;

public class Application8 {
    public static void main(String[] args) {
        /*수업목표. static 메소드를 호출할 수 있다.*/
        System.out.println("10 + 20 = "+ Application8.sumTwoNumbers(10,20));
        System.out.println("10 + 20 = "+ sumTwoNumbers(10,20)); // 참고. 호출하는 static 메소드가 같은 클래스에 존재하면 생략 가능

    }

    private static int sumTwoNumbers(int first, int second) {
        return first+second;
    }


}
