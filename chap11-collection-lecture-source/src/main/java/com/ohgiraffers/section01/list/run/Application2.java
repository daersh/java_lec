package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.comparator.DescendingAuthor;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**목표.
 * arrayList에서 관리된는 자료의 정렬 기준을 이요할 수 있다.
 * */
public class Application2 {

    public static void main(String[] args) {
        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO(1,"홍길동전","허균",50000));
        bookList.add(new BookDTO(2,"목민심서","정약용",30000));
        bookList.add(new BookDTO(3,"동의보간","허균",40000));
        bookList.add(new BookDTO(4,"삼국사기","김부식",40000));
        bookList.add(new BookDTO(5,"삼국유사","일연",58000));
//        for (int i = 0; i < bookList.size(); i++) {
//            System.out.println(bookList.get(i));
//        }
        Collections.sort(bookList, new DescendingAuthor());   //설명.Collections가 제공하는 sort

        bookList.sort(new AscendingPrice());                  //설명.ArrayList가 제공하는 sort(Comparable 안되고 Comparator 만 가능)
        for(BookDTO book : bookList){
            System.out.println(book);
        }

    }

}
