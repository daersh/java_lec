package com.ohgiraffers.section02.demensinal;

import java.util.Arrays;

public class Application1 {

    public static void main(String[] args) {
        /*수업목표. 다차원 배열의 구조를 이해하고 사용할 수 있다*/
        /*필기.
            * 다차원배열
                * 다차원배열은 2차원 이상의 배열 의미. (일반적으로 사랑ㅁ의 인지 범위에 맞게 최대 3차원정도를 고려)
        * */

        int [][] iArr1;
        int [] iArr2[]; // 비추
        int iArr3[][];  // 비추

        iArr1 = new int [3][4];         // 정변 배열을 위한 선언 방식(관리하는 1차원의 길이가 동일)
        iArr2 = new int [3][];          // 가변 배열을 위한 선언 방식(관리하는 1차원 배열의 길이가 다를 시)
        // iArr3 = new int [][];        // 이건 에러발생
        int num = 0;
        for (int i = 0; i < iArr1.length; i++) {
            for (int j = 0; j < iArr1[i].length; j++) {
                iArr1[i][j]=num++;
            }
            System.out.println(Arrays.toString(iArr1[i]));
        }
        /*설명. 가변 배열은 아직 1차원 배열들이 생성되어 있지 않다.(NullPointerException도 발생 가능!)*/
        int length=1;
        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i]= new int[++length];
            for (int j = 0; j < iArr2[i].length; j++) {         // 참고. error 발생. 초기화 안하면 1차원 배열에 관리할 공간이 없음.
                iArr2[i][j]=num++;
            }
            System.out.println(Arrays.toString(iArr2[i]));
        }
    }
}
