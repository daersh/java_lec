package com.ohgiraffers.section03.grammer;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * 목표<br><br>
 *  Enum 문법에 대해 이해하고 활용할 수 있다.<br>
 */
public class Application {
    public static void main(String[] args) {
        UserRole1 user1 = UserRole1.ADMIN;      //모든 필드의 생성자 호출됨
        System.out.println("user1 = " + user1);
        System.out.println("user1.getNameToLowerCase() = " + user1.getNameToLowerCase());


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
