package com.ohgiraffers.section03.constant;

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
            /* 수업목표. 상ㅅ수에 대해 이해하고 사용할 수 있다. */
            /* 목차. 1. 상수 선언 */
            final int AGE; // 대문자로 final임을 명시
            /* 목차. 2. 초기화 */
            AGE = 20;
//            AGE = 30; 두번 초기화 불가
            /* 목차. 3. 필요한 위치에 상수를 호출해서 사용 */
            sb.append("AGE의 값: "+AGE+'\n');
            /*설명. 상수값도 리터럴로 치환됨*/
            int myAge = AGE;
            sb.append("myAGge의 값: "+myAge+'\n');

            print_str();
        }
}
