package com.ohgiraffers.section02.string;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 목표<br><br>
 * 문자열 분리에 대해 이해하고 적용할 수 있다. <br>
 */
public class Application3 {
    static StringBuffer sb;
    static BufferedWriter br;
    static StringTokenizer st;
    static StringBuilder Stringbuilder;

    /**
     * 문자열을 특정 구분자로하여 분리한 문자열을 반환하는 기능을 한다.<br><br>
     * 1. split(): 정규표현식을 이용하여 비정형화된 문자열을 분리한다.(String을 파싱하여 String[]으로 만들어줌)<br>
     * 2. stringTokenizer: 문자열의 모든 문자들을 구분자를 활용하여 문자열을 분리한다. <br>
     */
    public static void main(String[] args) throws IOException {

        String emp1 = "100/홍길동/서울/영업부";
        String emp2 = "200/유관순//총무부";
        String emp3 = "300/이순신/경기도/";
        String emp4 = "300/이순신/\1/경기도/";

        // 목차. 1. split() 사용
        String[] empArr1=emp1.split("/");
        System.out.println(Arrays.toString(empArr1));
        String[] empArr2=emp2.split("/");
        System.out.println(Arrays.toString(empArr2));
        String[] empArr3=emp3.split("/");
        System.out.println(Arrays.toString(empArr3));
        String[] empArr4=emp4.split("/");
        System.out.println(Arrays.toString(empArr4));

        // 목차. 2. StringTokenizer() 사용
        String colors = "red,yellow,green,purple,blue";
        st= new StringTokenizer(colors,",");
        while (st.hasMoreElements()){
            System.out.println(st.nextToken());
        }


    }
}
