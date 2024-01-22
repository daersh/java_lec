package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

/**
 * 목표<br><br>
 * time 패키지의 클래스가 제공하는 날짜 비교 연산 메소드를 활용할 수 있다. <br>
 */
public class Application4 {
    static LocalDate localDate = LocalDate.now();
    static LocalDateTime localDateTime = LocalDateTime.now();
    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    static LocalDate past = LocalDate.of(2020,11,11);
    static LocalDateTime future = LocalDateTime.of(2024,6,14,18,0);
    static ZonedDateTime now = ZonedDateTime.now();

    public static void main(String[] args) {
        check();
    }

    /**
     * <b>설명</b><br><br>
     * 이전, 이후, 같은 날짜 확인 <br>
     * <b>각 time 패키지 자료형마다 메소드를 제공하지만 전달인자는 서로 같은 타입이어야 한다.</b>
     * @1.localDate: past의 이후인지 확인
     * @2.localDateTime: future의 이전인지 확인
     * @3.zoneDateTime: now와 같은지 확인
     * <br>
     *
     */
    private static void check(){
        System.out.println(localDate.isAfter(past));
        System.out.println(localDateTime.isBefore(future));
        System.out.println(zonedDateTime.isEqual(now));
    }

}
