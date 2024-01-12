package com.ohgiraffer.section01.conditional;

import java.util.Scanner;

public class b_ifElse {
    private static int input;


    /*설명. 단일 if_esle 예제*/
    public void testSimpleIfElseStatement() {
        getInput();
        simpleSolve();
    }

    /*설명. 중첩 if_else 예제*/
    public void testNestedIfElseStatement() {
        getInput();
        nestedSolve();
    }

    /*설명. 정수가 양수인지 음수인지 구분하고 양수일 때만 짝수인지 아닌지 판별한다.*/
    private void nestedSolve() {
        if(input==0){
            System.out.println("0 입니다.");
            return;
        }
        else if(input>0)
            System.out.println("해당 정수는 양수이면서 ");
        else System.out.println("해당 정수는 음수이면서 ");
        simpleSolve();
    }

    /*설명.홀짝 구분하기 위한 메서드*/
    private static void simpleSolve() {
        if(input % 2 != 0) {
            System.out.println("홀수입니다.");
            return;
        }
        System.out.println("짝수 입니다.");
    }

    /*설명.Setter*/
    public static void setInput(int input) {
        b_ifElse.input = input;
    }
    /*설명.Getter*/
    private static void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert");
        input = scanner.nextInt();

    }
}
