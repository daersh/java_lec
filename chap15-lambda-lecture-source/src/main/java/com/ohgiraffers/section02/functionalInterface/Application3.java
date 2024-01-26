package com.ohgiraffers.section02.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * 목표<br><br>
 * 표준 함수적 인터페이스 중 Funtion에 대해 이해하고 사용할 수 있다. <br>
 */
public class Application3 {
    public static void main(String[] args) {
        /*설명. 매개변수 및 반환형이 있는 메소드 관련 람다식*/

        /*목차 1. Function -    매개변수 하나*/
        Function<String, Integer> function = str -> Integer.valueOf(str);       //valueof = parseInt
        String strVal = "12345";
        System.out.println(function.apply(strVal));

        /*목차 2. BiFunction -  매개변수 두개*/
        BiFunction<String, String, Integer> biFunction =
                (str1,str2) -> Integer.valueOf(str1) + Integer.valueOf(str2);
        System.out.println(biFunction.apply(strVal, "11111"));


    }
}
