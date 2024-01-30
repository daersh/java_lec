package chap01.section01.timecomplexity;

import java.util.Arrays;

/**
 * 목표<br><br>
 * 시간복잡도에 대해 이해할 수 있다. <br>
 * @시간복잡도: 알고리즘 실행 시 입력값이 증가함에 따라 걸리는 시간의 증가도를 나타낸다.
 */
public class Application {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 15, 4, 9, 10, 7};
        System.out.println(getFirst(arr));
        System.out.println(binarySearch(arr, 9));   // 참고. 얕은 복사로 arr이 sort되어 아래 코드 영향 주게 됨.
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(fibonacci(10));
    }


    /**
     * 설명: 배열에서 크기 상관 없이 값을 바로 뽑아오는 것이므로 상수 시간 O(1)이다.
     */
    private static int getFirst(int[] arr) {
        return arr[0];
    }

    /**
     * 설명: 로그 시간 O(log n)
     */
    private static int binarySearch(int[] arr, int val) {
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length;

        while (l + 1 < r) {
            int mid = (l + r) / 2;
            if (arr[mid] < val) l = mid;
            else r = mid;
        }

        return arr[r];
    }

    /**설명: 선형 시간 O(n)*/
    private static int[] reverse(int []arr){
        int[] reversed = new  int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i]= arr[arr.length-1-i];
        }
        return reversed;
    }

    /*설명. 지수 시간 O(n^2)*/
    private static int fibonacci(int n){
        if(n <= 1) return  n;
        return fibonacci(n-1)+fibonacci(n-2);
    }

}
