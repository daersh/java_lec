package com.ohgiraffer.section03.branching;

import java.util.Scanner;

public class A_break {
    public void testSimpleBreakStatement() {

        /*수업목표. break문 사용에 대한 흐름을 이해하고 적용할 수 있다.*/
        /*필기. break문은 반복문 안에 사용하며 자신을 포함한 가장 가까운 반복문을 빠져나감(swithc문 break와 다름)*/
        int sum = 0;
        int i=1;
        while(true){
            sum+=i;
            System.out.println("sum = " + sum);
            if(i==10) break;
            i++;
        }
    }

    public void testPrintStarsWithBreakStatement() {
        /*필기. 중첩반복문을 활용하는 별 찍기 활용*/
        System.out.printf("insert: ");
        Scanner sc = new Scanner(System.in);
        int cnt=sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                System.out.print('*');
                if(j==i)break;                  // 설명. for 문이 도는 횟수가 바깥 행과 같으면 break;
            }
            System.out.println();
        }
    }
    /*수업목표. */
}
