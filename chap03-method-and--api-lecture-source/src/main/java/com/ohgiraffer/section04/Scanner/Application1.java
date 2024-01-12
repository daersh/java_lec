package com.ohgiraffer.section04.Scanner;
import java.io.IOException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) throws IOException {
        /*수업목표. java.util.Scanner를 이용한 다양한 자료형 값 입력 받기*/
        // next(): 공백이나 개행 전까지 문자열 반환
        // nextlLine(): 공백이나 개행을 포함한 한 줄의 문자열 모두 반환;

        // 설명. Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        /*목차. 1. 문자열 입력받기*/
        System.out.println("name insert : ");
        String name= scanner.nextLine(); //참고. nextline(): String return
        System.out.println("name: "+name);

        /*목차. 2. 정수형 입력받기*/
        System.out.println("age insert : ");
        int age = scanner.nextInt();
        System.out.println("age: " + age);

        /*목차. 3. 실수형 입력받기*/
        System.out.println("score avg insert:");
        double score_avg = scanner.nextDouble();
        System.out.println("score_age: "+score_avg);

        /*목차. 4. 논리형 입력받기*/
        System.out.println("Are you human?(TRUE or FALSE): ");
        boolean isHuman = scanner.nextBoolean();
        System.out.println(isHuman? "Human" : "Robot" );

        //scanner.nextLine(); //참고. 중간에 남은 공백 및 개행 제거하기 위함 -> 아래 nextline()쓸 떄 발생하는 에러 제거 가능!!
        /*목차. 5. 문자형 입력받기*/
        System.out.println("sex insert(M or F): ");
        char sex = scanner.next().charAt(0);  // 참고. 세줄 위에 위에 scanner.nextLine() 없으면 nextline 에러 발생
        System.out.println("sex : "+ sex);
    }
}
