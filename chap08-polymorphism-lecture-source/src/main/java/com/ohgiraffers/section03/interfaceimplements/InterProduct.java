package com.ohgiraffers.section03.interfaceimplements;

// 설명. 인터페이스간 상속은 extends, 다중 상속도 가능
public interface InterProduct extends ParentInterProduct,AnotherParentInterProduct {
    // 설명.필드 선언
    //private String name;                      // 참고 err
    //public String name;                       // 참고 err
    //public static name;                       // 참고 err
    public static final int MAX_NUM = 100;      // 참고. 가능하다!

    /*설명. 상수 필드만 가질 수 있기 때문에 모든 필드는 묵시적으로 public static final 이다.!*/
    int MAX_NUM2 = 120;                         // 참고. public static final이 자동으로 들어가 가능

// 설명.
//   ====================================================================================================

    // 참고. 상속 이후 부터 추상클래스, 인터페이스는 객체가 아니다.

    /*설명. 인터페이스는 생성자를 가질 수 없다.*/
    //public InterProduct(){};

    /*설명. abstract에서 메서드 생성 불가*/
    //public void test(){}; // err
    //private void te(); // err
    private void test(){ //참고. 자바 9 버전부터 private void  (){} 가능해짐
        System.out.println("private void test() 호출됨...!!!");
    };

    public default void callTest(){
        System.out.println("callTest....");
        test();
    }
    /*참고. 모두 public abstract 들어가있음*/
    abstract public void test1();
    public static void staticTest(){    //참고. static 메서드 바디부까지 작성 허용.
        System.out.println("InterProduct.staticTest 호출됨..!");
    }
    public default void test2(){ // 참고. default이면 static이 아니여도 가능하다.
        System.out.println("InterProduct.test2 호출됨.!");
        test();
    }
    void test3();
    abstract void test4();
    public abstract void nonStaticMethod();
    public static  void test6(){
        System.out.println("sdfdsf");
    }

}
