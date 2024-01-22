package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.Animal.*;

/**
 * 목표<br><br>
* 제너릭 extends 키워드를 사용하여 특정 타입만 제네릭 타입으로 사용하도록 제한할 수 있다. <br>
 */
public class Application1 {
    public static void main(String[] args) {
        //RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>(); // 설명 err1 - Rabbit 이하만 사용 가능
        //RabbitFarm<Snake> farm1 = new RabbitFarm<Snake>();   // 설명 err2 - Rabbit 이하만 사용 가능
        //RabbitFarm<Mammal> farm1 = new RabbitFarm<Mammal>(); // 설명 err3 - Rabbit 이하만 사용 가능

        // 설명. Rabbit, 그의 자식 타입만 인스턴스로 생성 가능
        // 설명. 각 토끼 농장에 토끼,버니,술취한 버니 객체를 넣어 울도록 함.
        RabbitFarm<Rabbit> farm1 = new RabbitFarm<Rabbit>();
        RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();

        farm1.setAnimal(new Rabbit());
        farm2.setAnimal(new Bunny());
        farm3.setAnimal(new DrunkenBunny());

        farm1.getAnimal().cry();
        farm2.getAnimal().cry();
        farm3.getAnimal().cry();

        farm1.setAnimal(new Bunny()); // 참고. 동적 바인딩에 의해 반환형의 Rabbit의 cry가 아닌 Bunny의 cry()가 실행됨
        farm1.getAnimal().cry();
//        farm2.setAnimal(new DrunkenBunny());  //이건 안됨?!

    }

}
