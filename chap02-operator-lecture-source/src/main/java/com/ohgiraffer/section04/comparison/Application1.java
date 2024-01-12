package com.ohgiraffer.section04.comparison;

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
            /* 수업목표. 비교 연산자에 대해 이해하고 활용할 수 있다.*/
            /* 필기.
                * 비교연산자
                    * 비교연산자는 피연산자 사잉에서 상대적인 크기를판단하여 true, false를 반환하는 연산자
                    * 연산자 중 참 또는 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건식에서 많이 사용
            * */

            /* 목차. 1. 숫자값 비교*/
            int inum1 = 10;
            int inum2 = 20;
            sb.append(inum2==inum1); // 결과. false
            sb.append('\n');
            sb.append(inum2!=inum1); // 결과. true
            sb.append('\n');
            sb.append(inum2>=inum1); // 결과. true
            sb.append('\n');
            sb.append(inum2<=inum1); // 결과. false
            sb.append('\n');
            sb.append(inum2<inum1); // 결과. false
            sb.append('\n');
            sb.append(inum2>inum1); // 결과. true
            sb.append('\n');
            sb.append('\n');
            /* 목차. 2. 문자값 비교*/
            char inum3 = 'a';
            char inum4 = 'A';
            sb.append(inum3==inum4); // 결과. f
            sb.append('\n');
            sb.append(inum3!=inum4); // 결과. t
            sb.append('\n');
            sb.append(inum3>=inum4); // 결과. t
            sb.append('\n');
            sb.append(inum3<=inum4); // 결과. f
            sb.append('\n');
            sb.append(inum3<inum4); // 결과. f
            sb.append('\n');
            sb.append(inum3>inum4); // 결과. t
            sb.append('\n');
            sb.append('\n');

            /* 목차. 3. 논리값 비교*/
            boolean isNumber1 =true;
            boolean isNumber2 = false;
            sb.append(isNumber2==isNumber1); // 결과. f
            sb.append('\n');
            sb.append(isNumber1!=isNumber2); // 결과. t
            sb.append('\n');
            sb.append('\n');


            /* 목차. 4. 문자열 비교*/
            String str1 = "java";
            String str2 = "java";
            sb.append(str1==str2); // 결과. t
            sb.append('\n');
            sb.append(str1!=str2); // 결과. f
            sb.append('\n');



            print_str();
        }
}
