package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

/**
 * 목표<br><br>
 * 사용자 정의의 예외클래스 정의 후 발생한 사용자 정의의 예외를 처리할 수 있다. <br>
 */
public class Application1 {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();

        try {
//            exceptionTest.checkEnoughMoney(-30000,50000); //PriceNegativeException
//            exceptionTest.checkEnoughMoney(30000,-50000); //MoneyNegativeException
            exceptionTest.checkEnoughMoney(3,4); //NotEnoughMoneyException

        } catch (PriceNegativeException | MoneyNegativeException e) { //참고. 이렇게도 가능. 출력은 상황에 맞는 e 받음
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){  //중요.이게 catch 중 최상단으로 가면 다형성에 의해 모든게 여기에 처리됨.
                                // 이게 맨 위로 가면 아래 catch 들이 실행 안된다고 err 보여줌
            System.out.println(e.getMessage());
        }

    }
}
