package chap01.section01.sorting;

import java.util.Scanner;

/**
 * 목표<br><br>
 * 1. <br>
 */
public class Application4 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int len = sc.nextInt();
        int[]arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]= sc.nextInt();
        }

        solution(0,len-1,arr);
        for (int i:arr){
            System.out.println(i+' ');
        }

    }

    public static void solution(int lo, int hi, int[] arr) {
        if(lo>=hi) return;

        int pivot = process(lo,hi,arr);
        solution(lo,pivot,arr);
        solution(pivot+1,hi,arr);
    }

    private static int process(int left, int right, int[] arr) {
        int lo = left -1;
        int hi = right+1;
        int pivot = arr[(left+right)/2];
        while (true){
            /*설명. 피봇 위치에 있는 값보다 작은 값을 가리키면 lo 포인터를 증가시킨다.*/
            do{
                lo++;
            }while(arr[lo]<pivot);
            /*설명. 피봇 위치에 있는 값보다 큰 값을 가리키면 hi 포인터를 감소시킨다.*/
            do{
                hi--;
            }while(arr[hi]>pivot && lo <=hi);
            /*설명. lo 포인터 위치가 hi 포인터를 앞지르려고 하면 hi 위치를 반환한다.(분할 기준 반환)*/
            if(lo>=hi) return hi;
            swap(arr,lo,hi);
        }
    }
    // 단순히 전환
    private static void swap(int[] arr, int lo, int hi) {
        int temp = arr[lo];
        arr[lo]= arr[hi];
        arr[hi]=temp;
    }
}
