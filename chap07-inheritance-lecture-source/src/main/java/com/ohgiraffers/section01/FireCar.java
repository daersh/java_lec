package com.ohgiraffers.section01;

public class FireCar extends Car{
    // 설명. 상속받아 Car의 기능 사용 가능하다!

    /*필기.super()는 부모 생성자를 호출하는 구문으로 인자와 매개변수의 타입, 갯수, 순서가 일치하는 부모의 생성자를 호출하게 된다.
       super()는 부모 클래스가 가지는 private 생성자를 제외한 나머지 생성자를 호출할 수 있도록 한 구문이다.*/
    public FireCar() {
        super();
        System.out.println("FireCar 클래스 기본 생성자 호출됨..,");
    }

    /*필기.
        * 오버라이드 사용 이유
            * 1. 메소드 중 부모로부터 물려받은 메소드인 것을 알아볼 수 있도록 하기 위해 (가독성 측면)
            * 2. 부모의 메소드를 오버라이딩 할 때 발생될 수 있는 실수를 방지하기 위해(살수 방지 측면)
    * */
    @Override
    public void soundHorn(){    //설명. 부무로부터 물려받은 메서드 재정의, override 적용되면 해당 메서드의 이름이 부모 메서드 이름과 다르면 에러

        if(isRunning()){
            System.out.println("빠아아아아아아앙!! 빠아아아아아아아아아아아앙!!");
            return;
        }
        System.out.println("주행중이 아닐 떄는 경적을 울릴 수 없습니다.");    }
    // 부모에 없는 기능 확장
    public void sprayWater(){
        System.out.println("불 난 곳 발견! 물 뿌립니다. ============33");
    }
}
