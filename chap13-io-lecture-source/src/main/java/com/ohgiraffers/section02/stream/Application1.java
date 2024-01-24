package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 목표<br><br>
 *  입출력 스트림에 대해 이해하고 파일을 대상으로 하는 FileInputStream 을 사용할 수 있다. <br>
 */
public class Application1 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");       // 설명. 둘 다 같음. new File()제거하고 경로만넣어도 된다.
//            fin = new FileInputStream(new File("src/main/java/com/ohgiraffers/section02/testInputStream.txt"));

            /*필기.
                * FileInputStream에서 제공하는 read() 메소드를 활용하여 데이터를 1 바이트씩 읽을 수 있다.
                * read()메소드가 반환하는 값은 int인데 더이 상 데이터가 존재하지 않으면(EOF: End Of File) -1 을 반환한다.
                * 이를 통해 파일의 끝까지 1바이트씩 읽고 처리할 수 있다.
                * (반환하는 값이 int이기 때문에 (char)로 형변환을 진행한다.)
            * */
            int a;
//            while ((a= fin.read() ) != -1)
//                System.out.print((char)a);
            List<Character> arr =new ArrayList<>();
            while ((a=fin.read())!=-1){
                arr.add((char)a);
            }
            for(char ch:arr)
                System.out.print(ch);
        } catch (FileNotFoundException e) {
            System.out.println("파일 없음");
        } catch (IOException e) {
            System.out.println("err");
            e.printStackTrace();
        }

    }
}
