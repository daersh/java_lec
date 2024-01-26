package com.ohgiraffers.section02.functionalInterface;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * 목표<br><br>
 * 표준 함수적 인터페이스 중 Predicate 에 대해 이해하고 사용할 수 있다. <br>
 */
public class Application5 {
    public static void main(String[] args) {
        //설명. boolean 반환형을 가지는 메소드 관련 람다식이다.

        Predicate<Object> predicate = value -> value instanceof String;

        System.out.println("문자열 확인: "+ predicate.test("123"));

    }
}
