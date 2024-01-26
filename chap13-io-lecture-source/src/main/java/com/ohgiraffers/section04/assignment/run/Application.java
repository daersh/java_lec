package com.ohgiraffers.section04.assignment.run;


import com.ohgiraffers.section04.assignment.aggregate.BloodType;
import com.ohgiraffers.section04.assignment.aggregate.Member;
import com.ohgiraffers.section04.assignment.repository.MemberRepository;
import com.ohgiraffers.section04.assignment.service.MemberService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/* 설명. 프로그램 실행 및 메뉴 출력과 사용자의 입력을 받을 View에 해당하는 클래스 */
public class Application {

    private static final MemberService mm = new MemberService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("======= 회원 관리 프로그램 =======");
            System.out.println("1. 모든 회원 정보 보기");
            System.out.println("2. 회원 찾기");
            System.out.println("3. 회원 가입");
            System.out.println("4. 회원 탈퇴");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택해 주세요: ");
            int input = sc.nextInt();

            switch(input) {
                case 1: mm.selectAllMembers();
                    break;
                case 2: mm.selectMember(chooseMemberNo());
                    break;
                case 3: mm.registMember(signUp());;
                    break;
                case 4: mm.deleteMember();
                    break;
                case 9: System.out.println("프로그램을 종료합니다.");
                    return;
                default: System.out.println("번호를 제대로 다시 입력해 주세요");
            }
        }
    }


    /*설명. 사용자로부터 회원번호를 제외한 정보를 입력 받아 Member타입으로 반환하는 메소드(parsing, 가공 처리)*/
    private static Member signUp() {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Member insert = new Member();

        System.out.println("ID PWD AGE HOBBIES BLOOD_TYPE");
        try {

            StringTokenizer st = new StringTokenizer(br.readLine());
            String id = st.nextToken();
            String pwd = st.nextToken();
            int age = Integer.parseInt(st.nextToken());

            ArrayList<String> hobbyList = new ArrayList<>();

            while (st.hasMoreTokens()) {
                hobbyList.add(st.nextToken());
            }

            String[] hobbies = new String[hobbyList.size()-1];
            for (int i = 0; i < hobbyList.size()-1; i++) {
                hobbies[i] = hobbyList.get(i);
            }

            System.out.println("hobbies = " + Arrays.toString(hobbies));
            BloodType bt =null;
            String blood= hobbyList.get(hobbyList.size()-1).toUpperCase();
            System.out.println("blood = " + blood+".");
            switch (blood){
                case "A": bt= BloodType.A;break;
                case "B": bt= BloodType.B;break;
                case "AB":bt= BloodType.AB;break;
                case "O":bt=BloodType.O;break;
                default:
                    System.out.println("blood 불일치");
            }

            /*필기.
                * 회원으로부터 회원가입 위한 정보를 받아 맴버 객체로 가공하는 두가지 방식
                * 1. 생성자 방식(장: 한줄 코딩 가능, 단: 따로 생성자 추가)
                * 2. 세터 방식(장: 초기화할 갯수 수정 용이, 단: 코딩 줄 늘어남)
            * */
            insert= new Member(id,pwd,age,hobbies,bt);

            return insert;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /* 설명. 회원 한명 조회를 위해 해당 회원 번호를 입력받아 반환하는 메소드 */
    private static int chooseMemberNo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원번호를 입력하세요: ");
        return sc.nextInt();
    }
}