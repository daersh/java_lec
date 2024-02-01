package chap04.section01.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Application3_1 {
    public static BufferedReader toBufferedReader(String input){
        InputStream is = new ByteArrayInputStream(input.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }
    public static Integer solution(String input) throws IOException {
        int max_count = 0;
        BufferedReader br = toBufferedReader(input);
        int N = Integer.parseInt(br.readLine());
        int[][] time = new int[N][2];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }
        /*설명. 종료시간을 기준으로 오름차순을 한다. 만약 종료시간이 같으면 시작시간이 작은것을 앞으로 한다.*/
        Arrays.sort(time,(o1,o2)->{
            if(o1[1]==o2[1]){
                /*설명. 시작 시간이 늦은 순서로 정렬 기준을 잡는다.*/
                return o1[0]-o2[0];
            }
            //설명.종료시간이 같지 않을 때 종료 시간이 이름 회의부터 정렬되도록 기준을 잡는다.
            return o1[1]- o2[1];
        });



        int end =0;
        for (int i = 0; i < N; i++) {
            if(time[i][0]>=end){
                max_count++;
                end= time[i][1];
            }
        };

        return  max_count;
    }

}
