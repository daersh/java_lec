package com.ohgiraffers.section01.intro;


/**
 * 목표<br><br>
 *  람다식을 활용하기 위한 내부 인터페이스 관리 기법에 대해 이해할 수 있다.<br>
 */
public class Application2 {
    public static void main(String[] args) {
        //설명. 인터페이스 안에 있는 내부 인터페이스의 하위 구현체에 존재하는 메소드를 오버라이딩(feat. 람다식 활용)
        //설명. 람다식을 활용해 함수를 별도로 변수에 담는 느낌으로 작성한 코드 (feat. javascript)
        //참고. (x,y)->x+y : 익명함수
        //설명. 람다식으로 내부 인터페이스의 하위 구현체를 변수명으로 정의한다.
        OuterCalculator.Sum sum = (x,y)->x+y;
        OuterCalculator.Minus minus = (x,y)->x-y;
        OuterCalculator.Multiple multiple = (x,y)->x*y;
        OuterCalculator.Divide divide = (x,y)->x/y;

        System.out.println("20과 10의 합 "+ sum.sumTwoNumber(10,20) );
        System.out.println("20과 10의 차 "+ minus.minusTwoNumber(20,10)) ;
        System.out.println("20과 10의 곱 "+ multiple.multiplyTwoNumber(20,10) );
        System.out.println("20과 10의 나누기 "+ divide.divisionTwoNumber(20,10) );
        
    }
}
