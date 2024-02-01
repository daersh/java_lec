package chap04.section01.greedy;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Application2 {
    public static BufferedReader toBufferedReader(String str){
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }
    public static Integer solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        StringTokenizer st =new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   //동전종류
        int K = Integer.parseInt(st.nextToken());   //계산할금액(가치의 합)
        int []coin = new int[N];                    //동전 종류를 담는 배열

        for (int i = 0; i < N; i++) {
            coin[i]= Integer.parseInt(br.readLine());
        }
        int cnt = 0;
        for (int i = 0; i < N; i++) {               //큰 코인부터 처리
            if(coin[N-1-i]>K) continue;
            cnt += K/coin[N-1-i];
            K %= coin[N-1-i];                       // K 값 수정
        }
        //System.out.println("cnt = " + cnt);
        return cnt;
    }
}
