package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * <b>목표 </b><br><br>
 * time 패키지의 클래스들에 포매팅을 적용하여 출력할 수 있다. <br>
 */
public class Application5 {

    /**
     * <b>설명 <br>
     *  @parse: 문자열을 time패키지 자료형으로 파싱할 수 있다. <br>
     *  자동으로 인식 가능한 문자열 패턴
     */
    public static void main(String[] args) {
        parse1();
        parsePattern();
    }

    /**
     * <b>1. 규격을 맞춰서 만드는 경우
     */
    private static void parse1() {
        String timeNow = "14:05:10";
        String dateNow = "2022-10-12";

        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDate localDate = LocalDate.parse(dateNow);
        LocalDateTime localDateTime = LocalDateTime.parse(dateNow+ "T" + timeNow);

        System.out.println(localTime);
        System.out.println("localDate = " + localDate);
        System.out.println("localDateTime = " + localDateTime);
    }

    /**
    * <b>2. 기본 패턴이 아닌 경우</b><br>
     * @2-1. 기본 패턴이 아닌 문자열을 time 패키지 자료형에 인식시키기
     * @2-2. time 패키지가 인식한 날짜 및 시간을 원하는 문자열로 반환시키기
    * */
    private static void parsePattern(){
        System.out.println(" ");
        String timeNow2 = "14-05-10";
        String dateNow2 = "221005";

        /*설명 2-1. 기본 패턴이 아닌 문자열을 time 패키지 자료형에 인식시키기*/
        LocalTime localTime = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        LocalDate localDate = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd"));
        LocalDateTime localDateTime = LocalDateTime.parse(localDate+"T"+localTime);
        System.out.println("localTime = " + localTime);
        System.out.println("localDate = " + localDate);
        System.out.println("localDateTime = " + localDateTime);

        /*설명 2-2. time패키지가 인식한 날짜 및 시간을 원하는 문자열로 반환*/
        String dateFormat = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String timeFormat = localTime.format(DateTimeFormatter.ofPattern("HH mm"));
        System.out.println("dateFormat = " + dateFormat);
        System.out.println("timeFormat = " + timeFormat);

    }
}
