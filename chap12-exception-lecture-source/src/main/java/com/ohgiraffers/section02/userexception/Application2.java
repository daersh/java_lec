package com.ohgiraffers.section02.userexception;

/**
 * 목표<br><br>
 * finally를 활용하여 try-catch 문 이해하고 활용할 수 있다. <br>
 */
public class Application2 {
    public static void main(String[] args) {
        ExceptionTest exceptionTest= new ExceptionTest();

        try {
            exceptionTest.checkEnoughMoney(20000,50000);
        }catch (Exception e){
            System.out.println("충분한 돈을 지녔는지 유효성 체크 결과 문제: "+ e.getMessage());
        }finally {
            /*설명. try 구문에서 예외가 발생하든 발생하지 않든 반드시 실행해야 할 부분이 있다면 작성하는 부분*/
            System.out.println("finally block 무조건 실행된다~~!!");
        }
        /*설명. */
        System.out.println("프로그램을 종료합니다.");
    }

}
