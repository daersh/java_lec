package com.ohgiraffers.section02.variable;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Application2 {
    static StringBuffer sb;
    static BufferedWriter br;

    public static void init()throws IOException{
        sb = new StringBuffer();
        br = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    public static void print_str()throws IOException{
        br.flush();
        br.write(sb.toString());
        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        /*수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다. (feat. 자료형(type))
         * 필기.
         *   변수 사용 방법
         *    1. 변수를 선언한다.
         *    2. 변수를 값에 대입한다.(초기화)
         *    3. 변수를 사용한다.
         * */

        /* 설명. 자료형
         *  다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 컴파일러와 약속한 키워드
         *  이러한 자료형은 기본자료형(primitive type)과 참조자료형(reference type)으로 나뉜다.
         * */
        // 참고. 기본자료형
        // 설명. 정수를 취급하는 자료형
        byte  bnum;                  // 1 byte
        short snum;                  // 2 byte
        int   inum;                  // 4 byte
        long  lnum;                  // 8 byte

        // 설명. 실수를 취급하는 자료형
        float  fnum;                 // 4 byte
        double dnum;                // 8 byte

        // 설명. 문자를 취급하는 자료형
        char ch;                    // 2 byte

        // 설명. 논리값을 취급하는 자료형
        boolean isTrue;             // 1 byte

        // 설명. 참조자료형 - 대문자로 시작하는 자료형들이다.
        String str;

        /*목차. 2.  변수에 값 대입(초기화)*/
        //중요 Long과 float 초기화 할 때 뒤에 각각 L(L은 int 범위 벗어나면 필요), F(무조건) 붙어야 한다는 점 인지할 것
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8000000000000L;    //설명. int 범위를 넘어가는 경우 L이 붙어야한다.
        lnum = 324234234;
//        lnum = 8000000000000;

        fnum = 4.0f;             // 설명. float는 자동으로 형 변환이 안되어 무조건 f || (float)를 붙여야함.
        dnum = 8.0;
        dnum = 8.0d;
        fnum = (float) dnum;

        ch = 'a';
        ch = 97;                 // 설명. char 자료형은 문자를 숫자로 취급한다. 0부터 양수만 취급한다.
//        ch = -97;
        isTrue = true;

        /*목차. 3. 변수 활용*/
        sb.append("isTrue = " + isTrue+'\n');
        sb.append("long + int의 합 = " + (lnum + inum) + '\n');

        /*설명. 변수의 선언 및 초기화는 한번에 가능하다.*/
        int kor = 90;
        int math = 80;
        int eng = 75;
        int sum = kor + math + eng;
//        float avg4 = sum/3.0;          // 중요. 3.0은 double이기 때문에 안됨
        float avg = sum/3;          // 참고. 소수점 이하가 제대로 안나옴.
        float avg2 = sum/3.0f;      // 참고. 나눗셈을 할 때는 소수점 있는 값을 넣어야 소수점 제대로 나옴.
        double avg3 = sum/3.0;

        sb.append("총합: " + 97 + '\n');
        sb.append("평균: " + avg + '\n');
        sb.append("평균: " + avg2 + '\n');
        sb.append("평균: " + avg3 + '\n');


        print_str();
    }
}
// 2*8*8= 128bit
// 2*8*4= 64bit=