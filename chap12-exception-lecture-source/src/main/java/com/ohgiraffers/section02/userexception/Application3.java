package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

/**
 * 목표<br><br>
 * multi-catch 구문을 이해하고 활용할 수 있다. <br><br>
 * @printStackTrace(): 예외클래스, 예외발생 경로, 예외 메시지 등을 stack 호출 역순으로 빨간 글씨의 로그 형태로 나타내주는 기능이다.
 * @catch블록처리순서: catch블록이 많을 때는 위에서 아래로 예외를 확인하게 되며 부모 타입에 해당하는 예외처리는 아래쪽으로 작성해야한다.
 */
public class Application3 {

    public static void main(String[] args) {
        ExceptionTest2 exceptionTest2 =new ExceptionTest2();
        try {
            exceptionTest2.checkEnoughMoney(-20000,50000);
        } catch (PriceNegativeException | MoneyNegativeException e) {
            System.out.println("음수를 발견했습니다.");
            e.printStackTrace();
        } catch (NotEnoughMoneyException e) {
            System.out.println("논리가 안맞습니다. "+ e.getMessage());
        }finally {
            System.out.println("finally는 반드시 실행된다.");
        }
        System.out.println("program exit(0)");
    }
}
