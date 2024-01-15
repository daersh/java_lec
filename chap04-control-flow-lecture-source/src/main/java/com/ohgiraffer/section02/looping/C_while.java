package com.ohgiraffer.section02.looping;

import java.util.Scanner;

public class C_while {


    public void testSimpleWhileStatement() {
        /*수업목표. while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.*/
        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
    }

    public void testWhileExample() {
        /*수업목표. 사용자가 'y'라고 입력할 때 까지 반복해서 확인하는 예제를 이해할 수 있다.*/
        Scanner scanner= new Scanner(System.in);
        char ans='\u0000';
        while (ans!='y' && ans!='Y'){
            ans=scanner.next().charAt(0);
        }
    }
}
