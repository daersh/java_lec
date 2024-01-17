package com.ohgiraffers.section06.statickeyword;

public class Application {
    public static void main(String[] args) {
        /* 수업목표.
                                 ** 목표 **
            ----------------------------------------------------
                * static 키워드에 대해 이해할 수 있다.
            ----------------------------------------------------*/

        /* 필기.
                                        ** static **
            --------------------------------------------------------------------
                * 프로그램이 실행될 때 정적 메모리 영역(static or class영역)에 할당하는 키워드
                * 여러 인스턴스가 공유해서 사용할 목적의 공간이다.
                * 예) singleton 객체
            --------------------------------------------------------------------*/
        /*목차. 1. static 키워드를 필드에서 사용*/
        StaticFieldTest stf1 = new StaticFieldTest();
        /*설명. 현재 두 필드가 가지고 있는 값 확인*/
        System.out.println("non-static field: " +stf1.getNonStaticCount());
        System.out.println("static field: "+ StaticFieldTest.getStaticCount());
        /*설명. 각 필드 값 1씩 증가*/
        stf1.increaseNonStaticCount();
        StaticFieldTest.increaseStaticCount();
        /*설명. 현재 두 필드가 가지고 있는 값 확인*/
        System.out.println("non-static field: " +stf1.getNonStaticCount());
        System.out.println("stf1.static field: "+ stf1.getStaticCount()); // static필드는 클래스.~~ 로 하는게 더 좋다.
        System.out.println("static field: "+ StaticFieldTest.getStaticCount()); // static필드는 클래스.~~ 로 하는게 더 좋다.


        /*설명. 새로운 객체 생성*/
        StaticFieldTest stf2 = new StaticFieldTest();

        System.out.println("non-static field: " +stf2.getNonStaticCount());
        System.out.println("static field: "+ stf2.getStaticCount());


    }
}
