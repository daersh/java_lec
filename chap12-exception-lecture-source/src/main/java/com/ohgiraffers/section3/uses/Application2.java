package com.ohgiraffers.section3.uses;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 목표<br><br>
 * try-with-resourc 구문의 문법을 이해하고 활용할 수 있다. <br>
 * Application1을 개선하기 위함.(가시성)
 */
public class Application2 {
    public static void main(String[] args) {
        //설명. try()를 통해 더 단순하게 작성 가능하다. - finally를 쓸 필요가 없어짐!!
        try (BufferedReader br = new BufferedReader(new FileReader("test.dat"))){
            String s;
            while ((s=br.readLine())!=null)
                System.out.println(s);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
