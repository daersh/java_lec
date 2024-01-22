package com.ohgiraffers.section05.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

/**
 * <b>목표</b><br><br>
 *  <b>java.util.Calendar</b> 클래스 사용법을 이해하고 사용할 수 있다.
 * <br><br>
 * @Date형 개선점
 * @1. timezone과 관련된 기능이 추가됨<br>
 * @2. 윤년 관련 기능이 내부적으로 추가됨<br>
 * @3. 날짜 및 시간 필드개념을 추가해 불필요한 메소드명을 줄임<br>
 */

public class Application2{

    public static void main(String[] args) {
        /* 설명. calendar 자료형은 생성자를 통해 객체 생성 불가 */
        Calendar calendar =Calendar.getInstance();
        System.out.println("cal = "+ calendar);
        Calendar calendar1 = new GregorianCalendar();
        System.out.println("calendar1 = " + calendar1);

        /* 참고. 0:1월 ~~ 11:12월 */
        int year = 1998;
        int month = 3;
        int dayOfMonth = 1;
        int hour = 17;
        int min = 30;
        int second = 0;
        Calendar birthDay = new GregorianCalendar(year,month,dayOfMonth,hour,min,second);
        System.out.println("birthDay = " + birthDay);
        /*설명. gregorianCalendar 객체가 가진 값 확인*/
        System.out.print("태어난 년도 " +birthDay.get(1)+"  ");
        System.out.print("월 " +(birthDay.get(2)+1)+"  ") ;
        System.out.println("일 " +birthDay.get(5)+"  ");
        System.out.print("태어난 년도 " +birthDay.get(Calendar.YEAR)+"  ");
        System.out.print("월 " +(birthDay.get(Calendar.MONTH)+1)+"  ") ;
        System.out.println("일 " +birthDay.get(Calendar.DAY_OF_MONTH)+"  ");

        /*설명. 요일에 대해 알아보자*/
        String day = "";
        switch (birthDay.get(Calendar.DAY_OF_WEEK)){
            case Calendar.SUNDAY: day= "일"; break;
            case Calendar.MONDAY: day= "월"; break;
            case Calendar.TUESDAY: day= "화"; break;
            case Calendar.WEDNESDAY: day= "수"; break;
            case Calendar.THURSDAY: day= "목"; break;
            case Calendar.FRIDAY: day= "금"; break;
            case Calendar.SATURDAY: day= "토";
        }
        System.out.println("내가 태어난 요일은 "+ day+"요일이야!");

        /*설명. 하나씩 불러오기*/
        System.out.println("AM/PM: "+ birthDay.get(Calendar.AM_PM));
        System.out.println("    hourOfDay: "+ birthDay.get(Calendar.HOUR_OF_DAY));
        System.out.println("                 hour: "+ birthDay.get(Calendar.HOUR));
        System.out.println("                       min: "+ birthDay.get(Calendar.MINUTE));

        /*설명. SimpleDateFormat 활용*/
            /*참고.
            *  1. java.util.Date형으로 변환 후 활용해야 된다.
            *  2. 변황 순서 sql.Date -> .util.Date -> Calender -> SimpleDateFormat
            *  */

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss E요일");     //설명. 프론트와 통신할 떄 날짜를 파싱하는 방법 잘 알아야함.
        //String birthDayString = sdf.format(birthDay);                                     //설명. 이렇게 쓰면 err
        String birthDayString = sdf.format(new java.util.Date(birthDay.getTimeInMillis()));
        System.out.println("birthDayString = " + birthDayString);


    }
}
