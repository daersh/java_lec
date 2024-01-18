package com.ohgiraffers.section01.polymorphism;

public class Application4 {
    public static void main(String[] args) {
        /* 수업목표.
                                 ** 목표 **
            ----------------------------------------------------
                  * 다형성을 적용하여 리턴타입에 활용할 수 있다. *
            ----------------------------------------------------*/

        Application4 app4 = new Application4();
        Animal randomAnimal = app4.getRandomAnimal();
        randomAnimal.callAll();
    }

    private Animal getRandomAnimal() {
        int random = (int)(Math.random()*2);
        if(random==0) return new Tiger();
        return new Rabbit();
    }
}
