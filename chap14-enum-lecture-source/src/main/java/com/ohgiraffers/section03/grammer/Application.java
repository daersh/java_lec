package com.ohgiraffers.section03.grammer;

/**
 * 목표<br><br>
 *  <br>
 */
public class Application {
    public static void main(String[] args) {
        UserRole1 user1 = UserRole1.ADMIN;
        System.out.println("user1 = " + user1);
        System.out.println("user1.getNameToLowerCase() = " + user1.getNameToLowerCase());

    }
}
