package com.ohgiraffer.section01.method;


import static com.ohgiraffer.section01.method.Calculator.*;

public class Application9 {
    public static void main(String[] args) {
        /*수업목표. 다른 클래스에 작성한 메소드를 호출할 수 있다.*/
        int first = 100;
        int second = 50;

        Calculator calculator= new Calculator(first,second);
        System.out.println("calculator.plusTwoNum(): "+calculator.plusTwoNum());
        System.out.println("calculator.minusTwoNum(): "+calculator.minusTwoNum());
        System.out.println("calculator.multiTwoNum(): "+calculator.multiTwoNum());
        System.out.println("calculator.divideTwoNum(): "+calculator.divideTwoNum());
        System.out.println();
        System.out.println("calculator.plusTwoNum(first,second): " + plusTwoNum(first,second));
        System.out.println("calculator.minusTwoNum(first,second): " + calculator.minusTwoNum(first,second));
        System.out.println("calculator.multiTwoNum(first,second): " + calculator.multiTwoNum(first,second));
        System.out.println("calculator.divideTwoNum(first,second): " + calculator.divideTwoNum(first,second));
        System.out.println();
        System.out.println("calculator.plusTwoNum(first,second): " + plusTwoNum(first,second));
        System.out.println("calculator.minusTwoNum(first,second): " + minusTwoNum(first,second));
        System.out.println("calculator.multiTwoNum(first,second): " + multiTwoNum(first,second));
        System.out.println("calculator.divideTwoNum(first,second): " + divideTwoNum(first,second));
        System.out.println();
        System.out.println("calculator.plusTwoNum(first,second): " + Calculator.plusTwoNum(first,second));
        System.out.println("calculator.minusTwoNum(first,second): " + Calculator.minusTwoNum(first,second));
        System.out.println("calculator.multiTwoNum(first,second): " + Calculator.multiTwoNum(first,second));
        System.out.println("calculator.divideTwoNum(first,second): " + Calculator.divideTwoNum(first,second));



    }
}
