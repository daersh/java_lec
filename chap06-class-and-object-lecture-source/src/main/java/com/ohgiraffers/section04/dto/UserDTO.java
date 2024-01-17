package com.ohgiraffers.section04.dto;

import java.util.Date;

/* 필기.
                                               ** JAVA BEAN **
    --------------------------------------------------------------------------------------------------------
        * 자바빈(JAVA BEAN)이란?
            * JSP에서 배우게 될 표준 액션 테그로 접근할 수 있게 만든 자바 클래스이다.
            * 자바 코드를 모르는 웹 퍼블리셔들도 자바 코드를 사용할 수 있도록 태그 형식으로 지원하는 문법을 의미하는데,
            * 그 떄 사용할 수 있도록 규칙을 지정해 놓은 자바 클래스를 자바빈이라 한다.
            * 지금은 특정 목적에 따라 클래스르 작성하는 규칙이라고 볼 수 있다.
    --------------------------------------------------------------------------------------------------------
        * 자바빈 작성 규칙
            * 1. 자바빈은 특정 패키지에 속해있어야 한다.(default 패키지 사용 금지)
            * 2. 필드의 접근제어자는 private 로 선언해야 함.
            * 3. 기본생성자가 명시적으로 존재해야 함(매개변수 있는 생성자는 선택사항)
            * 4. 모든 필드에 접근 가능한 설정자(setter), 접근자(getter)가 public 으로 작성 되어 있어야 함.
            * 5. 직렬화(Serializable 구현)를 고려해야한다.(선택사항)
    --------------------------------------------------------------------------------------------------------*/

public class UserDTO {
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    public UserDTO() {}

    public UserDTO(String id, String pwd, String name, Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    public void forInformation(){
        System.out.println(id + ", " + pwd + ", " + name + ", " + enrollDate);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }
}

