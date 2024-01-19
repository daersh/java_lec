package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.dto.BookDTO;

public class Application1 {

    public static void main(String[] args) {


        /* 수업목표.
                                         ** 목표 **
            --------------------------------------------------------------------
                * object 클래스의 toString()메서드 오버라이딩 목적을 이해하고 활용할 수있다.
            --------------------------------------------------------------------*/

        BookDTO book1= new BookDTO(1,"홍길동전","허균",50000);
        BookDTO book2= new BookDTO(2,"목민심서","정약용",30000);
        BookDTO book3= new BookDTO(3,"홍길동전","허균",50000);
        /*설명. 각 인스턴스의 toString()을 호출하면 각 인스턴스가 가진 필드 값을 문자열로 반환한다.*/
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        /*설명. 참조자료형 변수를 print , println으로 출력하면 자동으로 toString()을 호출해줌*/
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

    }
}
