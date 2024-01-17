package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class User {
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    /*참고.
        * 생성자 작성 위치
            * 작성 위치는 문법상으로 클래스 내부에 필드 선언부 이후, 메소드 선언부 이전에 작성하는 것이 관례이다.
    * */
    public User(){
        System.out.println("새로운 유저 생성");
    }

    public User(String id, String pwd, String name, Date enrollDate) {
/* 필기.
    ------------------------------------------------------------------------------------------------------------------
        * 생성자 안의 this.은 해당 생성자를 통해 생성될 객체에 접근하는 것이다.
        * 일반적으로 필드의 변수명과 매개변수명이 동일하므로 반드시 this.을 명시해야함.
        * 생성자 안의 this()는 해당 클래스의 다른 생성자를 사용하는 것.
    ------------------------------------------------------------------------------------------------------------------*/
    //        this.id= id;
    //        this.pwd=pwd;
    //        this.name=name;
        // this()                                           //설명.this()를 통한 다른 생성자 활용은 다른 하나의 생성자만 활용 가능.
        this(id,pwd,name);
        this.enrollDate=enrollDate;
        //this(id,pwd,name);                                // 중요.다른 생성자를 활용하는 구문(this())는 반드시 먼저 명시해야함/

        System.out.println("모든 필드를 초기화하는 매개변수 있는 생성자를 통해 user 객체 생성");
    }

    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public String forInformation(){
        return  this.id+", "+this.pwd +", "+this.name + ", "+ this.enrollDate;
    }
}
