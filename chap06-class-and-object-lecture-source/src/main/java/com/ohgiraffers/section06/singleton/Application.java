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
                * 1. 이른 초기화(Eager Initialization) : instance 생성과 동시에 초기화
                * 2. 늦은 초기화(Lazy  Initialization) : instance가 처음 호출 될 때 초기화
        --------------------------------------------------------------------------------------------------------
                                               ** 이른 초기화 vs 늦은 초기화 **
        --------------------------------------------------------------------------------------------------------
                * 이른 초기화: 클래스를 로드하는 속도(처음 앱 켜질 때)가 느려지지만 이후 요청에서 속도가 빠르다.
                * 늦은 초기화: 로드는 빠르지만 첫 번째 요청의 속도가 느리다.
        --------------------------------------------------------------------------------------------------------*/

        EagerSingleton eager1 =EagerSingleton.getInstance();
        EagerSingleton eager2 =EagerSingleton.getInstance();
        System.out.println("eager1 hashcode: "+eager1.hashCode());
        System.out.println("eager2 hashcode: "+eager2.hashCode());
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        System.out.println("lazy1 hashcode: "+ lazy1.hashCode());
        System.out.println("lazy2 hashcode: "+ lazy2.hashCode());
        // 설명. 같은 인스턴스를 받기 때문에 주소를 확인하면 모두 같다.

    }
}
