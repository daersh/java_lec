package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal{
    public Rabbit() {
        System.out.println("알고 보니 토끼군요..");
    }

    @Override
    public void eat(){
        System.out.println("쩝쩝~");
    }
    @Override
    public void run(){
        System.out.println("찹찹");
    }
    @Override
    public void cry(){
        System.out.println("끾끾");
    }
    public void jump(){
        System.out.println("폴짝");
    }

    @Override
    public void callAll(){
        super.callAll();
        jump();
    }

}

