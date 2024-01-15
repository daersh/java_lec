package com.ohgiraffer.section03.branching;

public class B_continue {

    public static void testSimpleContinueStatement() {
        /*수업목표. continue 문 사용에 대한 흐름을 이해하고 적용할 수 있다.*/
        /* 참고. continue 문도 반복문 안에서 사용*/

        /* 설명. 1~ 100 사이 4의 배수이면서 5의 배수인 값 출력*/
        for(int i=1; i<=100;i++){
            if(!(i%4==0 && i%5==0)){
                //System.out.println("i = " + i);
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
