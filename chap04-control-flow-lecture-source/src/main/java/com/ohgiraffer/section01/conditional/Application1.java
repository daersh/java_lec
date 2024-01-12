package com.ohgiraffer.section01.conditional;

/*설명. 이제부터 실행용 클래스를 구분해서 사용한다. (main 메소드만 여기에 포함)*/
public class Application1 {

    static private A_if a_if = new A_if();
    static private b_ifElse b_ifElse= new b_ifElse();
    static private c_ifElseIf c_ifElseIf = new c_ifElseIf();
    public static void main(String[] args) {

        /*필기. 단독 if 문 흐름 확인용 메소드 호출*/
//        a_if.testSimpleIfStatement();
        /*필기. 중첩 if 문 흐름 확인용 메소드 호출*/
//        a_if.testNestedIfStatement();
//
        /*필기. 단독 if_else 문 흐름 확인용 메소드 호출*/
//        b_ifElse.testSimpleIfElseStatement();

        /*필기. 중첩 if_else 문 흐름 확인용 메소드 호출*/
//        b_ifElse.testNestedIfElseStatement();

        /*필기. 단독 if-else-if 문 흐름 확인용 메소드 호출*/
        //c_ifElseIf.testSimpleIfElseIfStatement();
        /*필기. 중첩 if-else-if 문 흐름 확인용 메소드 호출*/
        //c_ifElseIf.testNestedIfElseIfStatement();
        /*필기. 중첩 if-else-if 문 흐름 확인용 메소드 호출*/


        D_switch dClass = new D_switch();
        /*필기. switch문 흐름 확인용 메소드 호출*/
        dClass.testSimpleSwitchStatement();
    }
}
