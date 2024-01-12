package com.ohgiraffer.section03.math;

public class Application2 {
    public static void main(String[] args) {
        /*수업목표. 사용자 지정 범위의 난수 생성할 수 있다.(java.lang.Math 클래스)*/
                    /*참고. java.lang 패키지들은 import 안해도 사용 가능하다!!*/
        /*목차. 1. 0~9 난수 생성*/
        System.out.println("(int)(Math.random()*10) ="+(int)(Math.random()*10));
        /*목차. 2. 1~10 난수 생성*/
        System.out.println("(int)(Math.random()*10+1) ="+(int)(Math.random()*10+1));
        /*목차. 3. 10~15 난수 생성*/
        System.out.println("(int)(Math.random()*6+10) ="+(int)(Math.random()*6+10));
        /*목차. 4. -128~127 난수 생성*/
        System.out.println("(int)(Math.random()*256+-128) ="+(int)(Math.random()*256+-128));
    }
}
