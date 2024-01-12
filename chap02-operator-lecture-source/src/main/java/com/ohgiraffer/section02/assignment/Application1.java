package com.ohgiraffer.section02.assignment;

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
            /* 수업목표. 대입연산자와 산술 복합 대입 연산자를 이해하고 활용할 수 있다.*/
            /* 필기.
                * 대입연산자와 산술 복합 대입 연산자
                    * '='  : 왼 쪽 피연산자에 오른쪽 피연산자를 대입
                    * '+=' : 왼쪽의 피욘산자에 오른쪽 피연산자를 더한 결과를 왼쪽 피연산자에 대입
                    * '-=' : 왼쪽의 피욘산자에 오른쪽 피연산자를 뺀 결과를 왼쪽 피연산자에 대입
                    * '*=' : 왼쪽의 피욘산자에 오른쪽 피연산자를 곱한 결과를 왼쪽 피연산자에 대입
                    * '/=' : 왼쪽의 피욘산자에 오른쪽 피연신자를 나눈 결과를 왼쪽 피연산자에 대입
                    * '%=' : 왼쪽의 피욘산자에 오른쪽 피연산자를 나눈 나머지를 왼쪽 피연산자에 대입
            * */

            int num = 12;
            sb.append("num = " + num + '\n');
            num +=3;
            sb.append("num += 3 : " + num + '\n');
            num -=3;
            sb.append("num -= 3 : " + num + '\n');
            num *= 3;
            sb.append("num *= 3 : " + num + '\n');
            num /= 3;
            sb.append("num /= 3 : " + num + '\n');
            num %= 3;
            sb.append("num %= 3 : " + num + '\n');

            /* 참고 */
            num =- 5; // 참고. 이건 그냥 num = -5 인데 헷갈리지 않도록 할 것
            sb.append("num = " + num + '\n');
            print_str();
        }
}
