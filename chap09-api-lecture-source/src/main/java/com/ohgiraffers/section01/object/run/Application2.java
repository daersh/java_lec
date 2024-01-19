package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.dto.BookDTO;

//  * <ul><li>
/**
 * <li>목표<br><br>
 * 1. object 클래스의 equlas()메서드 오버라이딩 목적을 이해하고 활용할 수있다.<br>
 */

public class Application2 {
    public static void main(String[] args) {
        BookDTO book1= new BookDTO(1,"홍길동전","허균",50000);
        BookDTO book2= new BookDTO(1,"홍길동전","허균",50000);
        System.out.println("두 인스턴스 == 비교 : "+(book1==book2));                                       //참고. 거짓
        System.out.println("두 인스턴스 equals 비교 : "+book1.equals(book2));                              //참고. 참(재정의하여 author,price 비교시킴)
        System.out.println("두 인스턴스 equals 비교 : "+book1.getAuthor().equals(book2.getAuthor()));      //참고. 참


    }
}
