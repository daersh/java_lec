package com.ohgiraffers.section02.set.run;

import java.util.*;

/**
 * 목표<br><br>
 * TreeSet에 대해 이해하고 활용할 수 있다. <br>
 * <br>
 * @TressSet: 값을 정렬까지 해준다.
 */
public class Application3 {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("ramen");
        treeSet.add("pork");
        treeSet.add("kimchi");
        treeSet.add("egg");
        treeSet.add("fried_egg");
        treeSet.add("soup");
        System.out.println("treeSet = " + treeSet);

        //과제: 로또를 set 사용 안하고 출력하기
        //사용시
        Set<Integer> lotto = new TreeSet<>();
        Random rand = new Random();
        while (lotto.size()!=6){
            lotto.add(rand.nextInt(1,31));
        }
        System.out.println("lotto  = " + lotto);

        //1.우선순위큐
        PriorityQueue<Integer> lotto2 = new PriorityQueue<>();
        while (lotto2.size()!=6){
            int next = rand.nextInt(1,31);
            if(!lotto2.contains(next)){
                lotto2.add(next);
            }
        }
        System.out.println("lotto2 = " + lotto2);

        //2-1. 배열 with sort
        boolean []visited= new boolean[31];
        int []lotto3= new int[6];
        for (int i = 0; i < 6; i++) {
            while (true){
                int next= rand.nextInt(1,31);
                if(visited[next]==false){
                    lotto3[i]=next;
                    visited[next]=true;
                    break;
                }
            }
        }
        Arrays.sort(lotto3);
        System.out.println("lotto3 = " + Arrays.toString(lotto3));
        //2-2. 배열  without sort
        boolean []lotto4= new boolean[31];
        int z=0;        // 6개 입력 시 종료
        int cnt=0;      // 6개 출력 시 종료, 맨 마지막 ',' 안붙이기 위함
        while (z<6){
            int next= rand.nextInt(1,31);
            if(lotto4[next]==false){
                lotto4[next]=true;
                z++;
            }
        }
        System.out.print("lotto4 = [");
        for(int i=1;i<31;i++){
            if(lotto4[i]==true){
                if(cnt<5) {
                    System.out.print(i + ", ");
                    cnt++;
                }else {
                    System.out.print(i+"]\n");
                    break;
                }
            }
        }
    }
}
