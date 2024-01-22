package com.ohgiraffers.section01.generic;


/**
 * 제네릭 클래스의 다이아몬드 연산자(<>) 안에는 4가지 타입을 지정할 수 있다.
 * @1. E: Element
 * @2. T: Type
 * @3. K: Key
 * @4. V: Value
 */
public class GenericTest<T>{ // T: type  E: 변수? 일반적으로 T 씀

    /**
     * 필드 및 메소드의 매개변수와 반환형의 자료형(type)은 현재 정해져 있지 않은 상태 <br>
     * 객체를 생성하는 시점에 타입이 지정됨!
     */
    private T value;
    public T getValue() {return value;}
    public void setValue(T value) {this.value = value;}


}
