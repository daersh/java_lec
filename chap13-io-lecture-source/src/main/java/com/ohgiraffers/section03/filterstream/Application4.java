package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;

import java.io.*;

/**
 * 목표<br><br>
 * 객체 단위 입출력 보조스트림을 이해하고 활용할 수 있다. <br>
 */

public class Application4 {
    public static void main(String[] args) {
        MemberDTO []memArr= new MemberDTO[100];
        memArr[0] = new MemberDTO("user01","pass01","홍길동","hong@gmail.com",20,'남');
        memArr[1] = new MemberDTO("user02","pass02","유관순","you@gmail.com",16,'여');
        memArr[2] = new MemberDTO("user03","pass03","이순순","lee@gmail.com",57,'남');


        // 설명. 객체를 보내기 위한 것 (출력)
        /* 설명.
            * 1. 기존에 파일이 해당 위치에 없다면, 기존 ObjectOutputStream으로 처음 데이터 넣기
            * 2. 기존에 파일이 해당 위치에 없다면, 기존 MyOutput으로 데이터 이어넣기
        * */
        ObjectOutputStream objOut = null;
        File file = new File("src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt");

        try {
            if(!file.exists())
                objOut= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt")));
            else
                objOut= new MyOutput(new BufferedOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt")));
            //중요. 직렬화, 역직렬화 관련 에러 발생. MemberDto에 Serializable 인터페이스 받아야함.
            for (int i = 0; i < memArr.length; i++) {
                objOut.writeObject(memArr[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(objOut!=null)
                    objOut.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        // 설명. 출력이 된 객체를 입력받아 확인하기 위한 새로운 MemberDTO[] 생성
        MemberDTO[] inputMembers = new MemberDTO[100000];
        ObjectInputStream ois = null;

        try {
            ois= new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt")));
                //목차. 방법1
//            for (int i = 0; i < memArr.length; i++) {
//                inputMembers[i] = (MemberDTO) ois.readObject();
//                System.out.println("inputMembers = " + inputMembers[i]);
//            }
            //목차. 방법2
//            while (true){
//                System.out.println("ois = " + ois.readObject());
//            }
            //목차. 방법3
            int i=0;
            while (true){
                inputMembers[i] = (MemberDTO) ois.readObject();
                if(inputMembers[i]==null) break;
                i++;
            }
        }catch (EOFException e){ // 파일 다 읽었을 때 끝내기 위한 예외 처리!
            System.out.println("객체 단위 입력 완");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (MemberDTO a : inputMembers){
            if(a ==null) break;
            System.out.println("a = " + a);
        }
    }
}
