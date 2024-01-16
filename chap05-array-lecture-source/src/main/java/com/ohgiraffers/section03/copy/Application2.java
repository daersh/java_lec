
package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {
    /*수업목표. 깊은 복사에 대해 이해할 수 있다.*/
    /* 필기.
        * 깊은 복사 4가지 방식
        * 1. for문을 통한 동일한 인덱스 값 일일이 복사
        * 2. Object의 clone()을 통한 복사  (사용 빈도 가장 높음!!)
         * 3. System의 arraycopy()를 이용한 복사
         * 4. Arrays의 copyOf()를 이용한 복사
     * */
    public static void main(String[] args) {
        int[] originArr = new int[]{1,2,3,4};
        print(originArr,"원본");

        /*목차. 1. for문 활용*/
        int[] copyArr1= new int[originArr.length];
        for (int i = 0; i < copyArr1.length; i++) {
            copyArr1[i]=originArr[i];
        }
        print(copyArr1,"for문을 통한 사본");
        /*목차. 2. clone()를 이용한 복사*/
        int[] copyArr2 = originArr.clone();
        print(copyArr2,"clone()을 통한 사본");
        /*목차. 3. arraycopy()를 이용한 복사*/
        int[] copyArr3 = new int[originArr.length+3];
        System.arraycopy(originArr,0,copyArr3,2,originArr.length);
        print(copyArr3,"arraycopy()를 통한 사본");
        /*목차. 4. copyOf()를 이용한 복사*/
        int[] copyArr4= Arrays.copyOf(originArr,2);                 //참고. 배열 크기=2이고 원본의 0~1까지 복사, 원본보다 크면 뒤에 0붙임
        print(copyArr4,"arrayOf()를 통한 사본");

    }
    private static void print(int[] arr,String desc){                           //참고. orgin ->arr로 얕은 복사 발생
        System.out.println("========"+desc+"========");
        /*설명. 전달받은 배열의 주소 값 출력*/
        System.out.println("넘어온 배열의 hashCode"+ arr.hashCode());
        /*설명. 전달받은 배열의 값 출력*/
        System.out.println(Arrays.toString(arr));
    }

}

