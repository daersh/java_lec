package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 목표<br><br>
 * stream에 대해 이해하고 활용할 수 있다.<br>
 */
public class Application1 {
    public static void main(String[] args) {

        //참고 Arrays.asList(Collection type) : collection type 을 ArrayList 객체로 생성할 때 쓰이는 생성자.
        List<String> stringList = new ArrayList<>(Arrays.asList("hello","world","stream"));

        System.out.println("======== foreach");
        for(String str: stringList)
            System.out.println(str);

        System.out.println("======== stream");
        // System.out::println: 이것도 람다식이다.
        stringList.forEach(System.out::println);
        System.out.println("======== stream");
        stringList.forEach(a -> System.out.println(a));  // 같다
        System.out.println("======== stream");
        stringList.stream().forEach(System.out::println); // 같다.

    }
}
