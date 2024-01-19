package com.ohgiraffers.section04.wrapper;

/**
 * 목표<br><br>
 * Wrapper 클래스에 대해 이해하고 활용할 수 있다. <br>
 */

public class Application1 {
    public static void main(String[] args) {
        int intValue = 20;
        /*설명. 기본자료형을 래퍼 클래스 자료형 변환 가능(박싱)*/
        Integer boxingInt = (Integer) intValue;
        Integer boxingInt2 = Integer.valueOf(intValue);
        Integer boxingInt5 = (Integer) 20;

        /*설명. 래퍼클래스 자료형을 기본자료형으로 변환 가능(언박싱)*/
        int unboxingValue1 = boxingInt.intValue();

        /*설명. 기본자료형과 래퍼 클래스는 자동으로 박싱, 언박싱 가능*/
        Integer autoBoxingInt = intValue;
        int autoUnboxingValuew = autoBoxingInt;
    }
}
