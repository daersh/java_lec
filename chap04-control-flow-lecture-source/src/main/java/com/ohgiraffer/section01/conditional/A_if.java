package com.ohgiraffer.section01.conditional;

import java.util.Scanner;

public class A_if {
    private Scanner scanner;
    private int input;

    public A_if(){scanner = new Scanner(System.in);}

    public void testSimpleIfStatement() {
        insert_input();
        testSimpleIfStatement_solve();

    }

    private void testSimpleIfStatement_solve() {
        /* 설명.
             * 만약(입력값이 짝수면){
             *   "짝수입니다"라고 출력한다.
             * }아니면{
             *   "홀수입니다"라고 출력한다.
             * }
         * */
        if(input%2 ==0){
            System.out.println("짝수입니다.");
        }else {
            System.out.println("홀수입니다.");
        }
    }

    private void insert_input() {
        System.out.print("정수 입력: ");
        input = scanner.nextInt();
    }


    public void testNestedIfStatement() {

    }
}
