package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {
    private int nonStaticCount;
    private static int staticCount;

    /*설명. 기본 생성자 및 getter만 생성*/
    StaticFieldTest(){}
    public int getNonStaticCount() {
        return nonStaticCount;
    }
    public static int getStaticCount() {
        return staticCount;
    }

    /*설명. setter를 대신하여 필드 값을 각각 증가시킬 두 메소드 추가*/
    public void increaseNonStaticCount(){
        nonStaticCount++;
    }
    public static void increaseStaticCount(){
        staticCount++;
    }



}
