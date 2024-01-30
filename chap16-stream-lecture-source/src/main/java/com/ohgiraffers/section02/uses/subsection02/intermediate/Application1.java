package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

/**
 * 목표<br><br>
 * 스트림의 중계연산 중 filter에 대해 이해하고 사용할 수 있다. <br>
 */
public class Application1 {
    public static void main(String[] args) {
        /*설명. 필터를 사용하여 짝수인 것만 걸러서 출력
            * 필터는 스트림에서 특정 데이터만 걸러내가 위한 것이다.
        * */

        IntStream intStream = IntStream.range(0,10);
        intStream.filter(i -> ( i % 2 ) == 0 )
                 .forEach(i-> System.out.print(i+" "));

    }
}
