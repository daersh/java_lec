package com.ohgiraffer.section02.package_and_import;



public class Application1 {
    public static void main(String[] args) {
        /*수업목표. 패키지에 대해 이해할 수 있다,*/
        /*목차. 1. non-static 호출*/
        com.ohgiraffer.section01.method.Calculator cal = new com.ohgiraffer.section01.method.Calculator(100,20);
        System.out.println("100 + 20"+cal.plusTwoNum());
        /*목차. 2. static 호출*/
        System.out.println("두 수중 큰 값"+ Cal.maxResult());
    }
}
