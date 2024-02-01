package chap04.section01.greedy;

public class Application1 {
    public static int solution(int n) {
        int count = 0;  //들고갈 최소 봉지 갯수


        while(true){
            /*설명. 5키로로 바로 나눌 수 있으면 n/5를 반환한다.*/
            if(n%5==0) return (n/5 + count);        //설명. +count 는 이전 반복에서 추가된 3키로이다.
            else if(n < 0){
                return -1;
            }
            /*설명. 3키로 빼고 cnt++*/
            n-=3;
            count++;
        }
    }
}
