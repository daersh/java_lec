package com.ohgiraffers.section02.extend.Animal;

public class RabbitFarm<T extends  Rabbit> { //설명: Rabbit을 상속받는 T -> Rabbit, DrunkenBunny, Bunny 만 받을 수 있다!
    private  T animal;
    /**
     * 생성자
     * */
    public RabbitFarm() {}
    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    /**
     * Getter, Setter 지정
     * */
    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
