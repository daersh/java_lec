package com.ohgiraffers.section01.exception;

/**
 * 목표<br><br>
 * 예외에 대해 이해하고 이를 처리하기 위한 문법을 활용할 수 있다. <br><br>
 *
 * @throws:
 * @try: try-catch 구문을 통해 프로그램이 종료되지 않게 처리할 수 있다.
 *      <br>try 안에서 에러 터진 이후 코드는 실행하지 않고 바로 catch 로 이동한다.
 */
public class Application1 {
    public static void main(String[] args) {

        ExceptionTest exceptionTest = new ExceptionTest();
        //설명. try-catch 구문을 통해 프로그램이 종료되지 않게 처리할 수 있다.
        try {
            /*필기.
               * catch 구문으로 처리할 예외가 발생하는 부분을 try 구문으로 묶을 수 있다.(묶을 범위는 적당히 할 것(관련 있는 것만))
            *  */
            exceptionTest.checkEnoughMoney(10000,50000);
            exceptionTest.checkEnoughMoney(10000,5000);     //참고. err 발생
            // 설명. 생략~~~~
            System.out.println("에러가 두번째 줄에서 발생하여 여기 이후는 안나온다"); //참고. err 이후 코드는 생략되고 catch로 이동
            exceptionTest.checkEnoughMoney(10000,50000);
        }catch (Exception e){
            /* 필기.
                * try 구문에서 발생한 예외를 처리하기 위한 구문으로 우리가 원하는 방식으로
                * 예외 상황에 대해 처리할 수 있다.(단순 출력 또는 예외 타입에서 제공하는 메소드를 활용한 처리 모두 가능)
                * catch 구문에 아무런 처리 구문을 작성하지않으면 예외 발생 유무를 알 수 없기 때문에 간단한 처리라도 적어야 한다.
            * */
//            System.out.println("돈 좀 넉넉하게 들고 다니자");
//            System.out.println(e.getClass());
            System.out.println("예외 발생 시 메시지 확인: " +e.getMessage()); // 참고. new Exception("호주머니 사정이 딱하시군요")

            /*설명. try에서 발생한 예외 타입을 받아서 jvm이 처리해주는 방식으로 처리할 수 있다.*/
            e.printStackTrace();    //참고. jvm 방식처럼 에러 출력해줌. 종료는 안시킴.
//            System.exit(0);  //참고. 바로 종료시킴
        }// 원하는 방식으로 예외처리 하면서 프로그램 계속 실행함.


        System.out.println("exit(0)");
    }
}
