package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * 목표<br><br>
 * 기본 타입 스트림 생성에 대해 이해하고 활용할 수 있다. <br>
 */
public class Application2 {
    public static void main(String[] args) {

        /*설명.
            * range(시작값,종료값): 시작값부터 1 씩 증가하는 숫자로 종료값 직전까지 범위의 스트림 생성한다.
            * rangeClosed(시작값,종료값): 시작값부터 1 씩 증가하는 숫자로 종료값까지 범위의 스트림 생성한다.
        * */
        IntStream intStream = IntStream.range(5,10);
        intStream.forEach(value -> System.out.print(" " + value)); //5~9 출력
        System.out.println();

        LongStream longStream = LongStream.rangeClosed(5,10);          //참고. rangeClosed: 맨 뒤 10도 포함하겠다.
        longStream.forEach(value -> System.out.print(" " + value));    // 5~10 출력
        System.out.println();

        /*필기.
            * Wrapper 클래스 자료형의 스트림이 필요한 경우 boxing도 가능하다.
            * doubles(num) : 난수를  활용한 DoubleStream을 갯수만큼 생성하여 반환한다.
            * boxed(): 기본 타입 스크림인 XXXStream을 박싱해아 Wrapper 타입의 Stream<XXX>로 반한한다.
        * */
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(value-> System.out.print(value + " "));
        System.out.println();

        /* 설명. 문자열을 splict하여 stream 생성*/
        Stream<String> splitStream = Pattern.compile(", ").splitAsStream("html, css, javascript");
        splitStream.forEach(System.out::println);
    }
}
