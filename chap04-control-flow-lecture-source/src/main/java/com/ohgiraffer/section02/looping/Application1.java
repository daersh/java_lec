package com.ohgiraffer.section02.looping;

public class Application1 {

    public static void main(String[] args) {

        A_for a_for = new A_for();
        /*필기. 단독 for 문 흐름 확인용 메소드 호출*/
//        a_for.testSimpleForStatement();
        /*필기. 반복문 사용하는 예제(반복문의 중요성)*/
//        a_for.testForExample1();
        /*필기. 입력값을 사용하는 반복문 예제*/
//        a_for.testForExample2();

        B_nestedFor bClass = new  B_nestedFor();
        /*필기. 중첩된 반복문을 사용하는 예제*/
//        bClass.printGugudanFromTwoToNine();
        /*필기. 중첩된 반복문을 하나의 기능으로 분리하는 예제*/
//        bClass.printUpgradeGugudanFromTwoToNine();
        /*필기. 별찍기*/
//        bClass.printStars();

        C_while cClass= new C_while();
        /*필기. 단독 while문 흐름 확인용 메소드 호출*/
//        cClass.testSimpleWhileStatement();
        /*필기. while문 사용 예제*/
//        cClass.testWhileExample();

        D_doWhile dClass = new D_doWhile();
        /*필기. 단독 do-while문 흐름 확인용 메소드 호출*/
        dClass.testSimpleDoWhileStatement();
        dClass.testDoWhileExample();
    }
}
