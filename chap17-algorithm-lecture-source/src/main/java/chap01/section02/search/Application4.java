package chap01.section02.search;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Application4 {
    static BufferedReader br;
    static BufferedWriter bw;
    static StringBuffer sb;
    static StringTokenizer st;

    static int n,m;
    static boolean []visited= new boolean[101];
    // 한노드에 연결된 노드들을 저장하기 위함
    // 다음 노드 저장하기 위함
    static ArrayDeque<Integer> queue = new ArrayDeque<Integer>();

    public static void main(String[] args)throws Exception {
        //init
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuffer();
        Integer x= solution();
    }
    static Integer solution() throws Exception{
        int n,m,start;
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        for (int i = 0; i < m; i++) {
            int x,y;
            st = new StringTokenizer(br.readLine());
            x= Integer.parseInt(st.nextToken());
            y= Integer.parseInt(st.nextToken());

        }

        return null;
    }

    static class data{
        int x;
        int y;
        data(int x,int y){
            this.x=x;
            this.y=y;
        }

    }
}
