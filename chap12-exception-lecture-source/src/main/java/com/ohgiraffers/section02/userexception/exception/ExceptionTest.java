package com.ohgiraffers.section02.userexception.exception;

import com.ohgiraffers.section02.userexception.exception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.exception.PriceNegativeException;

import java.io.IOException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws PriceNegativeException,MoneyNegativeException, NotEnoughMoneyException {
        /*설명. throw 통한 예외 발생 시 바로 메소드를 호출한 곳으로 예외 인스턴스와 함께 반환된다.*/
        if(price<0){
            throw new PriceNegativeException("상품 가격이 음수일 수 없습니다.");
        }
        if(money<0){
            throw  new MoneyNegativeException("가지고 있는 돈이 음수일 수 없습니다.");
        }
        if(money<price){
            throw new NotEnoughMoneyException("가진 돈 보다 상품 가격이 더 비쌉니다.");
        }

        //참고. 예외가 없다면 실행. 예외 발생시 바로 메서드 탈출하고 여기 출력 안됨
        System.out.println("가진 돈이 충분하시군요 고객님! 행복한 쇼핑 되세요~!");
    }
}
