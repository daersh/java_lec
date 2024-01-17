package com.ohgiraffers.section03.abstraction;

public class CarRacer {
    Car myCar = new Car();

    public void startUp() {
        myCar.startUp();
    }

    public void stepAccelator() {
        myCar.go();
    }

    public void stepBreak() {
        myCar.stop();
    }

    public void turnOff() {
        myCar.turnOff();
    }
}
