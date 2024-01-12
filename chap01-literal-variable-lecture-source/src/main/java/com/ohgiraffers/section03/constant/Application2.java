package com.ohgiraffers.section03.constant;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Application2 {
    static StringBuffer sb;
        static BufferedWriter br;
        public static void init()throws IOException {
            sb = new StringBuffer();
            br = new BufferedWriter(new OutputStreamWriter(System.out));

        }
        public static void print_str()throws IOException {
            br.flush();
            br.write(sb.toString());
            br.close();
        }

        public static void main(String[] args) throws IOException {
            init();
            /* 수업목표. 상수의 명명 규칙에 대해 이해할 수 있다.*/
            /* 목차. 1. 목든 문자는 영문자 대문자 혹은 숫자만 사용한다. (특수기호 금지)*/
            final  int AGE1 = 20;
            final  int AGE2 = 30;
            final  int AGE3 = 40;

            /* 목차 2. 단어와 단어 연결은 언더바'_' 사용*/
            final int MAX_AGE = 60;
            final int MIN_AGE = 20;
            final int minAGE = 30; // 사용 가능하나 변수와 구분하기 힘들기 때문에 지양됨

            print_str();
        }
}
