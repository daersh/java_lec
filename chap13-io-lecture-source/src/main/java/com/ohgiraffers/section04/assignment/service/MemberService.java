package com.ohgiraffers.section04.assignment.service;

import com.ohgiraffers.section04.assignment.aggregate.Member;
import com.ohgiraffers.section04.assignment.repository.MemberRepository;

import java.util.ArrayList;

/* 설명. 트랜잭션 성공실패 여부 확인 및 회원 관련 비즈니스 로직 처리하는 클래스 */
public class MemberService {

    private final MemberRepository mr = new MemberRepository();


    public void selectAllMembers() {

        ArrayList<Member> selectedMembers = mr.selectAllMembers();

        /*설명. 회원이 한명도 없어서 조회 결과가 없더라도 ArrayList 객체는 Empty 상태로 넘어온다.*/
        if(!selectedMembers.isEmpty()) {    //설명. 회원이 한명이라도 조회된다면 실행.
            System.out.println("==== service까지 잘 반환되어 오나 확인 ====");
            for (Member m : selectedMembers) {
                System.out.println(m);
            }
            return;                         //설명. 이후 코드와 강관 없이 메소드 종료.
        }
        //설명. 조건(회원이 있는지)이 맞지 않으면 실행되는 구문
        System.out.println("슬프게도 우리 사이트는 아직 회원이 없습니다.");
    }

    /* 설명. 전달된 회원 번호를 활용해 repository에 있는 memberList로부터 해당 회원 찾아 반환 받기 */
    public void selectMember(int memNo) {
        Member selectedMember = mr.selectMember(memNo);

        if(selectedMember == null) {
            System.out.println("그런 회원이 없네요!~");
        } else {
            System.out.println("조회된 회원은: " + selectedMember);
        }
    }
}