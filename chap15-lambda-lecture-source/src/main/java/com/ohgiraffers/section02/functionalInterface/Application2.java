package com.ohgiraffers.section02.functionalInterface;

import java.time.LocalDateTime;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/**
 * 목표<br><br>
 * 표준 함수적 인터페이스 중 Supplier 에 대해 이해하고 사용할 수 있다. <br>
 */

public class Application2 {
    public static void main(String[] args) {
        //설명. 매개변수 없고 반환값만 있는 메소드 관련 람다식

        /*목차 1. Supplier*/
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();//참고. 괄효는 매개변수가 하나인경우를 제외하면 무조건 들어가야 한다.
        System.out.println(supplier.get());
        /*목차 2. BooleanSupplier*/
        BooleanSupplier booleanSupplier = ()->{
            int random = (int)(Math.random()*2);
            return random == 0? false:true;
        };
        System.out.println("랜덤 true or false: "+booleanSupplier.getAsBoolean());
    }
}
