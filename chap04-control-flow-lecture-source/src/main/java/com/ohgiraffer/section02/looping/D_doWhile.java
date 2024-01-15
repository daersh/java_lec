package com.ohgiraffer.section02.looping;

import java.util.Scanner;

public class D_doWhile {
    public void testSimpleDoWhileStatement() {
        /*수업목표. do-while문 단독 사용에 대한 흐름ㅇ을 이해하고 적용할 수 있다.*/
        do{
            System.out.println("do ~while(false)일 때");
        }while (false);

        System.out.println("반복 종료 이후");
    }

    public void testDoWhileExample() {
        /*수업목표. do-while문의 흐름을 이해하고 적용할 수 있다.*/
        Scanner scanner = new Scanner(System.in);
        String str= new String();
        do{
            if(!str.equals("finish") && !str.equals("")){
                System.out.println("o ta la go mid el gae yo");
            }
            System.out.println("plz insert finish");
            str= scanner.nextLine();
        }while (!str.equals("finish"));                 //참고. 문자열 비교는 무조건 equals 사용할 것!!!!!
                                                        // str문자열 값이 finish와 일치하면 false가 되도록 작성
        System.out.println("감사합니다.");
    }
}
