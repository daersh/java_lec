package com.ohgiraffers.section05.calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 목표<br><br>
 * java.util.Date 클래스 사용법을 이해하고 사용할 수 있다.<br>
 */
public class Application1 {



    public static void main(String[] args) {
        Date today = new Date();

        System.out.println("today = "+today);                               // 설명. 오늘 날짜,시간,년도
        System.out.println("long 타입 시간: " + today.getTime());  //설명. 1970.1.1 00:00 로부터 얼마나 흘렀는지 보여주는 것.
        System.out.println("long 타입 시간을 활용한 Date형: " + new Date(today.getTime()));
        System.out.println("기분 시간(1970년 9시 0분 0초: )"+ new Date(0L));    // 설명. 우리나라 기준으로 9시 시작이기 때문.


        /*설명. 우리가 원하는 형태로 출력하기(feat. SimpleDateFormat, long 타입 활용하기)*/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        String todayFormat = sdf.format(today);
        System.out.println("todayFormat= "+ todayFormat);

        sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
        todayFormat = sdf.format(today);
        System.out.println("todayFormat= "+ todayFormat);

        /*설명.1. java.util.Date -> java.sql.Date*/
        java.sql.Date sqlDate = new java.sql.Date(today.getTime());     // java.util.Date를 long형으로 변환 sql.Date
        // java.sql.Date sqlDate2 = (java.sql.Date)today;        //err  // 1. 실제 sql.Date형이었던 날짜형을 util.Date형인 today에 담겨있었다면 이방법도 가능.
        /*설명.2. java.sql.Date -> java.util.Date*/
        java.util.Date utilDate = sqlDate;                              //
        java.sql.Date sqlDate2 = (java.sql.Date)utilDate;               // 2. sql을 담고 있던 utilDate를 담는 건 가능하다.

        System.out.println("sqlDate = " + sqlDate);
        System.out.println("sqlDate2 = " + sqlDate2.toString());
        System.out.println("utilDate = " + utilDate);

    }
}
