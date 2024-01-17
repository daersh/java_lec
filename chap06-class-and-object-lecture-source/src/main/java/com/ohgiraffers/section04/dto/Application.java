package com.ohgiraffers.section04.dto;

public class Application {
    /*수업목표 생성자를 이용한 객체 초기화, 설정자를 이용한 초기화의 장단점을 이해할 수 있다.*/

    public static void main(String[] args) {
        UserDTO user1 = new UserDTO();
        user1.forInformation();
        user1.setId("user01");
        user1.forInformation();
    }
}
