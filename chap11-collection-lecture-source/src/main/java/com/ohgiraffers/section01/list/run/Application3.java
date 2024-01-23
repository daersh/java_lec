package com.ohgiraffers.section01.list.run;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 목표<br><br>
 * LinkedList에 대해 이해하고 활용할 수 있다. <br>
 */
public class Application3 {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        //설명. 값 초기화
        init(linkedList);

        /*목차 1.문자열 출력 4가지*/
        printList(linkedList);
        /*목차 2. 수정*/
        linkedList.set(1,"pineapple");
        System.out.println("linkedList = " + linkedList);
        /*목차 3. 요소 전부 제거*/
        linkedList.clear();
        System.out.println("linkedList = " + linkedList);
        /*목차 4. 값을 담고 있는지 확인 true || false */
        System.out.println(linkedList.isEmpty());

    }

    /**값 초기화*/
    private static void init(List<String> linkedList) {
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");
        System.out.println(linkedList.size()+"개의 자료 담김.");
    }

    /**출력 4가지 방식*/
    private static void printList(List<String> linkedList) {
        /*설명.1. toString()*/
        System.out.println(linkedList.toString());

        /*설명.2. for*/
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.printf(linkedList.get(i)+" ");
        }
        System.out.println();

        /*설명.3. for-each*/
        for (String x : linkedList) {
            System.out.printf(x + "  ");
        }
        System.out.println();

        /*설명.4. iterator*/
        /*참고. 반복문 안에서 next()를 두번 이상 사용할 경우 의도한 것이 아니면 유의할 것(변수  활용해서 값 저장해서 쓰거나 할 것~~)*/
        Iterator<String> iter = linkedList.iterator();
        while (iter.hasNext()){
            String next= iter.next();
            System.out.printf(next+ "   ");
        }
        System.out.println();
    }
}
