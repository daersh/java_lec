package com.ohgiraffer.section02.looping;

public class B_nestedFor {
    public void printGugudanFromTwoToNine() {
        /*수업목표. 중첩된 for문의 흐름 이해하고 적용할 수 있다.*/
        /* 설명.
            * 2단
                * 2*1=2
                * 2*2=4
                * 2*3=6
                * ...
                * 9*7=63
                * 9*8=72
                * 9*9=81
        * */
        for(int i=2; i<10;i++){
            System.out.println(i+"단 ");
            for(int j=1;j<10;j++){
                System.out.printf("%d*%d=%d\n",i,j,i*j);
            }
            System.out.println();
        }
    }

    public void printUpgradeGugudanFromTwoToNine() {
        /*수업목표. inner for문을 메소드로 따로 모듈화 할 수 있다.(하나의 기능 단위로 보고)*/
        for(int dan = 2; dan <10; dan++){
            System.out.println(dan+"수 출력");
            printGugudanOf(dan);
            System.out.println();
        }
    }


    /*설명. 단수를 넘기면 1~9까지 곱하여 숫자를 출력하는 기능*/
    private static void printGugudanOf(int dan) {
        for(int su=1;su<10;su++){
            System.out.printf("%d*%d=%d\n", dan,su, dan *su);
        }
    }

    public void printStars() {
        /*설명.
            *      *
            *     **
            *    ***
            *   ****
            *  *****
        * */
        for(int i=4;i>=0;i--){
            for(int j=0;j<5;j++) {
                if (j < i) System.out.print(' ');
                else System.out.print('*');
            }
            System.out.println();
        }
        /*
        *               *
        *              ***
        *             *****
        *
        *              ***
        *               *
        *
        * */

        for(int i=1;i<6;i++){
            int cnt=5;
            for(int j=i; j<3;j++){
                System.out.print(' ');
                cnt-=2;
            }
            for(int j=i;j>3;j--){
                System.out.print(' ');
                cnt-=2;
            }
            for(int j=0;j<cnt;j++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
