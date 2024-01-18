package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass {
    /*설명 0. 부모 메서드의 이름,반환형,매개변수,접근제어자 모두 동일하게 하면 오버라이딩 성립*/
//    @Override
//    public void method(int num){}

    /* 설명 1. 메서드 이름 변경(error) */
//    @Override
//    public void method1(int num){}

    /*설명 2. 메서드 리턴 타입 변경(error)*/
//    @Override
//    public int method(int num){return  1;}
    /*설명 3. 메서드 매개변수 변경(error)*/
//    @Override
//    public void method1(int num1,int num2){}
    /*설명 4.참고.경우에 따라 반환형을 달리 할 수 있다. */
    @Override
    public String method2(int num) {return  null;} // 참고. 부모 반환이 Object라 더 작은 범위인 String 가능
    /*설명 5. priavte 메서드 (error)*/
//    @Override
//    private void privateMethode(){}       // 불가능
    /*설명 6. final 메서드(error)*/
//    @Override
//    public final void finalMethod(){}   // 불가능
    /*설명 7. 부모 타입과 같은 접근제어자이거나 더 넓은 범위의 접근제어자로 오버라이딩은 가능! */
    @Override
    public void protectedMethode(){}
    // 필기. public > protected > default > private
    //  default: 같은 패키지 안에 있는 곳에서 가능 (자식 오버라이드 메서드에 public, protected, default 가능)
    //  protected: 다른 클래스라도 자식이면 가능 (자식 오버라이드 메서드에 public, protected 가능)
    //  private: 불가능
}
