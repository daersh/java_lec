package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * 목표<br><br>
 * 컬렉션 프레임워크에 대해 이해할 수 있다.
 * <br><br>
 * 배열보다 ArrayList가 나은 점<br>
 * 1. 처음부터 크기 할당 불필요<br>
 * 2. 중간에 값 추가 및 삭제 용이<br>
 */

public class Application1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //참고. 아래 두 개는 같은 의미를 가짐
        ArrayList arrayList1 = new ArrayList();
        ArrayList<Object> aList= new ArrayList<>();

        //참고. 인터페이스인 List는 다형성을 적용한 형태로 많이 사용되고 아래와 같이 동작할 수 있다.
        List list = new ArrayList();
        list = new Vector();        //설명. 이를 통해 List를 사용하여 여러 객체를 가질 수 있음.
        ListADD(aList);
        ListPrint(aList);
        //설명. 배열과 ArrayList에 특정 인덱스에 값 삽입해보기
        arrayInsert();
        arrayListInsert();
        arrayListDuplicate();
        arrayListEdit();
        arrayListDelete();
    }

    /**모든 타입을 ADD하여 저장할 수 있는 aList<br>
      타입 안정성을 해치는 행위이다.*/
    private static void ListADD(ArrayList<Object> aList) {
        //설명 모든 타입을 ADD하여 저장할 수 있는 aList
        // 타입 안정성을 해치는 행위
        aList.add("apple");               // String -> Object
        aList.add(123);                   // 123 -> (Integer)123 -> Object
        aList.add(45.33);                 // 45.33 -> (double)45.33 -> Object
        aList.add(new java.util.Date());  // Date -> Object
    }

    /**List 요소 출력하는 method*/
    private static void ListPrint(ArrayList<Object> aList) {
        System.out.println("aList = " + aList);
        System.out.println("첫번째 값: "+ aList.get(0));
        //System.out.println("첫번째 값: "+ (Integer)aList.get(0)); // 중요. 여기서 에러가 안보이지만 실행 시 에러 발생됨
        System.out.println("두번째 값: "+ aList.get(1));
        System.out.println("aList에 담긴 데이터 크기: "+ aList.size());
        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i).toString());       //설명. 동적 바인딩에 의해 타입에 맞는 toString()이 실행된다.
        }
    }

    /**배열 중간에 값을 삽입 하는 method*/
    private static void arrayInsert() {
        int[] intArr= new int[5];
        for (int i = 0; i < 5; i++) {
            intArr[i]=1;
        }
        System.out.println(Arrays.toString(intArr));
        //설명. 새로운 배열에 기존 배열을 복사하고 2번 위치에 값을 삽입하는 경우
        int[] newArr = new int [intArr.length+1];
        System.arraycopy(intArr,0,newArr,0,intArr.length);
        System.out.println(Arrays.toString(newArr));
        for(int i=intArr.length-1;i>1;i--){
            newArr[i+1]=newArr[i];
        }
        newArr[2]=2;
        System.out.println(Arrays.toString(newArr));
    }

    /**1. ArrayList 특정 인덱스에 값 삽입*/
    private static void arrayListInsert(){
        ArrayList<Integer> intArrList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            intArrList.add(i+1);
        }
        System.out.println(intArrList);

        intArrList.add(2,7); //설명. 2번 인덱스에 7 값을 넣겠다.
        System.out.println(intArrList);
    }

    /**2. ArrayList 중복 저장*/
    private static void arrayListDuplicate(){
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add(123);
        arrayList.add("apple");
        System.out.println("arrayList = " + arrayList);
    }

    /**3. ArrayList 인덱스 수정*/
    private static void arrayListEdit(){
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add(123);
        arrayList.add("apple");
        System.out.println("arrayList = " + arrayList);

        arrayList.set(1,"1234");
        System.out.println("arrayList = " + arrayList);
    }

    /**4. ArrayList 인덱스 제거*/
    private static void arrayListDelete(){
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add(123);
        arrayList.add("apple");
        System.out.println("arrayList = " + arrayList);

        arrayList.remove(1);
        System.out.println("arrayList = " + arrayList);
    }
}
