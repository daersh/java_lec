package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        /*수업목표. 배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다. */
        /*필기.
            *  얕은 복사 vs 깊은 복사
                * 1. 얕은복사(shallow-copy): stack 주소만 복사
                    * 원본에 대한 사본 만들지 않음. 주소를 복사하였기 때문에 값 변경하면 원본도 변경
                * 2. 깊은복사(deep-copy): heap의 배열에 저장된 값을 복사
                    * 원본에 대한 사본을 만드는 것. 힙의 데이터를 복사하였기 때문에 값 변경해도 원본은 그대로
        * */
        int[] originArr={1,2,3};
        int[] copyArr= originArr;                                      // 설명. 얕은 복사
        System.out.println("copyArr = " + Arrays.toString(copyArr));
        copyArr[1]=0;
        System.out.println("copyArr = " + Arrays.toString(originArr)); // 설명. 사본을 바꾸면 원본도 바뀜
    }
}
