package com.ohgiraffers.section01.array;

import java.util.Arrays;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        /* 수업목표. 배열을 사용하는 예시를 이해하고 적용할 수 있다. */
        /* 필기.
            * 5명의 자바 점수를 정수로 입력받아 합계와 평균을 실수로 구하는 프로그램
        * */

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg_sum = 0;

        for(int i=0;i<5;i++){
            System.out.print((i + 1) + " insert: ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        avg_sum = (double) sum / (double) 5;

        System.out.println("student score: "+Arrays.toString(arr));
        System.out.println("sum = " + sum);
        System.out.println("avg_sum = " + avg_sum);
    }
}
