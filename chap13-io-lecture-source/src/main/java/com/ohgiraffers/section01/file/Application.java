package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

/**
 * 목표<br><br>
 *  File 클래스의 사용 용법을 이해할 수 있다. <br>
 */

public class Application {
    public static void main(String[] args) {
        File file =new File("src/main/java/com/ohgiraffers/section01/file/test.txt");

        try { // 설명. 생성될 때 인지한 파일의 경로 및 파일명을 바탕으로 파일을 생성 후 성공 여부를 반환한다.
            boolean isSuccess = file.createNewFile();
            System.out.println("파일 생성 여부 = " + isSuccess);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* 설명. 몇 가지 File에서 제공하는 메소드 확인*/
        System.out.println("file size: "+file.length()+"byte");
        System.out.println("file path: "+ file.getPath());              // 자기 자신인 파일이름까지 들어감
        System.out.println("file parent path: "+file.getParent());      // 자기 자신 제외
        System.out.println("file 절대 경로: "+ file.getAbsolutePath());
//        file.
        boolean isDeleted = file.delete();
        System.out.println("파일 삭제 여부 " + isDeleted);
    }
}
