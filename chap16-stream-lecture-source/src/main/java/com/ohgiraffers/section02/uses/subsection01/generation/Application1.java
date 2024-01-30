package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 목표<br><br>
 * 배열이나 컬렉션은 스트림을 이용할 수 있고 이를 활용할 수 있다. <br>
 */
public class Application1 {
    public static void main(String[] args) {
        String[] sArr = new String[] {"java","oracle","jdbc"};

        /*필기.
            * Arrays.stream(배열) : 배열 자료형을 Stream 자료형으로 변환
        * */

    /*목차. 스트림 생성 4가지*/
        /*목차 1. 배열형태1*/
        Stream<String> strStream1 = Arrays.stream(sArr);
        strStream1.forEach(System.out::println);
        //strStream1.forEach(s -> System.out.println(s)); //참고. 같은 기능. stream은 한번만 사용가능하여 같은거 또 쓰면 에러띠움

        System.out.println();
        /*목차 1-2. 배열형태2*/
        Stream<String> strStream2 = Arrays.stream(sArr , 0, 2); // 참고. 0~2 2이전까지이기 떄문에 0,1 만 받음
        strStream2.forEach(System.out::println);
        System.out.println();

        /*목차 2. 컬렉션형태*/
        List<String> stringList = Arrays.asList("html","css","javascript");
        Stream<String> stringStream3 = stringList.stream();
        stringStream3.forEach(System.out::println);

        /* 목차 3. 세번째 방식
            * Builder를 활용한 스트림 생성
            * builder는 static<T>로 되어있는 메소드이며, 호출 시 타입 파라미터를 메소드 호출 방식으로 전달한다.
            * 스트림만 만들고 싶을 때 아래와 같이 다른 리스트,배열 호출 없이 가능
            * 하지만 이건 남발하지는 말자...?
        * */

        Stream<String> builderStream = Stream.<String>builder()
                                             .add("홍길동")  //메소드 체이닝 방식으로 되어 있다.
                                             .add("유관순")
                                             .add("윤봉길")
                                             .build();
        builderStream.forEach(System.out::println);

        /*목차 4. iterator()를 활용하여 수열 형태의 스트림을 생성*/
        Stream<Integer> intStream = Stream.iterate(10,value -> value *2)
                                          .limit(10);
        intStream.forEach(value-> System.out.printf(value+" "));

        /*참고. 목차4를 제외한 3가지는 자주 사용하는 방식이다. */
    }
}
