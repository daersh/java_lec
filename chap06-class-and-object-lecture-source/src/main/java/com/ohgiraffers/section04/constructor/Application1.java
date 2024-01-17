package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class Application1 {
    public static void main(String[] args) {
        /*수업목표. 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다.*/
        /* 필기
            * 생성자: 인스턴스를 생성할 때 호출하는 반환형이 없는 함수.
                * 기본 생성자와 매개변수 있는 생성자로 나뉠 수 있다.
        * */
        /* 필기 1. 기본생성자(매개변수 없는)를 활용한 객체 생성 */
        User user1 = new User();
        System.out.println(user1.forInformation());
        /* 필기 2. 매개변수 있는 생성자를 활용한 객체 생성 */
        User user2 = new User("user01","pass01","피카츄",new Date());
        System.out.println(user2.forInformation());
    }
}
