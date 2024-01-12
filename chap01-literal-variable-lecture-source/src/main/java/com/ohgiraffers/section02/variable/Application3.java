package com.ohgiraffers.section02.variable;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Application3 {
    static StringBuffer sb;
    static BufferedWriter br;
    public static void init()throws IOException {
        sb = new StringBuffer();
        br = new BufferedWriter(new OutputStreamWriter(System.out));

    }
    public static void print_str()throws IOException{
        br.flush();
        br.write(sb.toString());
        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        /* 수업목표. 변수의 명명 규칙에 대해 이해할 수 있다.*/
        /* 필기.
         *  변수의 명명 규칙
         *    변수의 이름을 지을 때 아무렇게나 짓는 것이 아닌 정해진 규칙이 있다.
         *    실무적으로는 굉장히 중요하기 때문에 반드시 숙지해야 한다.
         *    또한, 규칙에 맞는 올바른 변수명을 짓는 것이 좋은 프로그래밍을 하는 첫 단계이다.
        * */

        /* 목차. 1. 컴파일 에러를 발생시키는 규칙 */
        /* 목차. 1-1. 동일한 범위 내에서 동일한 변수명 가질 수 없음*/
        int age = 20;
//        int age = 30; 같은 이름 선언 불가.
        age = 30;

        /*목차. 1-2. 예약어 사용 불가*/
//      int for= 1;
//      int for=1;
//      int True

        /*목차. 1-3. 변수명은 대소문자를 구분한다.*/
        int aGe =20;
        int AGE = 1;

        /*목차. 1-4. 변수명은 숫자로 시작 불가*/
//        int 1safsd =0;

        /*목차. 1-5. 특수기호는 '_'과 '$'만 가능*/
        int _age = 10000;
        int $$harp = 10;
        // int %harp = 111;

        /*목차. 2. 컴파일 에러를 발생시키지 않지만 개발자들간의 암묵적인 규칙(관례)*/
        /*목차. 2-1.변수명의 길이는 제한 없지만 적당히 하자*/
        int dsaffasddffsdaasdf; //
        /*목차. 2-2. 변수명이 합성오로 이루어졌으면 첫단어는 소문자, 두번째 단어부터 대문자 */
        int maxAge = 50; //낙타 표기법(camel)
        int minAge = 10;
        int max_age = 50; // snake표기법
        /*목차. 2-3. 한글 변수명 되지만 하지 말 것*/
        int 나이 = 19;
        /*목차. 2-4. 변수 안에 저장될 값을 고려하여 의미있고 명확한 이름으로 작성한다.*/
        String name;
        /*목차. 2-5. 명사형으로 작성할것*/
//        String goHome;
        String home;

        /*목차. 2-6. boolean 자료형은 긍정의무문 형태로 작성*/
        boolean isAlive = true;
//        boolean isDead = false;


        print_str();
    }
}
