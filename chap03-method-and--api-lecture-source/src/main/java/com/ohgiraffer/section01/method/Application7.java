package com.ohgiraffer.section01.method;

public class Application7 {
    public static void main(String[] args) {
        /*수업목표. 매개변수와 리턴값을 복합적으로 활용하는 것을 이해하고 활용할 수 있다.*/
        int first = 20;
        int second = 10;

        Application7 application7 = new Application7();
        System.out.println("두 수를 더한 값: "+application7.plusTwoNumbers(first,second));
        System.out.println("두 수를 뺀 값: "+application7.minusTwoNumbers(first,second));
        System.out.println("두 수를 곱한 값: "+application7.multiTwoNumbers(first,second));
        System.out.println("두 수를 나눈 값: "+application7.divideTwoNumbers(first,second));
    }

    private int  divideTwoNumbers(int first, int second) {
        return first/second;
    }

    private int multiTwoNumbers(int first, int second) {
        return first*second;
    }

    private int minusTwoNumbers(int first, int second) {
        return first-second;
    }

    private int plusTwoNumbers(int first, int second) {
        return first+second;
    }
}
