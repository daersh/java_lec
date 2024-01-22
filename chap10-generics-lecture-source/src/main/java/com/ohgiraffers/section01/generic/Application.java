package com.ohgiraffers.section01.generic;


/**
 * 목표<br><br>
 *  generic 에 대해 이해할 수 있다.<br>
 */
public class Application {
    /**
     * Generic 클래스는 <b>다양한 자료형으로 변할 수 있어</b> 클래스 하나만으로 활용 가치를 높일 수 있다.<b>(구현의 편리성)</b><br>
     * <b>매개변수나 반환형도 제네릭 타입으로 지정</b>되어 명확히 해당 타입에 대해 처리할 수 있다. <b>(타입의 안정성)</b>
     */
    public static void main(String[] args) {
        GenericTest<Integer> genericTest1 = new GenericTest<Integer>();
        GenericTest<String> genericTest2 = new GenericTest<>(); //참고. 오른쪽 <>안에는 생략해도 된다.

        genericTest1.setValue(1);                                //설명. auto-boxing에 의한 값 전달 가능
        genericTest1.setValue((int)'a');
        System.out.println("genericTest1.getValue() = " + genericTest1.getValue());
        System.out.println(genericTest1.getValue() instanceof Integer); //설명. 해당 객체가 Integer 타입인지 확인

        genericTest2.setValue("피카츄");
        System.out.println(genericTest2.getValue());
        System.out.println(genericTest2.getValue() instanceof  String);
    }
}
