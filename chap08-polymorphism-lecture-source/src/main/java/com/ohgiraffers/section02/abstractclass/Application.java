package com.ohgiraffers.section02.abstractclass;

public class Application {
    public static void main(String[] args) {
        /* 수업목표.
                                       ** 목표 **
                  ----------------------------------------------------
                         * 추상클래스와 추상메소드에 대해 이해할 수 있다. *
                  ----------------------------------------------------*/
        /* 필기.
                                 ** 추상클래스, 추상메서드 **
            -----------------------------------------------------------------
                추상클래스 - 불완전한 클래스
                    * 추상메서드를 0개 이상 포함하는 클래스
                    * 불완전한 클래스는 생성자를 통해 객체 생성할 수 없다.
                    * (단, 자식 클래스 객체가 생성될 때는 내부적으로 생성 가능)
                    ex) public abstract calss Product{ ... }
                추상메소드 - 불완전한 메소드
                    * 메소드의 헤드만 있고 바디가 없는 메소드
                    * 불완전한 메소드를 가진 클래스는 반드시 추상 클래스가 되어야 함.
                    ex) public abstract void method();
                사용처
                   1. 처음 설계할 때, 추상 클래스로 인터페이스를 만들어 규약을 만들기 위함.
                     * 이를 통해 하위 개발자가 상위개발자가 만든 추상클래스를 통해 개발 가능
                   2. API에서 추가적으로 만들고 싶을 때 상속받아서 자신에게 맞게 만듦
                                   * 잘 쓰는 편은 아님 *
            -----------------------------------------------------------------*/
//        Product product = new Product(); //설명. 추상클래스 선언 불가
        /* 설명. abstract 클래스는 객체를 생성할 수 없는 불완전한 클래스이다. */
        Product product =new Product() {
            @Override
            public void abstractMethod() {

            }
        };

        /*설명. 추상화 메소드를 구현한 온전한 자식 클래스는 객체(인스턴스)생성 가능*/
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.abstractMethod();
        smartPhone.printSmartPhone();

        Product product1 = new SmartPhone();
        product1.abstractMethod();      //설명. 동적 바인딩에 의한 자식 클래스의 오버라이딩 메소드 실행

    }
}
