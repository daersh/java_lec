package com.ohgiraffers.section03.filterstream;

import java.io.*;

/**
 * 목표<br><br>
 *  (보조스트림=필터스트림) BufferedWriter과 BufferedReader 에 대해 이해하고 사용할 수 있다.<br><br>
 *
 *  내부적으로 버퍼를 활용해서 입출력 성능을 향상시킨다.<br>
 *
 * @1. 추가적인 메소드가 제공된다.
 *  <br>String 반환 가능
 *
 * <br><br>
 * @2.사용이유: 부가적인 메소드와 성능 향상이 있기 때문에 사용한다.
 */
public class Application1 {

    public static void main(String[] args) {
        //참고. 보조스트림(bufferedReader,bufferedwriter) 사용 이유: 성능 향상 + 부가적 기능

        BufferedWriter bw = null;
        BufferedReader br = null;
        /*목차 1. BufferedWriter 활용해 한줄(개행문자전까지)씩 출력하기*/
        try {                                           //중요. 경로 뒤에 ,true하면 덧붙이기 가능해짐
            bw = new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"/*,true*/));
            bw.write("제목: 세종대왕의 만족\n");
            bw.write("세종대왕님께서 만족하시겠네..\n");
            bw.write("드디어 세종대왕님께서 만족하시겠네..?\n");
            bw.write("진짜 세종대왕님께서 만족하시겠네..??\n");
            bw.write("설마 세종대왕님께서 만족하시겠어..???\n");

            /*중요.
                * 버퍼를 이용해서 출력하는 경우 버퍼 공간이 가득 차지 않으면 내보내기(출력)이 안되는 경우가 있다.
                * 이럴 경우에 대비해 강제로 내보내기 위한 flush()를 활용해야 한다.
                * (write 를 했는데 파일에 값 안적혀 있으면 flush() 할 것)
                * close()가 자동으로 flush 해주겠지만 입력 완료할 때 flush 시키자?
                **/
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(bw !=null) {
                try {
                    bw.close(); // 중요. close 안에는 flush() 가 있어 자동으로 flush도 해줌
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /*목차 2. BufferedReader를 활용해 한줄(개행문자전까지)씩 읽어오기*/
        try {
            br= new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));
            String s="";
            while ((s=br.readLine())!=null)
                System.out.println("s = " + s);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
