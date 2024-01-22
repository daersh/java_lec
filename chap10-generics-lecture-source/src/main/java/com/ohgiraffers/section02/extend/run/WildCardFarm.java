package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.Animal.Bunny;
import com.ohgiraffers.section02.extend.Animal.RabbitFarm;


/** <b>와일드카드(wildcard)</b><br><br>
 * 제네릭 클래스 타입의 객체를 메소드의 매개 변수로 받을 때 타입 면수를 제한할 수 있다.<br><br>
 * @list
 * @1.<?>: 제한이 없다.
 * @2.<?-extends-type>: 와일드카드의 상한 제한(type과 type의 후손을 이용해 생성된 제네릭 인스턴스만 가능하다.)
 * @3.<?super-Type>: 와일드카드의 하한 제한(Type과 Type의 부모를 이용해 생성된 제네릭 인스턴스만 가능하다.)
 * */
public class WildCardFarm {

    /** 1. 어떤 타입의 RabbitFarm(generic type)이 와도 상관 없다. */
    public void anyType(RabbitFarm<?> farm){
        farm.getAnimal().cry();
    }

    /**2. RabbitFarm 중에서 Bunny or Bunny 하위 타입이 있는 RabbitFarm만 가능하다. Bunny 제너릭의 농장만 가능하다.*/
    public void extendsType(RabbitFarm<? extends Bunny> farm){
        farm.getAnimal().cry();
    }

    /**3. RabbitFarm 중에서 Bunny 상위 타입이 있는 RabbitFarm만 가능하다.
    Bunny,Rabbit 제너릭의 농장만 가능하다.*/
    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }

}
