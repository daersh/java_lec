package com.ohgiraffers.section01.polymorphism;

public class Application {
    public static void main(String[] args) {
        /* 수업목표.
                                 ** 목표 **
            ----------------------------------------------------
                  * 다형성과 타입 형변환에 대해 이해할 수 있다. *
            ----------------------------------------------------*/

        Animal animal = new Animal();
        animal.callAll();
        System.out.println();
        Tiger tiger = new Tiger();
        tiger.callAll();
        System.out.println();
        Rabbit rabbit= new Rabbit();
        rabbit.callAll();
        System.out.println();
        Animal animal1 = new Tiger();
        tiger.callAll();
        System.out.println();
    }
}
