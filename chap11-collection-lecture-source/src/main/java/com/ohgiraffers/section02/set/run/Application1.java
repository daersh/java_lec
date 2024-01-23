package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 목표<br><br>
 * Set 자료구조의 특성을 이해하고 hashSet을 이용할 수 있다. <br>
 */
public class Application1 {
    public static void main(String[] args) {
//        HashSet<String> hashSet = new HashSet<>();
        Set<String> hset = new HashSet<>(); // 참고. 다형성 적용한 형태. 대부분 컬렉션은 이와 같이 다형성을 위해 상위 클래스를 적용한다. Set이 hashSet 보다 상위에 있음
        /*목차 1. 값 add - 참고. 값 들어오는 순서대로 저장하는 것을 보장하지 않는다.*/
        hset.add(new String("java"));           //설명. 담김
        hset.add(new String("mariaDB"));        //설명, 담김
        hset.add(new String("servlet"));        //설명. 담김
        hset.add(new String("spring"));         //설명. 담김
        hset.add(new String("html"));           //설명. 담김

        System.out.println("hset = " + hset);

        /*목차 2. 중복된 값 add
           참고. 중복되면 저장하지 않는다. 중복 값이 있으면 새로 추가하려는 객체의 주소가 튕겨나감(덮어쓰지 않는다.!)
        */
        /* 참고. equals와 hashCode 오버라이딩 필요하다.*/
        hset.add(new String("mariaDB"));        // 설명. 안담김. 중복된 값의 주소도 변화 x
        hset.add(new String("mariaDB1"));       // 설명. 담김

        System.out.println("hset = " + hset);

        /*목차 3. Set 요소 있는지 확인*/
        System.out.println("'java' 있나요? "+hset.contains("java"));       //설명. true

        /*목차 4. Set 요소 제거*/
        hset.remove("java");
        System.out.println("hset = " + hset);
        hset.add("java");

        /*목차 5-1. Set 요소들 반환 1 - iter 사용
           참고.인덱스 개념이 없는 Set을 iterator(반복자)를 돌리거나 배열로 바꿔야 확인 가능하다.
        */
        Iterator<String> iter = hset.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        /*목차 5-2. Set 요소들 반환 2 - Object[] 사용 */
        Object[] objArr = hset.toArray();
        for(Object obj: objArr){
            System.out.println(obj);
        }

        /*목차 6. Set 크기 확인*/
        System.out.println("size(): " + hset.size());

        /*목차 7. clear()*/
        hset.clear();
        System.out.println("clear() 후 size(): " + hset.size());
        System.out.println("isEmpty(): "+ hset.isEmpty());

    }
}
