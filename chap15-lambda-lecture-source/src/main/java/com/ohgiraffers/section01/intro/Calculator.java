package com.ohgiraffers.section01.intro;

@FunctionalInterface
public interface Calculator {
    int sumTwoNumber(int num1,int num2);
    //중요 @FuntionalInterface 어노테이션에서는 두개 이상 추상 메서드 불가함
    //int sumTwoNumber2(int num1,int num2);

}
