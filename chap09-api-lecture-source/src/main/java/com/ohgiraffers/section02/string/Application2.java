package com.ohgiraffers.section02.string;

/**
 * 목표<br><br>
 *  문자열 객체를 생성하는 다양한 방법을 숙지하고 인스턴스가 생성되는 방식을 이해할 수 있다.<br>
 * 문자열 객체를 만드는 방법<br><br>
 * 참고<br>
 * "" 리터럴 형태: 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다(싱글톤 개념) <br>
 * new String(""): 매번 새로운 인스턴스를 생성한다(주소값이 다르다.)
 */

public class Application2 {

    public static void main(String[] args) {
        String  str1 = "java";                                 // 값
        String  str2 = "java";                                 // 값
        String  str3 = new String("java");             //주소
        String  str4 = new String("java");             //주소
        System.out.println("str1== str2: "+ (str1 == str2));            //결과. true :
        System.out.println("str2== str3: "+ (str2 == str3));            //결과. false:
        System.out.println("str3== str4: "+ (str3 == str4));            //결과. false:
        /* 필기.
            * String 객체는 리터널로 생성될 때는 힙 영역의 상수풀(constant pool)에 생성된다.
            * 상수풀은 동등한 String 객체를 하나만 저장하는(중복제거) 공간으로 동일한 String 변수를 효율적으로 사용할 수 있도록 제공된다.
                * String의 equals(), hashCode()를 통해 적용
        * */
        /*설명. 위의 네가지 경우 모두 동들한 String 객체이므로 equals는 true, hashCode는 같은 값이 나온다.*/
        System.out.println("str1.equals(str3): "+ str1.equals(str3));
        System.out.println("str1.hashCode() == str3.hashCdoe():" + (str1.hashCode() == str3.hashCode()));
        /*필기.
            * String은 불변객체이다.
        * */
        String str = "apple";
        str+=", banana";
        System.out.println(str);

    }
}
