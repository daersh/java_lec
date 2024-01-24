package com.ohgiraffers.section01.exception;

public class ExceptionTest {


    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("가지고 있는 돈은 "+ money + "원 입니다.");
        if(price<=money){
            System.out.println(price+"원 상품을 구입하기 위한 금액이 충분합니다.");
            return;
        }

        //설명. ()안에 메시지를 넣을 수 있다.
        throw new Exception("호주머니 사정이 딱하시군요");  //참고.에러 발생시킴.이 에러는 메인의 Exception e로 보냄
    }

}
