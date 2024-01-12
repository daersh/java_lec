package com.ohgiraffer.section01.arithmetic;

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
            /* 수업목표. 산술연산자에 대해 이해하고 활용할 수 있다. */
            /* 필기.
                * 산술 연산자.
                    * 산술 연산자는 사칙연산과 관련된 연산자로 가장 기본적이고 많이 사용되는 연산자이다.
                    * 연산의 실힝애 가능하기 위해 필요한 값이나 변수가 두 개인 이항 연산자로 분류되며
                    * 피연산자들의 연산 방향은 왼쪽에서 오른쪽이다.
            * */
            int num1 = 20;
            int num2 = 7;
            sb.append("num1 + num2 = " + (num1 + num2) + '\n');
            sb.append("num1 - num2 = " + (num1 - num2) + '\n');
            sb.append("num1 * num2 = " + (num1 * num2) + '\n');
            double testNum= (num1/(double)num2);
            double resultNum = (int)(testNum*100)/(double)100;          // 참고. 소수 3자리 부터 버림하기 위한 방법
            sb.append("num1 / num2 = " + resultNum + '\n');
            sb.append("num1 % num2 = " + (num1 % num2) + '\n');
            print_str();
        }
}
