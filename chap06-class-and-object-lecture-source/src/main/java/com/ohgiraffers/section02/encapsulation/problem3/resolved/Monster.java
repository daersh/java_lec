package com.ohgiraffers.section02.encapsulation.problem3.resolved;

public class Monster { //참고. class는 public만 됨. 안적어도 public
    /*필기. 접근제어자 private를 활용하여 캡슐화를 적용한다.*/
    private String name;
    private int hp;

    void setInfo1(String info1){
        this.name= info1;
    }

    void setInfo2(int info2){
        this.hp = info2;
    }

}
