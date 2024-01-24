package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

/**작가 이름을 기준으로 내림차순 정렬하기 위한 Comparator*/
public class DescendingAuthor implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return -o1.getAuthor().compareTo(o2.getAuthor());
    }
}
