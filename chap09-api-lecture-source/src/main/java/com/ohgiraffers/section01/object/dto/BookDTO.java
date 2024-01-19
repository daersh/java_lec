package com.ohgiraffers.section01.object.dto;

import java.util.Objects;

public class BookDTO {
    private int number;
    private String title;
    private String author;
    private int price;


    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /*목차. 1. toString() 오버라이딩*/
    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
    /*목차. 2. equals() 오버라이딩*/
    @Override
    public boolean equals(Object obj){
        //설명. 가격과 작가가 같은지 확인
        if(this == obj) return true;
        if(obj==null || getClass() != obj.getClass()) return false;
        BookDTO bookDTO = (BookDTO) obj;
        return number == bookDTO.number && price == bookDTO.price && Objects.equals(title,bookDTO.title)&& Objects.equals(author,bookDTO.author);
    }

}
