package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product {
    public SmartPhone() {
        super();
        System.out.println("smartphone 클래스 기본 생성자 호출함...");
    }

    //설명. 추상메소드를 물려받은 자식 클래스는 반드시 오버라이딩해야 한다.(강제성 부여)
    @Override
    public void abstractMethod() { //설명. 추상메서드 오버라이딩
        System.out.println("(SmartPhone.abstractMethod) 오버라이딩 한 메소드 호출함...");
    }
    public void printSmartPhone(){
        System.out.println("SmartPhone.printSmartPhone 메소드 호출함...");
    }
}
