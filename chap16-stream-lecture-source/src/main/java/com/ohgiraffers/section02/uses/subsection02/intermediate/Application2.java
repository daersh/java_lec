package com.ohgiraffers.section02.uses.subsection02.intermediate;


import java.util.stream.IntStream;

/**
 * 목표<br><br>
 * 스트림의 중계연산 중 하나인 map에 대해 이해하고 사용할 수 있다.!!!!!!!!!!! <br>
 */
public class Application2 {
    public static void main(String[] args) {
        /*설명.
            * 맵은 스트림에 들어있는 데이터를 람다식으로 가공하여 새로운 스트림에 담아주는 메소드이다.
        * */
        IntStream intStream = IntStream.range(1,10);
        intStream.filter(i -> i%2 ==0)
                  .map(i->i*5)
                  .forEach(i-> System.out.print(i+" "));
        //설명.
        // 필터는 boolean 반환형으로 람다식 작성한다(predicate)
        // 맵은 요소를 반환하는 형태로 람다식을 작성한다.(operator)
        // forEach는 반환형 없는 람다식을 작성한다.(consumer)
    }
}
