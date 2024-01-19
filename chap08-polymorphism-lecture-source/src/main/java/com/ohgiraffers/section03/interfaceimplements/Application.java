package com.ohgiraffers.section03.interfaceimplements;

public class Application {
    public static void main(String[] args) {
        /* 수업목표.
                                                ** 목표 **
                            ----------------------------------------------------
                                       * 인터페이스에 대해 이해할 수 있다. *
                            ----------------------------------------------------*/

        /* 필기.
                                             ** interface **
                ----------------------------------------------------------------------------
                    * 자바의 클래스와 유사한 형태지만 추상 메서드와 상수 필드만 가질 수 있는 클래스의 변형체
                    * 상수 필드(public static final)만 가질 수 있다.
                ---------------------------------------------------------------------------- */
       /* 필기.
                                              ** 정보 은닉 **
                                     --------------------------------
                                              - 유지보수를 위함 -
                                         * 필드, 메서드 은닉(캡슐화)
                                         * 타입 은닉(다형성)
                                         * 구현 은닉(다형성, 오버라이딩)
                                     --------------------------------*/

        /*설명. 추상클래스와 인터페이스의 차이 숙지할 것.*/
        Product product = new Product();
        product.test2();
        product.staticTest();
        product.callTest();
        InterProduct.staticTest();

        product.test3();
        //InterProduct ip1 = new InterProduct(); //생성자가 없는 인터페이스는 객체 생성 불가
        InterProduct ip2 = new Product(); //다만 타입으로는 활용 가능(다형성 가능) + (타입은닉)
        ip2.callTest();

    }
}
