package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{

    private String cpu;                 //설명. 연산장치
    private int hdd;                    //설명. 하드
    private int ram;                    //설명. 램
    private String operationSystem;     //설명. 운영체제

    public Computer() {
        //super();                      // 참고. 안적어도 항상 들어가 있음
        System.out.println("Computer 클래스의 기본 생성자 호출함...");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        // super();                     // 참고. 안적어도 항상 들어가 있음.
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 모든 필드를 초기화 하는 생성자 호출함...");
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);  //참고. 부모 필드 초기화!
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 모든 필드와 부모 필드까지 초기화 하는 생성자 호출함...");
    }
    
    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operationSystem='" + operationSystem + '\'' +
                "} " + super.toString();
    }

}
