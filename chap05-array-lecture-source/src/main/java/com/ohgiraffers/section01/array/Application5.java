package com.ohgiraffers.section01.array;

import java.util.Random;

public class Application5 {
    public static void main(String[] args) {
        /*수업목표. 배열을 사용하는 예시를 통해 카드 게임을 작성해보자*/
        String [] shape= {"SPADE","CLOVER","HEART","DIAMOND"};
        String [] cardNumbers = {"2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING","ACE"};

        Random rand= new Random();
        int randomShapeIndex;
        int randomCardNuberIndex;

        randomShapeIndex = rand.nextInt(4);
        randomCardNuberIndex = rand.nextInt(13);
        System.out.println("당신이 뽑은 카드는 "+shape[randomShapeIndex]+' '+cardNumbers[randomCardNuberIndex]+" 카드 입니다.");

    }
}
