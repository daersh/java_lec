package com.ohgiraffers.section02.string;

/**
 * 목표<br><br>
 * 이스케이프 문자에 대해 이해하고 적용할 수 있다.<br>
 * <br>
 * 이스케이프 문자: 문자열 내에서 사용하는 특수 기능을 윟한 문자<br>
 * <br>
 * @implNote
 *  \n: 개행<br>
 * \t: tab<br>
 * \': 작은 따음표<br>
 * \": 큰 따음표<br>
 * \\: 역슬래쉬<br>
 */
public class Application4 {
    public static void main(String[] args) {
        System.out.println("안녕하세요. \n 저는 홍길동입니다.");
        System.out.println("안녕하세요. \t 저는 홍길동입니다.");
        System.out.println("안녕하세요. \' 저는 홍길동입니다.");
        System.out.println("안녕하세요. \' 저는 홍길동\'입니다.");
        System.out.println(" \\ ");


    }
}
