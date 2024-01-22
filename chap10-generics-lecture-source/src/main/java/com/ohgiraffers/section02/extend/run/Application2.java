package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.Animal.Bunny;
import com.ohgiraffers.section02.extend.Animal.DrunkenBunny;
import com.ohgiraffers.section02.extend.Animal.Rabbit;
import com.ohgiraffers.section02.extend.Animal.RabbitFarm;

/**
 * 목표<br><br>
 * 와일드카드에 대해 이해할 수 있다.
 */
public class Application2 {
    public static void main(String[] args) {
        WildCardFarm wildCardFarm = new WildCardFarm();
        wildCardFarm.anyType(new RabbitFarm<Rabbit>());
        wildCardFarm.anyType(new RabbitFarm<Bunny>());
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>());

        //wildCardFarm.extendsType(new RabbitFarm<Rabbit>());       //참고. err
        wildCardFarm.extendsType(new RabbitFarm<Bunny>());
        //wildCardFarm.extendsType(new RabbitFarm<DrunkenBunny>()); //참고. err

        wildCardFarm.superType(new RabbitFarm<Rabbit>());
        wildCardFarm.superType(new RabbitFarm<Bunny>());
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>()); // 참고 err

    }
}
