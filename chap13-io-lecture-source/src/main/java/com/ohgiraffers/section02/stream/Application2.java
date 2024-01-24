package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 목표<br><br>
 * FileReader를 이해하고 활용할 수 있다. <br><br>
 * @FileReader: 인코딩 방식에 맞추어 한 글자씩 입력 받을 수 있는 stream 이다. UTF-8 기준으로 숫자나 특수기호, 영어는 1바이트이고, 한글 및 그 외 언어는 3바이트이다.
 *
 */
public class Application2 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader= new FileReader("src/main/java/com/ohgiraffers/section02/stream/testReader.txt");
            fileReader.read(); //참고. 인코딩 방식에 맞추어 char 하나를 받는다.
            int a;
            while ((a=fileReader.read())!=-1){
                System.out.print((char)a);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
