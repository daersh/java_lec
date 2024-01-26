package com.ohgiraffers.section04.assignment.service;

import com.ohgiraffers.section04.assignment.aggregate.Member;
import com.ohgiraffers.section04.assignment.repository.MemberRepository;

import java.util.ArrayList;
import java.util.Scanner;

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

    /*설명. 넘어온 회원의 번호를 추가한 후 레포지토리에 전달 후 결과 확인*/
    public void registMember(Member member) {
        System.out.println("사용자가 입력해서 넘겨준 멤버 확인" +member);
        // 맴버 memNo 생성
        int lastMemberNumberNo = mr.selectLastMemberNo()+1;
        member.setMemNo(lastMemberNumberNo);
        // 맴버 추가
        mr.addMember(member);

        System.out.println(member.getId()+"님의 회원 가입 성공했습니다~!");
        int save = mr.saveMember(member);
        if(save==1){
            System.out.println(member.getId()+"님의 회원 저장 성공했습니다~!");
        }

    }

    public void deleteMember() {
        Scanner sc =new Scanner(System.in);
        System.out.printf("삭제할 회원의 memNo 입력: ");
        int memNo= sc.nextInt();
        int result = mr.deletMember(memNo);

    }
}