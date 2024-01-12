package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main(String[] args) {

        // 한 줄 주석
        /*
            범
              위
                주
                  석
         */
        /* 수업목표. 여러 가지 값의 형태를 출력할 수 있다. */
        /* 목차. 1. 숫자 형태의 값 */
        /* 목차. 1-1. 정수 형태의 값 출력 */
        System.out.println(123);

        // 목차. 1-2 실수 형태의 값 출력
        System.out.println(123.123);

        // 목차. 2. 문자 형태의 값 출력
        System.out.println('a');            // single quatation(')을 적용한다.
        System.out.println('1');            // 숫자도 문자로 취급할 수 있다.
//        System.out.println('ab');         // '' 안에 문자열 들어가면 컴파일러 에러 발생한다.
//        System.out.println('');           // 아무것도 안넣어도 에러 발생
        System.out.println('\u0000');       // 문자 아무것도 안넣었다는 표현할 수 있다.

        // 목차. 3. 문자열 형태의 값 출력
        System.out.println("안녕하세요");      // 문자열은 double quatation(")을 적용한다.
        System.out.println("a");            //  문자 하나를 가진 문자열 표현 가능하다.
        System.out.println("");             // 문자열은 이렇게 해도 문제 없다. 문자는 에러

        // 목차. 4. 논리 형태의 값 출력
        System.out.println(true);
        System.out.println("true");         // 문자열 "true" 논리 아니다.
        System.out.println(false);          // true || false 두 값만 논리 값이다.
        /*
         * 참고
         * 정적타입 vs 동적 타입
         *      정적타입: 자바와 C와 같이 변수의 타입을 지정해줘야 하는 것
         *      동적타입: 자바스크립트, 파이썬과 같이 변수의 타입을 지정할 필요 없는 것
         *              - 자바스크립트에서 정적타입 추가한 타입스크립트가 있음.
         */
    }
}
