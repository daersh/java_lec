package com.ohgiraffer.section05.logical;

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
            /* 수업목표. 논리연산자에 대해 이해하고 활용할 수 있다.*/
            /* 필기.
                * 논리 연산자.
                * 논리값을 취급하는 연산자.
                *
             * 필기.
                * 논리 연산자의 종류
                    * 1. 논리 연결 연산자: 두 개의 피연산자를 갖는 이항 연산자. 연산자의 결합 방향은 왼쪽에서 오른쪽이다.
                                     * 두 개의 논리식을 반단하여 참과 거짓을 판단한다.
                        * &&(AND) : 모두 참일 때만 참
                        * ||(OR)  : 둘 중 하나라도 참이면 참
                    * 2. 논리 부정 연산자: 피연산자가 하나인 단항연산자로, 피연산자의 결합 방향은 왼쪽에서 오른쪽이다.
                        * !(NOT) : 논리식의 결과가 참이면 거짓, 거짓이면 참
            * */

            System.out.println(true && true);           //결과. t
            System.out.println(true && false);          //결과. f
            System.out.println(false && true);          //결과. f
            System.out.println(false && false);         //결과. f

            System.out.println(true || true);           //결과. t
            System.out.println(true || false);          //결과. t
            System.out.println(false || true);          //결과. t
            System.out.println(false || false);         //결과. f

            System.out.println(!true);                  //결과. f
            System.out.println(!false);                 //결과. t

            /*목차 2. 논리식에 논리연산자 활용*/
            int num1 = 10;
            int num2 = 20;
            int num3 = 30;
            int num4 = 40;
            System.out.println();
            System.out.println(num1 < num2 && num3 < num4);     //결과. t
            System.out.println(num1 < num2 && num3 > num4);     //결과. f
            System.out.println(num1 > num2 && num3 < num4);     //결과. f
            System.out.println(num1 > num2 && num3 > num4);     //결과. f

            System.out.println(num1 < num2 || num3 < num4);     //결과. t
            System.out.println(num1 < num2 || num3 > num4);     //결과. t
            System.out.println(num1 > num2 || num3 < num4);     //결과. t
            System.out.println(num1 > num2 || num3 > num4);     //결과. f


            print_str();
        }
}
