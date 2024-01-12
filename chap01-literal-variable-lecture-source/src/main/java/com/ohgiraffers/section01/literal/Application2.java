package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args) {
        // 수업목표. 값을 직접 연산하여 출력할 수 있다.

        // 목차. 1. 숫자와 숫자의 연산
        System.out.println("===== 정수와 정수의 연산 =====\n");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);
        System.out.println("\n===== 실수와 실수의 연산 =====\n");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 1.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);
        // 필기. 정수와 실수의 연산 결과는 실수가 나온다. (정수를 실수로 바꿔서 연산한다.)
        System.out.println("\n===== 정수와 실수의 연산 =====\n");
        System.out.println(123 + 1.23);
        System.out.println(123 - 1.23);
        System.out.println(123 * 10.0);
        System.out.println(123 / 10.0);
        System.out.println(123 % 0.5);

        // 목차. 2. 문자의 연산
        System.out.println("\n===== 문자와 정수의 연산 =====\n");
        System.out.println('a' + 1);      //설명. a= 97
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);
        System.out.println("\n===== 문자와 실수의 연산 =====\n");
        System.out.println('a' + 1.1);
        System.out.println('a' - 1.1);
        System.out.println('a' * 2.1);
        System.out.println('a' / 2.1);
        System.out.println('a' % 2.1);

        // 목차. 3. 문자열의 연산
        System.out.println("\n===== 문자열과 문자열의 연산 =====\n");
        System.out.println("hello "+"world!!");
            // 필기. + 빼고는 모두 안된다.
//        System.out.println("hello "-"world!!");               // 결과: error
//        System.out.println("hello "*"world!!");               // 결과: error
//        System.out.println("hello "/"world!!");               // 결과: error
//        System.out.println("hello "%"world!!");               // 결과: error
        System.out.println("\n===== 문자열과 다른 형태의 연산 =====\n");
        // 중요. 뭐가 오든 모두 문자열로 취급하여 뒤에 덧붙인다.
        // 설명. 문자열과 정수의 연산
        System.out.println("helloworld" + 123);                 // 결과: helloworld123
        // 설명. 문자열과 실수의 연산
        System.out.println("helloworld" + 123.456);             // 결과: helloworld123.456
        // 설명. 문자열과 문자의 연산
        System.out.println("helloworld" + 'a');                 // 결과: helloworlda
        // 설명. 문자열과 논리값의 연산
        System.out.println("helloworld" + true);                // 결과: helloworldtrue
        // 설명. 이항연산자들의 묶음에서 왼쪽부터 이항씩 연산하면 아래 코드의 결과를 이해할 수 있다.
        System.out.println(123 + 1.2 + "helloworld" + true);    // 결과: 124.2helloworldtrue
        // 설명: 문자열 뒤에 숫자를 활용한 연산을 쓰기 위해서는 소괄호로 우선순위를 높여서 연산을 진행한다.
        System.out.println("합계: "+ (123+345));                 // 결과: 468

        // 목차. 4. 논리값의 연산
//        System.out.println(true+1);                           // 결과: error
//        System.out.println(true*1);                           // 결과: error
        System.out.println(true+"문자열");                        // 결과: true문자열

    }
}
