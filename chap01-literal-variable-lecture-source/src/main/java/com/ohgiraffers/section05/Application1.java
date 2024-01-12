package com.ohgiraffers.section05;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Application1 {
    static StringBuffer sb;
        static BufferedWriter br;
        public static void init()throws IOException {
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
            /* 수업목표. 자동 형변환(implicit coercion) 규칙을 이해할 수 있다.*/

            /* 설명. 점 점 더 큰 자료형으로 이동 시 자동으로 형변환 됨.*/
            byte bnum = 1;               // 참고. 리터럴이 정수일 때 자바는 int로 받아들이지만 int-> byte, short로 가는 건 자동으로 형변환해줌.
            short snum = bnum;
            int inum = snum;
            long lnum = inum;
            /* 설명. 연산 시에도 자동으로 큰 쪽으로 맞춰서 낮은 자료형이 자동형변환 된다.*/
            int num1 = 10;
            long num2 = 20;
            long result= num1+num2;
            sb.append("result = "+result +'\n');
            /* 설명. 문자형은 int형으로 자동 형변환 된다.(반대도 가능)*/
            int ch1 = 'a';
            int charNumber = ch1;
            sb.append("charNumber = "+(char)(charNumber-32)+'\n');
            char ch2 = 65;
            sb.append("ch2 = "+ch2 +'\n');

            print_str();
        }
}
