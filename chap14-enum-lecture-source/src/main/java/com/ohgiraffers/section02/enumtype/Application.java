package com.ohgiraffers.section02.enumtype;
/**
 * 목표<br><br>
 * 열거형(ENUM)을 이용하서 상수 열거 패턴의 단점을 해결하는 것을 알 수 있다. <br>
 */
public class Application {
    public static void main(String[] args) {

        //설명. 사용 시 장점
        //설명 1. 열거 타입으로 선언된 인스턴스는 싱글톤으로 관리되며 인스턴스가 한 개임을 보장한다.(순서 개념의 인덱스가 아니라 인스턴스이다.)
        //Subjects subject1 = Subjects.
        Subjects subject1 = Subjects.JAVA;
        Subjects subject2 = Subjects.HTML;
        Subjects subject3 = Subjects.JAVA;
        if(subject1==subject2)
            System.out.println("sub1 == sub2 =true");
        else
            System.out.println("sub1 == sub2 =false");

        //설명 2. 단일 인스터스임을 보장하기에 == 비교가 가능하다.
        if(subject1==subject3)
            System.out.println("sub1 == sub3 =true -> 즉, 싱글톤을 보장하여 같은 주소임을 알 수 있다.");

        //설명 3. toString()/name() 을 통해 필드형을 문자열로 변경하기 쉽다.(feat. switch 안씀)
        System.out.println("subject1 = " + subject1.toString());    // 참고 toString으로 재정의하여 다르게 출력 가능
        System.out.println("subject1 = " + subject1.name());

        //설명 4. values()를 사용하여 상수값 배열의 반환받고 이를 이용하여 연속처리할 수 있다.
        Subjects [] subjects = Subjects.values();
        for(Subjects a : subjects){            
            System.out.println("a = " + a);
            System.out.println(a.ordinal());        //몇번위치인지
            System.out.println(a.name());
        }
        
        //설명 5. 타입 안전을 보장할 수 있다. 매개변수를 Subjects 타입으로 할 수 있다.
        printSubjects(Subjects.JAVA);
        //printSubjects(0); // 참고. 이제 0 못들어감.

        //디비에서 남여 제한 거는 것과 비슷한 목적에 사용?
    }

    private static void printSubjects(Subjects subjects) {

    }
}
