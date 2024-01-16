package com.ohgiraffers.section01.user_type;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /*수업목표. 클래스가 무엇인지 이해하고 작성할 수 있다.*/

        /*설명.
            * 회원 정보를 관리하기 위해 회원의 여러 정보(id,pw,name,age,sex,hobby)를 취급하여 관리하고자 한다.
            * 이 자료를 취급할 수 있는 방법 생각해 보자.
        * */

        /*목차. 1. 변수를 이용한 회원 데이터 관리*/
        String id = "user01";
        String pw = "pass01";
        String name= "홍길동";
        int age= 20;
        char gender = '남';
        String []hobby = new String[]{"축구","볼링","테니스"};

        System.out.println("id = " + id);
        System.out.println("pw = " + pw);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("hobby = " + Arrays.toString(hobby));

        /*필기.
            * 변수로만 관리할 때 문제점
                * 1. 많은 변수명들을 관리하기 힘들 수 있다.
                * 2. 메소드의 전달인자로 전달 할 값이 너무 많아 회원과 관련된 기능 호출할 때 매개변수가 많아짐 -> 나쁜 냄새 나는 코드
                * 3. 메소드의 반환형으로 회원이라는 개념을 반환할 수 없다.(메소드의 반환형은 하나여야 하기 때문
        * */
        Member member1 = new Member();
        Member member2 = new Member("hong","gil","홍길동",27,'M', new String[]{"축구","야구"} );
        member1.print_stat();
        member2.print_stat();

        /*설명. 회원 정보를 하나의 전달 인자로 전달하고 하나의 매개변수로 받을수 있다.*/
        /*설명. 또한 메소드의 반환형으로 한번에 회원 정보를 반환할 수 있고, 반환 받은 곳에서 반환된 타입에 접근도 가능하다.*/
        System.out.println(print_Member(member2).getName());
        member2.print_stat();
        Member member3 = print_Member(member2);
        member3.print_stat();

    }

    private static Member print_Member(Member member1) {
        System.out.println("개명을 시작합니다.");
        member1.setName("박길동");
        return member1;
    }
}
