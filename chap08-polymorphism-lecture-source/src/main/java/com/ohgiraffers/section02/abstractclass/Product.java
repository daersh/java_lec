package com.ohgiraffers.section02.abstractclass;

public abstract class Product {     // 설명. 추상화 클래스 선언
                                    // 참고. 추상 메서드가 0개여도 추상 클래스로 만들 수 있다.
    private int nonStaticField;
    private static int staticField;

    public Product() {
        System.out.println("Product 클래스 기본 생성자 호출함...");
    }

    public void NonStaticField() {
        System.out.println("product 클래스의 nonStaticMethod 호출함...");
    }

    public void StaticField() {
        System.out.println("product 클래스의 StaticMethod 호출함...");
    }

    public abstract void abstractMethod();     // 설명. 추상메서드
}
