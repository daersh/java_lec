package com.ohgiraffers.section01.list.run;


import java.util.Stack;

/**
 * 목표<br><br>
 * Stack 에 대해 이해하고 사용할 수 있다. <br><br>
 * @stack: 후입선출 또는 선입후출 구조의 자료구조이다. push(), pop(), peek()등 메서들르 활용하여 자료를 처리할 수 있다. Vector를 상속하는 클래스이다.
 */
public class Application4 {
    /**
     * Method
     * @1.push(): 해당 스택의 최상단에 값 추가
     * @2.peek(): 해당 스택의 최상단(top)에 있는 요소 반환
     * @3.search(): 해당 요소와 일치하는 요소의 위치를 최상단에서부터 몇 번째인지 반환
     * @4.pop(): 해당 스택의 최상단에 있는 요소 반환 후 제거
     * @5.get(): 스택의 인덱스와 일치하는 요소의 값을 출력
     * */
    public static void main(String[] args) {
        /*목차 1. stack 호출*/
        Stack<Integer> integerStack = new Stack<>();
        /*목차 2. 인스턴스 생성 push*/
        init(integerStack);

        System.out.println(integerStack);
        /*목차 3. 스택에 담긴 최상단 값 출력*/
        System.out.println(integerStack.peek());
        /*목차 4. 스택의 최상단 제거 .pop()*/
        stackPop(integerStack);
        /*목차 5. 인덱스에 있는 값 출력 .get(index)*/
        stackPrint(integerStack);

        /*목차 6. 찾고자 하는 값과 일치한는 위치를 최상단 기준으로 몇번쨰인지 출력*/
        System.out.println(integerStack.search(1));
    }

    private static void stackPrint(Stack<Integer> integerStack) {
        init(integerStack);
        System.out.println(integerStack.get(0));
        System.out.println(integerStack.get(1));
        System.out.println(integerStack.get(2));
        System.out.println(integerStack.get(3));
        System.out.println(integerStack.get(4));
    }

    private static void stackPop(Stack<Integer> integerStack) {
        integerStack.pop();
        System.out.println(integerStack);
        integerStack.pop();
        System.out.println(integerStack);
        integerStack.pop();
        System.out.println(integerStack);
        integerStack.pop();
        System.out.println(integerStack);
        integerStack.pop();
        System.out.println(integerStack);
    }

    private static void init(Stack<Integer> integerStack) {
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
    }
}
