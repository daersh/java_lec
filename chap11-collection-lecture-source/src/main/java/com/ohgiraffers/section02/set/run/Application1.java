package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Set;

/**
 * 목표<br><br>
 * Set 자료구조의 특성을 이해하고 hashSet을 이용할 수 있다. <br>
 */
public class Application1 {
    public static void main(String[] args) {
//        HashSet<String> hashSet = new HashSet<>();
        Set<String> hset = new HashSet<>(); // 참고. 다형성 적용한 형태. 대부분 컬렉션은 이와 같이 다형성을 위해 상위 클래스를 적용한다. Set이 hashSet 보다 상위에 있음
        /*목차 1. 값 add - 참고. 값 들어오는 순서대로 출력이 되지 않는다.*/
        hset.add(new String("java"));           //설명. 담김
        hset.add(new String("mariaDB"));        //설명, 담김
        hset.add(new String("servlet"));        //설명. 담김
        hset.add(new String("spring"));         //설명. 담김
        hset.add(new String("html"));           //설명. 담김

        System.out.println("hset = " + hset);
        hset.add(new String("mariaDB"));        // 설명. 튕김
        hset.add(new String("mariaDB1"));       // 설명. 담김
        System.out.println("hset = " + hset);

        /*목차 2. Set 요소 있는지 확인*/
        System.out.println("'가' 있나요? "+hset.contains("가"));

    }
}
