package com.ohgiraffers.section03.grammer;

public enum UserRole1 {
    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN;

    /**필기<br>
        * 생성자를 가질 수 있지만 외부에서 사용하지 못하도록(싱글톤 패넌 ) default 또는 priate 접근 제어자만 사용 가능하다. enum타입은 고정된 상수들의 집합이며 한번 할당된 객체는 변하지 않는다.
    * */
    /*public*/ UserRole1() { // default, private 만 가능하다.
        System.out.println("기본 생성자 호출 확인");
    }

    /**
     *  필드명 소문자 반환 메서드 추가
     *  */
    public String getNameToLowerCase(){

        return this.name().toLowerCase();
    }

}
