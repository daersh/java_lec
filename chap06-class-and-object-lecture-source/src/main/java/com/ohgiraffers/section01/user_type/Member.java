package com.ohgiraffers.section01.user_type;
/* 설명. 회원 정보를 가지는 객체
    * 여러가지 타입의 값을 하나의 타입으로 묶을 수 있다. (이 클래스는 구조체에 가까움)
 * */

import java.util.Arrays;

public class Member {
    private String id;
    private String pw;
    private String name;
    private int age;
    private char gender;
    private String[] hobby;
    Member(){
        this.id = "default-id";
        this.pw = "default-pw";
        this.name = "default-name";
        this.age = 0;

        this.gender = 'X';
        hobby=null;
    };

    Member(String id, String pw, String name, int age, char gender, String[] hobby){
        this.id=id;
        this.pw = pw;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }
    void print_stat(){
        System.out.println("\n========================================");
        System.out.println("               USER STAT \n");
        System.out.println("        ID: "+getId());
        System.out.println("        PW: "+getPd());
        System.out.println("       이름: "+getName());
        System.out.println("       나이: "+getAge());
        System.out.println("       성별: "+getGender());
        System.out.println("       취미: "+ Arrays.toString(getHobby()));
        System.out.println("\n========================================\n");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPd() {
        return pw;
    }

    public void setPd(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }


}
