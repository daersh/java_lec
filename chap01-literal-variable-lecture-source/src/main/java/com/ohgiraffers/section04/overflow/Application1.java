package com.ohgiraffers.section04.overflow;

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
            /* 수업목표. 오버플로우에 대해 이해할 수 있다. */
            /* 필기.
                *  자료형 별 값의 최대 범위를 벗어나는 경우
                *  발생한 carry를 버림처리하고 sign bit를 반전시켜 최소값으로 순환시킨다.
             * */
            // 바이트에서 127 넘어 128되면 -128로 가고 에러를 안뱉음
            /* 목차. 1. 오버플로우 */
            byte num1 = 127;
            sb.append("num1= "+ num1+ '\n');
            sb.append("num1+1 = "+ (byte)(num1+1) +'\n');   // 중요. overflow 발생
            num1++;
            sb.append("num1+1 = "+ (byte)(num1) +'\n');
            num1+=1;
            sb.append("num1+2 = "+ (byte)(num1) +'\n');

            /* 목차. 2. 언더븦로우 */
            byte num2 = -127;

            num2--;
            sb.append("num2-1= "+ num2+ '\n');
            num2--;                                         // 중요. underflow 발생
            sb.append("num2-2= "+ num2+ '\n');
            num2--;
            sb.append("num2-3= "+ num2+ '\n');
            /* 설명.
             *  일반적으로 많이 사용하는 int형의 최대값은 약 21억 정도.
             *  이 범위를 벗어난 계산은 오버플로우로 인해 원치 않는 값이 나올 수 있음.
            * */
            int firstNum = 1000000;
            int secondNum = 700000;

            int multi = firstNum * secondNum;               // 중요. overflow 발생
            int multi2 = 1000000 * 70000000;                // 강사님 환경에서는 이렇게 값으로 바로 하면 경고는 나옴.

            sb.append("multi = firstNum * secondNum= "+multi +'\n');
            print_str();
        }
}
