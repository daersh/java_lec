package com.ohgiraffers.section01.array;

public class Application2 {
    public static void main(String[] args) {
        /*수업목표. 배열의 사용 방법을 익혀 배열을 사용할 수 있다.*/
        /*필기.
            * 배열의 사용 방법
                * 1. 배열의 선언
                * 2. 배열의 할당
                * 3. 배열으 ㅣ인덱스 공간에 값 대입
        * */
        int[] iArr;
//        char cArr[];                                              // 참고.1 뒤로 붙이는 것은 권장하지 않음
//        iArr = new int[];                                         // 참고.2 배열은 반드시 크기를 할당해야한다.
        iArr = new int[10];

        char[] cArr = new char[5];
        /*필기. 참조자료형 변수 출력 = 자료형@16진수주소값*/
        System.out.println("iArr = " + iArr);
        System.out.println("cArr = " + cArr);
        /*필기. 해시코드를 통해 10진수 주소값 확인 가능*/
        System.out.println("iArr = " + iArr.hashCode());            //참고. 이 4가지 방식으로 하면 주소값만 나옴
        System.out.println("cArr = " + cArr.hashCode());
        cArr = null;
//        System.out.println("null을 참조할 시: " + cArr.hashCode());  //참고. 저장된 해시값이 없기 때문에 에러 발생
    }
}
