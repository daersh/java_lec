package com.ohgiraffers.section01;

public class Car {
    /*설명. 자동차의 속성과 기능 나열*/
    private boolean runningStatus;

    public Car(){
        System.out.println("Car 클래스 기본 생성자 호출됨...");
    }

    // 달리는 기능
    public void run(){
        runningStatus =true;
        System.out.println("자동차가 달리기 시작합니다.");
    }
    // 경적 기능
    public void soundHorn(){
        if(isRunning()){
            System.out.println("빵 빵");
            return;
        }
        System.out.println("주행중이 아닐 떄는 경적을 울릴 수 없습니다.");
    }

    // 달리는 중인지 확인하는 기능
    public boolean isRunning(){
        return runningStatus;
    }

    // 정지
    public void  stop(){
        runningStatus =false;
        System.out.println("자동차가 멈춥니다.");
    }
}
