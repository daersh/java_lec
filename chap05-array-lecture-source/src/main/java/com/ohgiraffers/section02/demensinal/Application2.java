package com.ohgiraffers.section02.demensinal;

import java.util.Arrays;

public class Application2 {

    public static void main(String[] args) {
        int [][] iArr1 = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15} };
        int [][] iArr2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15} };

        for(int i=0; i< iArr1.length;i++){
            for(int j=0;j<iArr1[i].length;j++){
                System.out.printf("iArr1["+i+"]["+j+"]"+iArr1[i][j]+' ');
            }
            System.out.println();
        }
        /*필기. arrays.tostring*/
        for(int i=0; i<iArr2.length;i++){
            System.out.println(Arrays.toString(iArr2[i]));
        }
    }
}
