package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {

//    String name;
//    int hp;
    /*설명. 변수 명이 바뀌였다면?*/
    String kinds;
    int mp;

    public void setInfo1(String info1) {
//        this.name = info1;
        this.kinds=info1;
    }

    public void setInfo2(int info2) {
//        this.hp = info2;
        this.mp= info2;
    }
}
