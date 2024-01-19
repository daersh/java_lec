package com.ohgiraffers.section03.interfaceimplements;

import java.io.Serializable;

//설명. interface는 다중구현(다중상속 개념) 가능하다.
public class Product implements InterProduct, Serializable {
    @Override
    public void test1() {

    }

    @Override
    public void test3() {
        callTest();
    }

    @Override
    public void test4() {

    }

    @Override
    public void nonStaticMethod() {

    }
    @Override
    public void test2(){
        callTest();

    }

    public void staticTest(){
        System.out.println("Product.defaultMethod() 호출됨....!! ");
    }
}
