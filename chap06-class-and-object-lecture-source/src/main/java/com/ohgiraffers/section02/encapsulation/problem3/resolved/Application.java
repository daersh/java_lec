package com.ohgiraffers.section02.encapsulation.problem3.resolved;

public class Application {

    public static void main(String[] args) {
        /*수업목표. 접근제어자와 캡슐화에 대해 이해하고 직접 필드 접근을 막는 이유를 이해할 수 있다.*/
        /*설명. 캡슐화를 통해 직접적으로 접근을 막음!*/
        Monster monster1 = new Monster();
        monster1.name = "드라큘라";
        monster1.hp = 200;



    }
}
