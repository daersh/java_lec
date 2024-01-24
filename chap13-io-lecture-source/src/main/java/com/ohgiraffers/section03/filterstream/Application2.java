package com.ohgiraffers.section03.filterstream;


import java.io.*;
import java.util.StringTokenizer;

/**
 * 목표<br><br>
 * 표준입출력을 이해하고 활용할 수 있다. <br>
 */
public class Application2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        System.out.print("문자열 입력: ");

        try {
            st= new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                bw.write(st.nextToken()+" ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                bw.close();
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
