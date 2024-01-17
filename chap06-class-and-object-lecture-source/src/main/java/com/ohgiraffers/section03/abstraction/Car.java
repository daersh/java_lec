package com.ohgiraffers.section03.abstraction;

public class Car {
    private boolean isOn;
    private int speed;

    /*설명. 시동이 걸린 상태에만 속도 10 올림*/
    public void go() {
        if(isOn){
            System.out.println("차가 앞으로 움직입니다.");
            speed+=10;
            System.out.println("현재 시속은 "+speed+"km/h 입니다.");
        }else{
            System.out.println("차 시동이 안걸려 있습니다.");
        }
    }

    /*설명. 시동이 걸려있고 달리는 상태인 경우에만 멈출 수 있다.*/
    public void stop() {
        if(isOn){
            if(speed!=0) {
                System.out.println("정지합니다.");
                speed=0;
            }else{
                System.out.println("이미 정지했습니다.");
            }
        }else{
            System.out.println("시동이 꺼져 있습니다.");
        }
    }

    /*설명. 시동 걸린 경우에만 작동*/
    public void turnOff() {
        if(isOn){
            if(speed!=0){
                System.out.println("달리는 중이라 끌 수 없습니다.");
            }else{
                System.out.println("시동을 끕니다.");
            }
        }else{
            System.out.println("이미 시동이 꺼져 있습니다.");
        }
    }

    /*설명. 시동 안걸린 경우에만 작동*/
    public void startUp() {
        if(isOn){
            System.out.println("이미 시동 걸림.");
            return;
        }
        isOn = true;
        System.out.println("시동을 걸었습니다.");
    }
}
