package com.ohgiraffer.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void testSimpleSwitchStatement() {
        /*수업목표. switch만 단독 사용 시 흐름을 이해하고 적용할 수 있다.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("본인 등급 입력(G: gold, S: silver, B: bronze): ");
        char grade = sc.next().charAt(0);
        int point =0;
        boolean correct_in=false;
        switch (grade){
            case 'G': point +=10;
            case 'S': point +=10;
            case 'B': point +=10;
                correct_in = true;
                break;
            default:
                System.out.println("어디 회원 등급이세요?");
        }
        if(correct_in)
            System.out.println("당신의 등급은 "+grade + "이며, 현재 포인트는 "+ point+"입니다.");
    }
}
