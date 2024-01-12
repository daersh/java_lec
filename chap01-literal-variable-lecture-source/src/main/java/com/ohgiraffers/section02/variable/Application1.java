package com.ohgiraffers.section02.variable;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Application1 {
    static StringBuffer sb;
    static BufferedWriter br;
    public static void main(String[] args) throws IOException {
        sb= new StringBuffer();
        br= new BufferedWriter(new OutputStreamWriter(System.out));
        br.flush();
        int num; // 설명. 변수 선언
        num = 1;
        System.out.println("num = " + num);         // 참고: soutv를 통해 변수 값 편하게 출력 가능
        System.out.println("num = " + (num+1));

        /* 수업목표. 변수 사용 목적에 대해 이해할 수 있다.
         * 필기.
         *  변수의사용목적
            *   1. 값에 의미 부여를 위한 목적
            *   2. 한번 저장 해둔 값을 재사용 하기 위함
            *   3. 시간에 따라 변하는 값을 저장하고 사용할 수 있음.
        */

        /*목차. 1. 값에 의미를 부여하기 위한 목적*/
        System.out.println("===== 값에 의미 부여 테스트 =====");
        System.out.println("보너스를 포함한 급여: " + (10000+20000)+"원");
        int salary = 10000;
        int bonus = 20000;
        System.out.println("보너스를 포함한 급여: " + (salary+bonus)+"원");
        /*목차. 2. 한번 저장해둔 값을 재사용하기 위한 목적*/
        System.out.println("===== 변수에 저장한 값 재사용 테스트 =====");

        /* 설명. 10명의 고객에게 100포인트를 지급해주는 내영을 출력하도록 작성*/
        System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("6번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("7번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("8번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("9번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("10번 고객에게 포인트를 100포인트 지급하였습니다.");
        /*설명. 위 코드에서 공통적으로 사용된 100이라는 값을 변수에 넣고 변수를 호출하여 코드를 개선*/
        int point = 100;
        System.out.println("\n1번 고객에게 포인트를 "+point+"포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 "+point+"포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 "+point+"포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 "+point+"포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 "+point+"포인트 지급하였습니다.");
        System.out.println("6번 고객에게 포인트를 "+point+"포인트 지급하였습니다.");
        System.out.println("7번 고객에게 포인트를 "+point+"포인트 지급하였습니다.");
        System.out.println("8번 고객에게 포인트를 "+point+"포인트 지급하였습니다.");
        System.out.println("9번 고객에게 포인트를 "+point+"포인트 지급하였습니다.");
        System.out.println("10번 고객에게 포인트를 "+point+"포인트 지급하였습니다.");

        /*목차. 3. 시간에 따라 변하는 값을 저장하고 사용할 목적*/
        System.out.println("===== 변수에 저장된 값 변경 테스트 =====");
        int sum = 0;
        sum+=10;                   // 기존 0이 담긴 변수에 10이 덮어씀. 변수는 하나의 리터럴값만 저장 가능
        sb.append("sum에 10을 더하면 현재 sum의 값은: " + sum+'\n');

        sum+=10;
        sum+=10;
        sum+=10;
        sum+=10;

        sb.append("sum에 10을 4번 더 누적하면 현재 sum의 값은: " + sum+'\n');

        /* 설명. 동일한 sum이라는 한 변수를 어느 시점에 출력하느냐에 따라 결과가 달라짐*/



        br.write(sb.toString());
        br.close();
    }
}
