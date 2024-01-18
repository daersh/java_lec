package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal{
    public Tiger() {
        System.out.println("알고 보니 호랑이군요..");
    }

    @Override
    public void eat(){
        System.out.println("냠~");
    }
    @Override
    public void run(){
        System.out.println("어슬렁~ 어슬렁~");
    }
    @Override
    public void cry(){
        System.out.println("어흥~");
    }
    public void bite(){
        System.out.println("왕~");
    }

    @Override
    public void callAll(){
        super.callAll();
        bite();
    }

}
