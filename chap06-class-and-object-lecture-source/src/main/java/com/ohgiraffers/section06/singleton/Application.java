package com.ohgiraffers.section06.singleton;

import java.util.Calendar;

public class Application {
    public static void main(String[] args) {
    /* 수업목표.
                                                         ** 목표 **
                                    ----------------------------------------------------
                                         * Singleton 패턴에 대해 이해하고 구현할 수 있다. *
                                    ----------------------------------------------------*/
    /* 필기.
                                                 ** Singleton Pattern **
        --------------------------------------------------------------------------------------------------------
            * 정의
                * 애플리케이션이 시작될 때 어떤 클래스가 최초 한번만 메모리에 할당되고 그 메모리에 인스턴스가 하나만 생성되어 공유하는 것
            * 장점
                * 1. 첫번째 이용 시, 인스턴스를 생성하므로 속도 차이가 없지만 두번째 이용 시 인스턴스 생성 시간이 없고 바로 사용가능(재사용)
                * 2. 인스턴스가 절대적으로 한 개만 추구하는 것을 보증할 수 있다.
            * 단점
                * 1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아짐
                * 2. 동시성 문제를 고려해서 설계해야함
            * 구현 방법
                * 1. 이른 초기화(Eager Initialization)
                * 2. 늦은 초기화(Lazy  Initialization)
        --------------------------------------------------------------------------------------------------------*/
        EagerSingleton eager1 =EagerSingleton.getInstance();
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar.toString(): "+calendar.toString());

    }
}
