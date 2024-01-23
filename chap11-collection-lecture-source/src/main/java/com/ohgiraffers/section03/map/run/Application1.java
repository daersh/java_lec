package com.ohgiraffers.section03.map.run;

import java.util.*;

/**
 * 목표<br><br>
 * map 자료구조에 대해 이해하고 활용할 수 있다. <br>
 * @map map도
 */

public class Application1 {
    public static void main(String[] args) {
        Map hmap = new HashMap(); // == Map<Object,Object> hmap= new HashMap();
        hmap.put("one","Red apple");
        hmap.put("twe", new Date());
        hmap.put(22, 123);
        // 참고 1. SET과 같이 순서를 보장하지 않는다.
        System.out.println("hmap: "+hmap);
        // 참고 2. 중복 시 중복 된 값으로 덮어씌움.
        hmap.put(22,"purple banana");
        System.out.println("hmap: "+hmap);
        // 참고 3. key 다르고 value 만 중복인 것은 상관 없다.
        hmap.put(77, "purple banana");
        System.out.println("hmap: "+hmap);

        /*목차 1. 맵이 지닌 크기 확인*/
        System.out.println("맵이 지닌 size(): "+hmap.size());

        /*목차 2. 맵 요소 삭제*/
        System.out.println("remove(77)="+hmap.remove(77));
        System.out.println("삭제 후맵이 지닌 size(): "+hmap.size());

        /*목차 3. Map을 반복하여 각 entry들(키와 값)을 활용*/
        // insert
        HashMap<String, String> hmap2 = new HashMap<>();
        hmap2.put("one","java 17");
        hmap2.put("two","mariaDB 13");
        hmap2.put("three","servlet/jsp");
        hmap2.put("four","springboot 3.0");
        hmap2.put("five","vue.js");

        /*목차 3-1. keySet() 활용한 iterator 활용*/
        Set<String> keys = hmap2.keySet();
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()){
            String key = iter.next();
            System.out.println("key: "+key+ " hmap2(key): "+hmap2.get(key));
        }

        /*목차 3-2. entrySet() 활용한 iterator 활용*/
        Set<Map.Entry<String,String>> set = hmap2.entrySet();
        System.out.println(set);
        Iterator<Map.Entry<String,String>> iter2 = set.iterator();
        while (iter2.hasNext()){
            Map.Entry<String,String> entry = iter2.next();
            System.out.println("ket: "+ entry.getKey() + ", value: "+entry.getValue());
        }
    }
}
