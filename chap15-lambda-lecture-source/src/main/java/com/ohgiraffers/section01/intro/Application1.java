package com.ohgiraffers.section01.intro;

/**
 * 수업목표<br><br>
  * 람다식에 대해 이해하고 활용할 수 있다. (feat. @FunctionalInterface) <br>
 */
public class Application1 {
    public static void main(String[] args) {
        //필기 1.인터페이스를 구현한 구현체(Impl class)를 이요한 방식(동적 바인딩 사용)
        Calculator c1 = new CalculatorImpl();
        System.out.println("10 + 20 ="+ c1.sumTwoNumber(10,20));
        //필기 2. 익명클래스를 활용한 방식(인터페이스의 하위 구현체)
        Calculator c2 = new Calculator() {  //참고. 이벤트 처리할 때 주로 사용.중요. 익명클래스(하위 구현체)라한다.
            @Override
            public int sumTwoNumber(int num1, int num2) {
                return num1 * num2;
            }
        };
        System.out.println("30 * 20 ="+ c2.sumTwoNumber(30,20));


        //필기 3. 람다 방식 (인터페이스에 추상메서드가 하나만 있으니깐 가능) (@FuntionalInterface 없어도 되는 듯)
        Calculator c3 = (x,y) -> {return (x+y)*3;};
        Calculator c3_1 = (x,y) ->  (x+y)*3;
        System.out.println("(30+20)*3 ="+ c3.sumTwoNumber(30,20));
    }
}
