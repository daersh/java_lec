package com.ohgiraffers.section01.array;

public class Application1 {
    public static void main(String[] args) {
        /*수업목표. 배열에 대해 이해하고 배열의 사용목적을 이해할 수 있다.*/
        /*필기.
            * 배열이란?
                * 동일한 자료형의 묶음으로 연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도이다.
                * 힙 영역에 new 연산자를 이용하여 할당한다.
        * */

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;
        int sum =0;
        sum+=num1;
        sum+=num2;
        sum+=num3;
        sum+=num4;
        sum+=num5;
        System.out.println("sum = " + sum);

        /*필기. 이와 같은 작업을 배열로 활용*/
        int[] arr1 = new int[5];
        int[] arr2 = {1, 2, 3, 4, 5};
        

    }
}
