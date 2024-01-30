package chap01.section01.sorting;

import java.util.Scanner;

/**
 * 목표<br><br>
 * 버블 정렬을 이해할 수 있다. <br>
 * @_______________ _____________________________________________________________________________________
 * @정렬알고리즘: 데이터를 즉정 순서대로 배열하는데 사용한다.(일반적으로는 배열의 정렬을 뜻한다(코딩테스트 기준))
 * @버블정렬: 두 인접한 데이터의 크기를 비교하여 정렬하는 방법으로 버블의 모든 요소에 대해 반복하면서, 각 반복마다 가장 큰 요소가 배열의 끝으로"버블링"(이동)된다.
 * <br>시간 복잡도: O(n^2)
 */
public class Application1 {
    /**@문제설명
     * @_ N개의 정수가 주어졌을 때, 버블 정렬 알고리즘을 사용하여 오름차순으로 정렬하는 프로그램을 작성하시오.
     * @예시
     * @1.입력 - 7<br> - 1 5 9 12 23 24 34
     * @1.출력
     *
     *
     * */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        /*설명. 입력 데이터 받기*/
        int[] arr = getInput(sc);
        /*설명. 알고리즘 실행*/
        solution(arr);
        /*설명. 정렬결과 출력하기*/
        printSolution(arr);

    }

    private static void printSolution(int[] arr) {
        for (int i: arr){
            System.out.print(i+" ");
        }
    }

    private static int[] getInput(Scanner sc) {
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();           // 참고. nextInt()는 공백을 구분자로 입력 받을 수 있다!
        }
        return arr;
    }

    public static void solution(int[] arr){
        for(int i= arr.length-1; i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j] >arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }

        }
    }

}
