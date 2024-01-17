package com.ohgiraffers.section08.uses;

public class MemberRepository {

    /*설명. static 변수인 멤버 객체 배열은 데이터베이스로 생각*/
    private final static Member[] members;

    static {
        members = new Member[10];
    }
    private static int count;

    /*설명. 데이터베이스 개념인 맴버 객체 배열에 넘어온 회원 가입용 회원 객체들을 한명 씩 추가*/

    public static boolean store(Member[] newMembers) {

        for(int i = 0; i < newMembers.length; i++) {
            members[count++] = newMembers[i];
        }

        return true;
    }
    /*설명. 데이터베이스 개념에서부터 조회하는 기능*/
    public static Member[] findAllMembers() {

        return members;
    }
}
