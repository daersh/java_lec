package chap01.section01.sorting;

import java.util.Scanner;

public class Application5 {
    public static void solve(int low, int high,int[] arr){
        int[] temp = new int[high+1];
        if(high-low == 0) return;
        int median = low+(high-low)/2;
        solve(low,median,arr);
        solve(median+1,high,arr);

        /*설명. 정렬 전 temp에 배열 복사*/
        temp = arr.clone();
        /*설명. 분할 정복 방식으로 작은 값부터 값을 쌓음*/
        int k = low;
        int index1 = low;
        int index2 = median+1;
        /*설명. 두 인덱스가 가리키는 값들을 비교하고 하나라도 분할 구역 끝 만나면 멈추는 반복문 실행*/
        while (index1 <=median && index2 <=high){
//            if(temp[index1]>temp[index2]){
            if(temp[index1]<temp[index2]){
                arr[k]= temp[index2];
                k++;
                index2++;
            }else{
                arr[k]= temp[index1];
                k++;
                index1++;
            }
        }

        /*설명. 좌측 인덱스 마저 옮기기*/
        while(index1 <= median){
            arr[k] = temp[index1];
            k++;
            index1++;
        }
        /*설명. 우측 인덱스 마저 옮기기*/
        while(index2 <= high){
            arr[k] = temp[index2];
            k++;
            index2++;
        }

    }
}
