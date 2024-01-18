package com.ohgiraffers.section01.polymorphism;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표.
                                 ** 목표 **
            ----------------------------------------------------
                  * 다형성과 타입 형변환에 대해 이해할 수 있다. *
            ----------------------------------------------------*/

        Animal animal = new Animal();
        animal.callAll();
        System.out.println();
        Tiger tiger = new Tiger();
        tiger.callAll();
        System.out.println();
        Rabbit rabbit= new Rabbit();
        rabbit.callAll();
        System.out.println();
        Animal animal1 = new Tiger();
        tiger.callAll();
        System.out.println();

        /*설명. 다형성 적용(부모 타입으로 자식 인스턴스의 주소값 저장)*/
        Animal an1 = new Tiger();       // 설명. 다형성 적용 O
        Animal an2 = new Rabbit();      // 설명. 다형성 적용 O
        Animal an3 = new Animal();      // 설명. 다형성 적용 X

        /*설명. Animal은 Tiger, Rabbit이 아니다.(Animal은 tiger, rabbit 타입을 지니지 않음)*/
//        Tiger tiger1 = new Animal();          // err
//        Rabbit rabbit1 = new Animal();        // err

        /*설명. 동적바인딩 확인*/
        /* 필기.
            * 컴파일 당시에는 해당 타입의 메서드와 연결되어 있다가,
            * 런타임 당시 실제 객체가 가진 오버라이딩 된 메서드로 바인딩이 바뀌어 동작하는 것을 의미
            * 동적 바인딩 조건
                * 1. 상속
                * 2. 오버라이딩
        * */
        System.out.println("동적 바인딩 확인 ============");
        an1.cry();
//        an1.bite();
        an2.cry();
        /*설명. 오버라이딩 되지 않은 (추가한 메서드) 메서드 호출은 다운캐스팅 해줘야함.*/
        /*필기.
            * instanceof
                * 해당 객체의 타입을 런타임 시점에 확인하기 위한 연산자
        * */
        if(an1 instanceof Tiger) ((Tiger)an1).bite(); // 인스터스 검사
        if(an1 instanceof Rabbit) ((Rabbit)an1).jump(); //이프문 안하면 런타임 에러 발생

        /*설명. 다형성은 상속관계의 객체들간에 형변환*/
        Animal animal2 = new Tiger(); //참고.자동형변환(auto up-casting), 다형성, 묵시적형변환
        Rabbit rabbit2 = (Rabbit)an2; //참고.강제형변환(down-casting), 다형성 X, 명시적형변환

    }
}
