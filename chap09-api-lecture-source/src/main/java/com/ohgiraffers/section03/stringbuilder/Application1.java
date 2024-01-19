package com.ohgiraffers.section03.stringbuilder;

/**
 * 목표<br><br>
 * String 과 StringBuilder의 차이점에 대해 이해하고 사용할 수 있다.<br>
 * @Note___
 * StringBuilder: StringBuffer보다 성능이 좋다.<br>
 * StringBuffer: Thread safe 기능이 추가적으로
 * <br>동작하여 성능이 더 떨어질 수 있음.
 */

public class Application1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
    //    StringBuilder sb2 = "java"; // 참고. StringBuilder은 문자열은 다루지만 리터럴은 다루지 않음.
        System.out.println(sb);

        /*설명. String과 SAtringBuilder로 수정 시 객체 주소값 변화 살펴보기*/
        String testStr = "java";
        StringBuilder testSb = new StringBuilder("kotlin");

        // 설명. 문자열 뒤에 삽입하고 해시값 변화 확인

        for (int i = 0; i < 9; i++) {

            testStr +=i;
            testSb.append(i);
            /*필기.
                * String은 hashCode() 메소드가 동등 비교를 위해 오버라읻잉이 되어 있어 주소값 확인을 하기 힘듦
                * 따라서 System.identityHashCode() 메소드를 통해 String으로 관리되는 문자열과 StringBuilder로 관리되는 문자열이
                * 각각 변화를 줄 때 새로운 객체를 생성하는지 확인하자
            * */
            System.out.println("testStr = " + System.identityHashCode(testStr));        // 매번 주소가 바뀜
            System.out.println("testSb = " + System.identityHashCode(testSb));          // 항상 그대로 유지
        }
        System.out.println("testStr = " + testStr);
        System.out.println("testSb = " + testSb);


    }
}
