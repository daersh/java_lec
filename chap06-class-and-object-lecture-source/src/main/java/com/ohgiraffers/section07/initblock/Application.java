package com.ohgiraffers.section07.initblock;

public class Application {
    /* 수업목표.
                                 ** 목표 **
        ----------------------------------------------------------
          * 초기화 블럭의 동작 순서를 이해하고 활용하여 인스턴스 생성할 수 있다.
        ----------------------------------------------------------*/
    public static void main(String[] args) {

        Product product1 = new Product();
        Product product2 = new Product("바나나");
        System.out.println("product1 = " + product1.name+ ' '+ product1.brand);
        System.out.println(product1.toString());

        System.out.println("product2 = " + product2.name+ ' '+ product2.brand);
        System.out.println(product2.toString());
    }
}
