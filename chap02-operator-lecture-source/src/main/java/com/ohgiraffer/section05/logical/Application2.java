package com.ohgiraffer.section05.logical;

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
        public static void print_str()throws IOException{
            br.flush();
            br.write(sb.toString());
            br.close();
        }

        public static void main(String[] args) throws IOException {
            init();
            /*목차. 1. 1부터 100사이 값 확인 */
            int num1 =55;
            int num2 = 101;
            System.out.println(num1>=1 && num1<=100);
            System.out.println(num2>=1 && num2<=100);
            /*목차. 2.영어 대문자 확인*/
            char ch1 = 'G';
            char ch2 = 'g';
            System.out.println(ch1 >='A'&& ch1<='Z');
            System.out.println(ch1 >=65 && ch1 <=90);
            System.out.println(ch2>=65 && ch2 <= 90);
            /* 목차. 3. 대소문자 상관 없이 영문자 확인*/
            char ch3 = 'y';
            char ch4 = 'Y';
            System.out.println(ch3 == 'y'||ch3 =='Y');
            System.out.println(ch4 == 'y'||ch4 =='Y');
            /*목차. 4. 영문자인지 확인하는 조건식*/
            System.out.println(('o'>='a' && 'o'<='z') || ('o'>='A' && 'o'<='Z'));
            System.out.println(('1'>='a' && '1'<='z') || ('1'>='A' && '1'<='Z'));

            print_str();
        }
}
