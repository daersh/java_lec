package com.ohgiraffer.section03.math;

import java.util.Random;

public class Application3 {
    public static void main(String[] args) {
        /*수업목표. 사용자 지정 범위의 난수 생성할 수 있다.(java.util.Random 클래스)*/
        /* 설명 . java.util.Random 클래스는 메소드를 non-static 메소드로 제공하여 객체 생성해야함*/

        // 설명. Random 객체 생성
        Random random = new Random();

        /*목차. 1. 0~9 난수 생성*/
        System.out.println("random.nextInt(10) ="+random.nextInt(10));

        /*목차. 2. 1~10 난수 생성*/
        System.out.println("(random.nextInt()%10+1) ="+(random.nextInt()%10+1));

        /*목차. 3. 10~15 난수 생성*/
        System.out.println("(random.nextInt(6)+10) ="+(random.nextInt(6)+10));

        /*목차. 4. -128~127 난수 생성*/
        System.out.println("(random.nextInt(256)-128 ) ="+(random.nextInt(256)-128 ));

    }
}
