package com.ohgiraffer.section01.conditional;

/*설명. 이제부터 실행용 클래스를 구분해서 사용한다. (main 메소드만 여기에 포함)*/
public class Application1 {

    static private A_if a_if = new A_if();

    public static void main(String[] args) {
        /*필기. 단독 if 문 흐름 확인용 메소드 호출*/
        a_if.testSimpleIfStatement();
        /*필기. 중첩 if 문 흐름 확인용 메소드 호출*/
        a_if.testNestedIfStatement();

    }
}
