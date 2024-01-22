package com.ohgiraffers.section06.time;


import java.time.*;

/**
 * 목표<br><br>
 *  <b>time</b> 패키지에서 제공하는 클래스들의 사용법을 이해할 수 있다.<br>
 */
public class Application1 {

    static LocalTime timeNow = LocalTime.now();
    static LocalTime timeOf = LocalTime.of(18,30,20 );
    static LocalDate DateNow = LocalDate.now();
    static LocalDate DateOf = LocalDate.of(2024,1,22);     // 여기서의 달은 1~ 12로 됨 // DATE에서는 0~11


    public static void main(String[] args) {
        LocalTimeUse();
        LocalDateUse();
        LocalDateTimeUse();
        ZonedDateTimeUse();
    }

    private static void LocalTimeUse(){
        System.out.println("timeNow = " + timeNow);
        System.out.println("timeOf = " + timeOf);

    }

    private static void LocalDateUse(){
        System.out.println("localDate = " + DateNow);
        System.out.println("DateOf = " + DateOf);
    }

    private static void LocalDateTimeUse() {
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("dateTimeNow = " + dateTimeNow);
        LocalDateTime dateTimeOf = LocalDateTime.of(DateNow, timeNow);
        System.out.println("dateTimeOf = " + dateTimeOf);

    }

    private static void ZonedDateTimeUse() {
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        System.out.println("zonedDateTimeNow = " + zonedDateTimeNow);
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(DateOf,timeOf, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTimeOf = " + zonedDateTimeOf);
    }
}
