package com.ohgiraffers.section02.functionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * 목표<br><br>
 *  표준 함수적 인터페이스 중 Operator 에 대해 이해하고 사용할 수 있다.<br>
 */
public class Application4 {
    public static void main(String[] args) {
        /*설명. 매개변수 및반환형이 있지만 모두 같은 타입인 메소드 관련 람다식(feat. generic 타입 동일)*/
        // function은 타입이 달라도 되지만 operator은 타입이 같다.
        BinaryOperator<String> binaryOperator = (str1,str2) -> str1+str2;
        System.out.println(binaryOperator.apply("Hello, ","World!!"));

        UnaryOperator<String> unaryOperator = str -> str+"World2!!";
        System.out.println(unaryOperator.apply("Hello2, "));
    }
}
