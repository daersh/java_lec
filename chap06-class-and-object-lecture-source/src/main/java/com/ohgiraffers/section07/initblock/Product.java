package com.ohgiraffers.section07.initblock;

public class Product {
    public String name="moto";                // 상품명
    public int price;                  // 상품가격
    public static String brand;            // 제조사

    /*설명. 생성자를 통한 객체 생성 전에 알고리즘을 적용해야 할 일이 있다면 초기화 블록으로 할 수 있다.!!*/
    // 설명. 순서. 2 번째 실행
    {                                                           // 참고. 매서드가 호출되면 먼저 시작함
        System.out.println("Product.Init_non_static start...");
        name = "cyon";
        brand = "HELLG";
    }
    // 설명. 순서. 1 번쨰 실행
    static { //설명. static 초기화 블록은 static 변수만 초기화 가능. 다른 초기화 블록보다 먼저 실행.
        System.out.println("Product.Init_static start...");
        //name= "a"; non-static 안됨
        brand= "LG";
    }
    public Product() {
        System.out.println("Product.Product() start...");
        name= "apple";
    }
    public Product(String name) {
        this.name = name;
        System.out.println("1 product parmeter created...");

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand=" + Product.brand +
                '}';
    }
}
