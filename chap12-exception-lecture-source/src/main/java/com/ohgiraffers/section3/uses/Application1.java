package com.ohgiraffers.section3.uses;

import java.io.*;

/**
 * 목표<br><br>
 * 1. 예외처리를 많이 사용하는 io 패키지에서 예외처리를 하는 구문을 이해할 수 있다. <br>
 * <br>
 * 2. 예외 처리를 가장 많이 사용하게 되는 상황에서 try-catch 구문을 실제 상황과 유사하게 연습해보자.
 * (문법보다는 호출 흐름에 신경써보기)
 *
 * <br><br>
 * @finally목적: 예외처리 구문과 상관 없이 반드시 수행하는 경우 finally에 작성하며 보통 사용한 자원을 반납할 때 사용한다.
 */
public class Application1 {
    public static void main(String[] args) {
        BufferedReader br= null; //new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw =null;

        //System.out.println(new File(""/*root경로를의미*/).getAbsoluteFile());
        System.out.println(new File("test.dat").getAbsoluteFile());// 경로 확인

        try {
            br= new BufferedReader(new FileReader("test.dat"));
            String s="";

            while ((s = br.readLine()) !=null ) {
                sb.append(s+"\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("파일을 못찾겠어~!");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            /* 필기.
                * 예외처리 구문과 상관 없이 반드시 수행하는 경우 finally에 작성하며
                * 보통 사용한 자원을 반납할 목적으로 사용하게 된다.
            * */
            try {
                if(br!=null)    // 참고. 스트림이 생성되지 않았을 때 접근해서 close()메소드를 호출하게 되면 NullPointerException이 발생할 수 있어서 if문으로 방지함.
                    /*설명.
                     * 입출력에서 사용한 스트림을 닫아주는 메소드. API에서 IOException을 throws하는 메소드이기 떄문에
                     * finally 블록 안에서 try-catch 예외 처리를 중첩해 줘야 한다.
                    * */
                    br.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }


        try {
            bw=  new BufferedWriter(new OutputStreamWriter(System.out));
            bw.flush();
            bw.write(sb.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(bw!=null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
