package com.ohgiraffers.section02.encapsulation.problem3.resolved;

public class Application {

    public static void main(String[] args) {
        /*수업목표. 접근제어자와 캡슐화에 대해 이해하고 직접 필드 접근을 막는 이유를 이해할 수 있다.*/
        /*설명. 캡슐화를 통해 직접적으로 접근을 막고 메소드를 통해 간접적으로 접근!!*/
        Monster monster1 = new Monster();
//        monster1.name = "드라큘라";
//        monster1.hp = 200;
        monster1.setInfo1("드라큘라");
        monster1.setInfo2(1000);

        /*설명.
            * 캡슐화(encapsulation)란?
                * 유지보수를 증가시키기 위해 필드 직접 접근을 제한하고
                * public 메소드를 이용하여 간접적으로 접근하여 사용할 수 있도록 만든 기술
                * 클래스 작성 시 특별 목적이 없다면 캡슐화를 기본 원칙으로 한다.
            * 정보 은닉 - 숨길수록 결합도가 낮아지는 효과 있음 -> 유지보수 쉬워짐
                * 1. 필드, 메소드 은닉
                * 2. 타입 은닉
                * 3. 구현 은닉
        * */


    }
}
