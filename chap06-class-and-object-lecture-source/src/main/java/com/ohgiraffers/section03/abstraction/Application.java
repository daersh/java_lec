package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*수업목표. 객체지향 프로그래밍에 대해 이해하고 객체와 클래스를 설계하여 프로그래밍 할 수 있다.*/

        /*필기.
            * 추상화란?
                * 공통 부분 추출하고 공통되지 않고 불필요한 부분을 제거한다는 의미.
                * 유연성을 확보하기 위한 것이다.
                * 유연성 확보는 여러 곳에 적용가능한 유연한 객체로 재사용성이 높아질 수 있게 한다는 것.
        * */

        /*설명.
            * 프로그램 개요
            * 카레이서가 자동차를 운전하는 프로그램
            *
            * 시스템 요구사항
            * 1. 카레이서는 시동걸기, 엑셀레이터 밟기, 브레이크 밟기, 시동끄기를 할 수 있다.
            * 2. 자동차는 시동걸기, 앞으로 가기, 멈추기, 시동끄기를 할 수 있다.
            * 3. 자동차는 처음에 멈춤 상태로 대기하고 있다.
            * 4. 카레이서는 먼저 자동차에 시동을 걸고 이미 걸렸으면 다시 못 건다
            * 5. 카레이서가 엑셀레이터를 밟으면 시동이 걸린 상태면 시속 10km/h 증가하며 앞으로 나간다.
            * 6. 자동차는 달리는 중인 경우 브레이크를 밟으면 자동차 시속은 바로 9km/h로 떨어지며 멈춘다.
            * 7. 브레이크를 밟을 때 자동차가 달리는 중이 아니면 이미 멈춰있는 상태라고 안내한다.
            * 8. 카레이서가 시동을 끄면 더 이상 자동차는 움직이지 않는다.
            * 9. 자동차가 달리는 중이라면 시동을 끌 수 없다.
        * */

        /*설명. 카레이서 한명 생성*/
        CarRacer racer = new CarRacer();
        Scanner sc = new Scanner(System.in);


        int input;
        /*메뉴 출력*/
        while (true){
            System.out.println("====== 카레이싱 프로그램 ======");
            System.out.println("1. 시동걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동끄기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택: ");
            input= sc.nextInt();

            switch (input){
                case 1:
                    racer.startUp();
                    continue;
                case 2:
                    racer.stepAccelator();
                    continue;
                case 3:
                    racer.stepBreak();
                    continue;
                case 4:
                    racer.turnOff();
                    continue;
                case 9:
                    System.out.println("종료합니다.");
                    break;
            }
            if(input==9) break;

        }


    }

}
