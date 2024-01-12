package com.ohgiraffers.section05;

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
            /* 수업목표. 강제 형변환 규칙에 대해 이해할 수 있다.*/
            /* 필기.
                * 강제형변환
                    * 바꾸려는 자료형으로 캐스트 연산자((자료형))를 이용하여 형변환한다.
            * */
            long lnum = 80000000000L;
            int inum = (int)lnum;            // 경고. 데이터 손실하고 다운캐스팅 시에는 주의할 것.
            sb.append("inum = "+inum+'\n');

            float avg = 31.235f;
            int floornum = (int)avg;         // 경고. 뒷 소수점 전부 날아가는 것 주의. 버림으로 됨.
            sb.append("floornum = "+ floornum+'\n');

            print_str();
        }
}
