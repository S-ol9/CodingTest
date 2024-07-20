import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int N, M, R, count = 1;
    static int[] arr; // 결과 저장 배열
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        arr = new int[N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i <= N; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        dfs(R);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) sb.append(arr[i]).append("\n");

        System.out.println(sb);
    }

    private static void dfs(int R) {
        visited[R] = true;
        arr[R] = count++;
        Collections.sort(graph.get(R), Collections.reverseOrder());

        for (Integer val : graph.get(R)) if (!visited[val]) dfs(val);
    }
}