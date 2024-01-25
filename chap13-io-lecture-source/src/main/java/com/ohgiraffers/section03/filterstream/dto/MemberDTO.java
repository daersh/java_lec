package com.ohgiraffers.section03.filterstream.dto;

import java.io.Serializable;

/**Serializable <br>
 * 기능은 없는 마커 인터페이스이다. <br>
 * 객체 단위 입출력을 하기 위해서는 Serializable 인터페이스를 구현하여 직렬화가 가능하다는 것을 표시할 수 있다.
 * */
public class MemberDTO implements Serializable {
    /**필드*/
    private String id;
    // 중요. transient: 해당 필드를 직렬화에서 제외하겠다라는 뜻. 옛날에 쓰던 방식이니 참고만 할 것.
    private /*transient*/ String pwd;
    private String name;
    private String email;
    private int age;
    private char gender;

    /**생성자*/
    public MemberDTO() {
    }
    public MemberDTO(String id, String pwd, String name, String email, int age, char gender) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    /**Getter, Setter*/
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    /**toString()*/
    @Override
    public String toString() {
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
