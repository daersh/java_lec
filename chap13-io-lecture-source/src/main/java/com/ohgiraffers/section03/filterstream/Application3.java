package com.ohgiraffers.section03.filterstream;


import java.io.*;

/**
 * 목표<br><br>
 * 데이터 타입 입출력 보조스트림을 이해하고 활용할 수 있다.(Reader 또는 Writer계열 X) <br>
 */
public class Application3 {
    public static void main(String[] args) {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testData.txt"/*,true*/));

            /*설명. 데이터 타입 별로 해당 데이터 타입에 맞는 출력 메소드를 활용하여 파일에 출력하기(순서 신경쓸 것!!)*/
            // 파일에는 알아불 수 없는 자료형들로 저장됨
            dos.writeUTF("홍길동");
            dos.writeInt(20);
            dos.writeChar('A');

            dos.writeUTF("유관순");
            dos.writeInt(16);
            dos.writeChar('B');

            dos.writeUTF("강감찬");
            dos.writeInt(46);
            dos.writeChar('C');

        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        DataInputStream dis=null;
        try {
           dis= new DataInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/testData.txt"/*,true*/));
           //참고. 넣었던 순서 그대로 가져와야함. 잘못 받으면 이상한 값 받음
//            for (int i = 0; i < 3; i++) {
//                System.out.println(dis.readUTF());
//                System.out.println(dis.readInt());
//                System.out.println(dis.readChar());
//            }

            while (true){// 무한 돌다가 예외로 자연스럽게 빠지게함
                System.out.println(dis.readUTF());
                System.out.println(dis.readInt());
                System.out.println(dis.readChar());
            }

        } catch (EOFException e) {//중요 EOFException
            /*설명. 데이터 입출력은 EOFException을 활용 하여 파일의 끝까지 입력 받는 것을 처리할 수 있다.*/
            System.out.println("파일 다 읽어냄");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                dis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
