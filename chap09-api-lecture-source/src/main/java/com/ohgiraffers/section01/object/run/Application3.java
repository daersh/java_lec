package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.dto.BookDTO;

/**
 * 목표<br><br>
 * 1. Object 클래스의 hashCode() 메소드 오버라이딩 목적을 이해하고 활용할 수 있다.<br>
 */
public class Application3 {
    public static void main(String[] args) {
        BookDTO book1= new BookDTO(1,"홍길동전","허균",50000);
        BookDTO book2= new BookDTO(1,"홍길동전","허균",50000);
        System.out.println("book1 HashCode: "+ book1.hashCode());
        System.out.println("book2 HashCode: "+ book2.hashCode());

    }

}
