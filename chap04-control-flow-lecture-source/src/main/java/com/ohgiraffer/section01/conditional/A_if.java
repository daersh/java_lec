package com.ohgiraffer.section01.conditional;

import java.util.Scanner;

public class A_if {
    private Scanner scanner;
    private int input;

    public A_if(){scanner = new Scanner(System.in);}

    public void testSimpleIfStatement() {
        /*수업목표.단독 if문의 흐름을 이해하고 적용할 수 있다.*/
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
            return;
        }
        System.out.println("홀수입니다.");
    }

    private void insert_input() {
        System.out.print("정수 입력: ");
        input = scanner.nextInt();
    }


    public void testNestedIfStatement() {
        /*수업목표.중첩 if문의 흐름을 이해하고 적용할 수 있다.*/
        insert_input();
        testNestedIfStatement_solve();
        testSimpleIfStatement_solve();
    }

    private void testNestedIfStatement_solve() {
        if(input>0 ){
            System.out.printf("입력 받은 값은 양수이면서 ");
        }else
            System.out.printf("입력 받은 값은 음수이면서 ");
    }
}
