package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 목표<br><br>
 * 스트림의 병렬처리에 대해 이해할 수 있다. <br>
 */
public class Application2 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("java","oracle","jdbc","html","css"));

        /*목차 1.메인스레드에서 스트림을 사용하지 않고 확인*/
        System.out.println("====== foreach");
        for(String s: stringList)
            System.out.println(s + " : "+ Thread.currentThread().getName());

        /*목차 2. main 스레드에서 스트림을 사용하고 확인*/
        System.out.println("====== normal stream");
        stringList.forEach(Application2::print);
        // = stringList.forEach(s -> System.out.println("s+..."))

        /*목차 3. 병렬 스트림 사용시 쓰레드 확인.*/
        // 동기화 vs 병렬
        System.out.println("====== parallel stream ");
        stringList.parallelStream().forEach(Application2::print);;
    }

    private static void print(String s) {
        System.out.println(s + " : " + Thread.currentThread().getName());
    }
}
