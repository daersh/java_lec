package com.ohgiraffers.section4.override;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 메소드를 오버라이딩 하기 위해서는 부모 메소드에서 발생하는 예외와 같거나 하위 타입은 가능하다.
 * 아예 예외가 발생하지 않더라도 오버라이딩에는 문제가 없다.
 * 반면, 부모의 메소드보다 더 상위 타입의 예외를 발생시키는 오버라이딩 메소드는 컴파일 에러가 발생한다.
 * 그 이유는 부모의 메소드를 고려하여 예외처리한 구문에 문제가 발생되지 않도록 하기 위한 문법이다.
 */
public class SubClass extends SuperClass{
    /*목차. 가능*/
//    @Override
//    public void method() throws IOException {} // 참고. 그대로 해도 괜찮다.
//    @Override
//    public void method() {} //참고. 없는것 괜찮다.
//    @Override
//    public void method() throws FileNotFoundException { //참고. 부모 하위의 타입의 예외도 가능
//    }
    /*목차. 불가능*/
//    @Override
//    public void method() throws Exception {} //참고 에러. 원본보다 상위타입의 예외는 안됨
//    @Override
//    public void method() throws IOException,Exception {} // 참고 이것도 err
}
