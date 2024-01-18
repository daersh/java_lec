package com.ohgiraffers.section01;

public class RacingCar extends Car {
    public RacingCar() {
        System.out.println("RacingCar 클래스 기본 생성자 호출됨...");
    }

    @Override
    public void run(){
        super.run();
    }
    @Override
    public void soundHorn(){
        System.out.println("레이싱카는 경적 따위 울리지 않습니다.");
    }
}
