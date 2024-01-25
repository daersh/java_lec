package com.ohgiraffers.section03.grammer;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * 목표<br><br>
 *  Enum 문법에 대해 이해하고 활용할 수 있다.<br>
 */
public class Application {
    public static void main(String[] args) {
        /*필기.
         * enum 타입의 필드를 최초 사용 시에만 열거 타입의 인스턴스를 최초 하나만 생성하고 이후에는 생성자를 호출하지 않는다.
         * 또한 enum 타입은 set으로 바꾸어 반복시키며 필드들을 한번에 확인하고 활용할 수 도 있다.
         * */
        /*목차 1. 매개변수 없는 기본 Enum 사용 */
        UserRole1 user1 = UserRole1.ADMIN;      //모든 필드의 생성자 호출됨
        System.out.println("user1 = " + user1);
        System.out.println("user1.getNameToLowerCase() = " + user1.getNameToLowerCase());


        /*목차 2. 매개변수를 가지는 Enum 사용*/
        UserRole2 user2 = UserRole2.CONSUMER; // 모든 필드의 생성자 호출됨
        System.out.println("user2 = " + user2);
        System.out.println("user2.name() = " + user2.name());
        System.out.println("user2.ordinal() = " + user2.ordinal());
        System.out.println("user2.getDescription() = " + user2.getDescription());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++ SET으로 바꾸어 반복자 활용하기 +++++++++++++++++++");
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> iter = roles.iterator();
        while (iter.hasNext()){
            System.out.println("iter.next().name() = " + iter.next().name());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
