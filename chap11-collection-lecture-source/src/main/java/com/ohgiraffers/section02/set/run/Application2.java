package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 목표<br><br>
 * LinkedHashSet에 대해 이해하고 활용할 수 있다. <br>
 * <br>
 * @LinkedHashSet: 저장 당시의 순서를 유지하는 특징을 가짐.
 */
public class Application2 {
    public static void main(String[] args) {
        Set<String> lSet = new LinkedHashSet<>();
        lSet.add("ramen");
        lSet.add("pork");
        lSet.add("kimchi");
        lSet.add("egg");
        lSet.add("fried_egg");
        lSet.add("soup");
        /*목차 1. 값이 들어온 순서대로 정렬되어 있는지 확인 */
        System.out.println("lSet = " + lSet);

    }
}
