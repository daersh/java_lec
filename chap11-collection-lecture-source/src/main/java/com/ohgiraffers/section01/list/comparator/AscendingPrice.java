package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

/**원하는 필드의 원하는 정렬 기준을 정의하는 클래스(Comparator 인터페이스)
 * Comparable 보다 Comparator 가 더 우선시 된다.
 * */
public class AscendingPrice implements Comparator<BookDTO> {    //설명. BookDto 제네릭 설정
//    @Override
//    public int compare(Object o1, Object o2) {
//        return ((BookDto)o1).getPrice()-((BookDto)o2).getPrice();
//    }
    /**가격 오름차순을 위한 compare 메소드 오버라이딩 작성*/
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getPrice()-o2.getPrice();
    }

}
