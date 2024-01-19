package com.ohgiraffers.section04.wrapper;

/**
 * 목표<br><br>
 * Wrapper 클래스에 대해 이해하고 활용할 수 있다. <br>
 */

public class Application1 {
    public static void main(String[] args) {
        int intValue = 20;
        /*설명. 기본자료형을 래퍼 클래스 자료형 변환 가능(박싱)*/
        Integer boxingInt = (Integer) intValue;
        Integer boxingInt2 = Integer.valueOf(intValue);
        Integer boxingInt5 = (Integer) 20;

        /*설명. 래퍼클래스 자료형을 기본자료형으로 변환 가능(언박싱)*/
        int unboxingValue1 = boxingInt.intValue();

        /*설명. 기본자료형과 래퍼 클래스는 자동으로 박싱, 언박싱 가능*/
        Integer autoBoxingInt = intValue;
        int autoUnboxingValuew = autoBoxingInt;
        anythingMethod(10); // 설명. Object obg= (Object)(Integer)10;

        /*설명. 래퍼 클래스 값 비교*/
        //참고. 리터럴을 받기 때문에 주소도 동일한 것을 알 수 있다.
        // 래퍼 클래스도 리터럴값으로 오토박싱하면 결국 동일한 객체 하나만 관리된다.
        Integer integerTest= (Integer)30;
        Integer integerTest2 = (Integer)30;
        System.out.println("integerTest== integerTest2: " + (integerTest==integerTest2));
        System.out.println("integerTest.equals(integerTest2)"+ (integerTest.equals(integerTest2)));
        System.out.println("integerTest address: "+ System.identityHashCode(integerTest));  // 주소 동일!
        System.out.println("integerTest2 address: "+ System.identityHashCode(integerTest2));

    }
    /*설명. 매개변수가 Object인 메소드(모든 자료형의 인자 받을 수 있는 메소드)*/
    public static void anythingMethod(Object obj){      // 설명. 10 -> Integer(autoboxing) -> Object(다형성)
        System.out.println("obj: "+obj); // 설명. Object의 toString()이 아닌 Integer의 toString()이 실행 (동적 바인딩 )
    }
}
