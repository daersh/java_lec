package chap05.section01.tree;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Application1 {
    static int N;
    static int [] parent;
    static boolean [] isVisit;
    static StringTokenizer st;
    static List<Integer>[] list;
    static StringBuilder sb= new StringBuilder();
    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }
    public static String solution(String input) throws IOException {
        BufferedReader br = toBufferedReader(input);
        sb.delete(0,sb.length());
        N= Integer.parseInt(br.readLine());
        //설명. 노드번호와 인덱스 번호 일치시기ㅋ기 위해 +1
        isVisit = new boolean[N+1];
        list = new ArrayList[N+1];
        parent = new int[N+1];
        for (int i = 1; i < N + 1; i++) {
            list[i]= new ArrayList<>();
        }
        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            //설명. 양방향 연결
            list[a].add(b);
            list[b].add(a);
        }
        dfs(1);

        for(int i=2; i< parent.length;i++){
            sb.append(parent[i]+" ");
        }
        return sb.toString();
    }

    //설명. DFS
    public static void dfs(int parentNode){
        //설명.visit: 부모노드를 재방문하지 않도록 하기 위함.
        isVisit[parentNode] = true;
        //설명. 입력받은 값을 통해 생성된 list로부터 관련 있는 노드들을 확인하기 위한 반복문
        for(int node: list[parentNode]){
            //설명. 방문 한적 없는 노드는 자식노드이다.(루트로부터 방문을 체크하여 내려왔기 때문)
            if (!isVisit[node]){
                parent[node] = parentNode;
                dfs(node);
            }
        }
    }
}
