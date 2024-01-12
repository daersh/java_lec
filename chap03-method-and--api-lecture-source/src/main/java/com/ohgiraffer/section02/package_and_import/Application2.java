package com.ohgiraffer.section02.package_and_import;


import com.ohgiraffer.section01.method.Calculator;

public class Application2 {
    public static void main(String[] args) {
        /*목차. 1. non-static method*/
        Calculator calculator =new Calculator(10,20);
        System.out.println("min(10,20) = "+ calculator.minResult());
        /*목차. 2. static method*/
        System.out.println("min(10,20) = "+ Calculator.minResult(20,10));

    }
}
