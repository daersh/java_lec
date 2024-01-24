package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 목표<br><br>
 *  <br>
 */
public class Application4 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {

            // 파일 없으면 생성해줌.
            fileWriter=new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");
            fileWriter.write('한');
            fileWriter.write('글');

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close(); // 이거 없으면 입력 안들어간다.
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
