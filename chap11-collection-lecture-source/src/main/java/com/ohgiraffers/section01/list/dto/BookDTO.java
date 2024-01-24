package com.ohgiraffers.section01.list.dto;

public class BookDTO implements Comparable<BookDTO>{     //설명. 비교하여 정렬 기준 정하기 위한 메서드
    /**Field*/
    private int number;
    private String title;
    private String author;
    private int price;
    /**생성자*/
    public BookDTO() {}
    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /**Getter,Setter*/
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
    /**toString 메서드*/
    @Override
    public String toString() {
        return "BookDto{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }



    /**<정렬><br>
     * 가격을 기준으로 오름차순 정렬 설정하기 위한 메소드이다. Comparable 인터페이스의 compareTo 메소드를 오버라이딩하여 정렬의 기준을 변경할 수 있다.
     * <br><br>
     * @정렬기준정리
     * @1. 우리가 원하는 필드의 오름차순 내림차순을 할 수 있다. 필드가 4개면 총 8가지 정렬 기준 가질 수 있다(4*2).<br>
     * @2. 정렬은 compareTo() 메서드가 반환하는 int 의 부호에 따라 정해진다. 부호가 반대로 되면 오름차순,내림차순의 기준도 반대로 된다.<br>
     * @3. 오름차순은 매개변수로 넘어온 것을 빼주는 형태로 작성하면 된다.(String 제외)
     * @4. 참조자료형은 compareTo() 메서드 사용한다.
     * */

//    @Override
//    public int compareTo(Object o) {
            /*Comparable*/
//        //설명. 기준- 가격(Integer)
////        return this.price - ((BookDto)o).price; // 오름차순
////        return  ((BookDto)o).price-this.price; // 내림차순 1
////        return -(this.price - ((BookDto)o).price);   // 내림차순 2
//
//        //설명. 기준- 작가(String)
////        return  this.author.compareTo(((BookDto) o).author);    // 오름차순
//        return  -this.author.compareTo(((BookDto) o).author);    // 내림차순
//    }
    @Override
    public int compareTo(BookDTO o) {
        /**설명.Comparable<.BookDto>로 기준을 정한 경우 - 인터페이스에 제네릭을 거는 경우 다운 캐스팅이 불필요하다.*/
        return this.title.compareTo(((BookDTO) o).title);
    }
}
