package com.ohgiraffers.section02.encapsulation.problem1;

public class Application {

    public static void main(String[] args) {

        /*수업목표. 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해할 수 있다.*/

        /*설명. 1번 몬스터 생성*/
        Monster monster1 = new Monster();
        monster1.setName("두치");
        monster1.setHp(200);
        /*설명. 몬스터 정보 출력*/
        monster1.printMonster();

        /*설명. 2번 몬스터 생성 - 문제점 확인 (hp가 -200 인데도 적용됨)*/
        Monster monster2 = new Monster("뿌꾸",-200);
        monster2.printMonster();

        /*설명. 3번 몬스터 생성 - Setter를 통한 접근*/
        Monster monster3 = new Monster("드라큘라",10);

        monster3.Heal(100);
        monster3.printMonster();

    }
}
