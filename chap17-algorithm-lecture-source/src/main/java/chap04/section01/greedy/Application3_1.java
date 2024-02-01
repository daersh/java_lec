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

        Arrays.sort(time,(o1,o2)->{
            if(o1[1]==o2[1]){
                return o1[0]-o2[0];
            }
            return o1[1]- o2[1];
        });
        return  max_count;
    }

}
