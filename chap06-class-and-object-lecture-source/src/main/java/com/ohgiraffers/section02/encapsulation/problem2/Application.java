package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {

    public static void main(String[] args) {
        /* 수업목표. 필드 값 수정 시 발생할 수 있는 문제점을 이해할 수 있다. */
//        Monster monster1= new Monster();
//        monster1.name="드라큘라";
//        monster1.hp=200;
//
//        System.out.println("monster1 name: "+ monster1.name);
//        System.out.println("monster1 hp: "+ monster1.hp);
        /*필기.
            * 단일 책임의 원칙
                * 수정이 발생했을 때 해당 클래스를 제외한 다른 클래스에 수정이 일어나면 안됨.
                * 유지보수를 위함
            * */
        Monster monster2 = new Monster();
        monster2.setInfo1("프랑케슈타임");
        monster2.setInfo2(200);
    }
    /*설명. 아직 메인에서 다른 클래스의 필드를 접근할 수 있는 문제 있음*/
}
