package com.ohgiraffer.section03.increment;

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
            /* 수업목표. 단항 연산자이자 증감 연산자에 대해 이해하고 활용할 수 있다. */

            /* 목차. 1. 증감연산자를 한 후 출력 시*/
            int num = 20;
            sb.append("num = " + num +'\n');
            num++;
            sb.append("num = " + num +'\n');
            ++num;
            sb.append("num = " + num +'\n');
            num--;
            sb.append("num = " + num +'\n');
            --num;
            sb.append("num = " + num +'\n');
            /* 목차. 2. 증감연산자를 다른 연산자와 함께 출력 시*/
            int firstNum =20;
            int result1= firstNum++ * 3;
            sb.append("firstNum= "+firstNum+'\n');  // 결과. 21
            sb.append("result1= "+result1+'\n');    // 결과. 20*3
            int result2 = ++firstNum *3;
            sb.append("firstNum= "+firstNum+'\n');  // 결과. 22
            sb.append("result2= "+result2+'\n');    // 결과. 22*3

            sb.append("firstNum= "+firstNum++ +'\n');  // 결과. 22
            sb.append("firstNum= "+ ++firstNum+'\n');  // 결과. 24
            print_str();
        }
}
