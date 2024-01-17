package com.ohgiraffers.section08.object_array;



public class Application {

    public static void main(String[] args) {
        /* 수업목표.
                                 ** 목표 **
            ----------------------------------------------------
                        * 객체 배열에 대해 이해할 수 있다. *
            ----------------------------------------------------*/
        /*설명. 배열 사용하지 않은 경우*/
        Car car1 = new Car("뻬라리",300);
        Car car2 = new Car("람볼기니",510);
        Car car3 = new Car("롤스로이스",250);
        Car car4 = new Car("부가티",400);
        Car car5 = new Car("포터",500);
        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();

        /*설명. 배열을 사용하는 경우*/
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        Car []car = new Car[5];
        car[0]= new Car("뻬라리",300);
        car[1]= new Car("람볼기니",510);
        car[2]= new Car("롤스로이스",250);
        car[3]= new Car("부가티",400);
        car[4]= new Car("포터",500);
        for (int i = 0; i < car.length; i++) {
            car[i].driveMaxSpeed();
        }
    }
}
