package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class ParameterTest {
    public void testPrimitiveTypeParameter(int num) {
        System.out.println("매개변수로 전달 받은 값 num = " + num);
        num+=10; //참고. call by value이기 때문에 변경 값은 반영 안된다.
    }

    public void testPrimitiveTypeArrayParameter(int[] iArr) {
        System.out.println("매개변수로 전달 받은 값 iArr = " + Arrays.toString(iArr));
        iArr[4]=0;
    }

    public void testPrimitiveClassTypeParameter(Rectangle rectangle) {
        /*설명. 전달받은 객체의 사각형 넓이와 둘레 출력*/
        System.out.println("===== 변경 전 넓이, 둘레 =====");
        rectangle.calArea();
        rectangle.calRound();
        /*설명. 전달받은 객체의 사각형 너비와 높이 변경*/
        rectangle.setWidth(20.3);
        rectangle.setHeight(20.3);
        /*설명. 변경 후 객체의 사각형 넓이와 둘레 출력*/
        System.out.println("===== 변경 후 넓이, 둘레 =====");
        rectangle.calArea();
        rectangle.calRound();
    }


    /*참고. 가변 인자를 통한 호출*/
    public void testVariableLengthArrayParameter(String... str) {
        // 참고. ...붙여 가변적으로 가능해짐
        // 참고. 아무 값을 안넢어도 가능
        // 중요. 하지만 사용하지 말것!!!! 참고만 하자
        System.out.println(Arrays.toString(str));
    }


}
