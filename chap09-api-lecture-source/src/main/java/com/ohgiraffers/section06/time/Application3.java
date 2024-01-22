package com.ohgiraffers.section06.time;

import java.time.LocalDateTime;

/**
 * 목표<br><br>
 * time 패키지 클래스를 활용한 덧셈, 뺄셈, 및 불변 특성을 이해할 수 있다. <br>
 */
public class Application3 {

    public static void main(String[] args) {
        //설명. 모두 새로운 객채로 생성되어 주소가 모두 달라지기 때문에 멀티 쓰레드 환경에서 유용하다. -> 불변 특성 (String도 불변 객체)변하지 않는 특성
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("현재 시간 = " + localDateTime);
        System.out.println("주소값 = " +System.identityHashCode(localDateTime));

        LocalDateTime localDateTime1 = localDateTime.plusMinutes(30);
        System.out.println("30분 후 = "+ localDateTime1);
        System.out.println("주소값 = " +System.identityHashCode(localDateTime1));

        LocalDateTime localDateTime2 = localDateTime.minusHours(3);
        System.out.println("3시간 전 = "+ localDateTime2);
        System.out.println("주소값 = " +System.identityHashCode(localDateTime2));


    }
}
