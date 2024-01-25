package com.ohgiraffers.section02.enumtype;

public enum Subjects {
    //필기. 필드 전부 public final static 이다.
    // 0으로 호출해도 JAVA랑 연결된다?
    JAVA,           //0
    MARIADB,        //1
    JDBC,           //2
    HTML,           //3
    CSS,            //4
    JAVASCRIPT      //5
    ; // 중요! 뒤에 생성자와 같은게 들어오면 세미콜론 ; 붙여야함.!!!

    //설명. 생성자가 들어올 수 있음.
    // 설명. 인스턴스가 하나임을 보장시켜줌
    Subjects() {
        System.out.println("기본생성자 호출");
    }

    @Override
    public String toString() {
        return "@@@ " + super.toString()+" @@@";
    }

}
