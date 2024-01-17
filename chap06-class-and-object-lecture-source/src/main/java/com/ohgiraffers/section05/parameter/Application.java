package com.ohgiraffers.section05.parameter;

import java.awt.image.renderable.ParameterBlock;
import java.util.Arrays;

public class Application {
    public static void main(String... args) { //참고. 여기에도 ... 붙여 가변적으로 만들 수 있다.

        /* 수업목표.
                                 ** 목표 **
            ----------------------------------------------------
                * 메소드의 파라미터에 대해 이해하고 사용할 수 있다.
            ----------------------------------------------------*/

        /* 필기.
                        ** 매개변수로 사용 가능한 자료형 **
            ----------------------------------------------------
                * 1. 기본자료형
                * 2. 기본 자료형 배열
                * 3. 클래스 자료형
                * 4. 클래스자료형 배열(객체 배열이지만 다음 챕터에 다룰 예정)
                * 5. 가변인자
            *
                        ** call-by-(value, reference) **
            ----------------------------------------------------
            * call-by-v자alue
                * 값에 의한 호출로 메소드에 이 값을 변경해도 원본은 그대로
            * call-by-reference
                * 참조 값에 의한 호출로 메소드의 값이 변경되면 원본도 바뀜
            ----------------------------------------------------*/

        ParameterTest pt = new ParameterTest();

        /*목차. 1. 기본 자료형을 매개변수로 전달 받는 메소드 호출*/
        int num = 20;
        System.out.println("매개변수로 전달 전 값 num = " + num);
        pt.testPrimitiveTypeParameter(num);  // 참고. call-by-value 값에 의한 호출
        System.out.println("매개변수로 전달 이후 값 num = " + num);

        /*목차. 2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출*/
        int[] iArr = new int[]{1,2,3,4,5};
        System.out.println("매개변수로 전달 전 배열 iArr ="+ Arrays.toString(iArr));
        pt.testPrimitiveTypeArrayParameter(iArr); // 참고. call-by-reference: 참조 값에 의한 호출
        System.out.println("매개변수로 전달 이후 배열 iArr ="+ Arrays.toString(iArr));

        /*목차. 3. 클래스 자료형을 매개변수로 전달 받는 메서드 호출*/
        Rectangle r1 = new Rectangle(12.5,22.5);

        pt.testPrimitiveClassTypeParameter(r1); // 참고. 클래스를 매개변수로 받으면 참조를 하여 값 변경됨

        /*목차. 4. 아직 클래스 배열(객체배열)은 배우지 않았으므로 pass*/
        /*목차. 5. 가변인자를 매개변수로 전달 받는 메소드 호출*/
        pt.testVariableLengthArrayParameter();
        pt.testVariableLengthArrayParameter("홍길동");
        pt.testVariableLengthArrayParameter("유관순","볼링");
        pt.testVariableLengthArrayParameter(new String[]{"강감찬","볼링","낚시","담배"});

    }
}

class Rectangle{
    /*설명. 사각형의 가로와 높이를 저장하는 필드*/
    private double width;
    private double height;
    public Rectangle(){}
    public Rectangle(double width, double height) {
        this.width=width;
        this.height=height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    //설명. 사각형의 넓이
    public void calArea(){
        System.out.println("사각형의 넓이는 "+(height*width));
    }
    //설명. 사각형의 둘레
    public void calRound(){
        System.out.println("사각형의 둘레는 "+(height*2+width*2));
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

}
