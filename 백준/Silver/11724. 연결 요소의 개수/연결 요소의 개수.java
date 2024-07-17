import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점 개수
        int M = Integer.parseInt(st.nextToken()); // 간선 개수

        visited = new boolean[N+1];
        arr = new ArrayList[N+1];

        for(int i = 1; i <= N; i++) { // 인덱스 번호 주의
            arr[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr[start].add(end); // 양방향
            arr[end].add(start);
        }

        int count = 0;
        for(int i = 1; i <= N; i++) {
            if(!visited[i]) { // 방문하지 않았다면
                count++; // 연결 요소의 총 개수
                dfs(i);
            }
        }
        System.out.println(count);
    }

    public static void dfs(int v) {
        if(visited[v]) {
            return;
        }

        visited[v] = true; // 깊어질수록 방문 boolean을 true로 바꿔주면 된다.
        for(int i : arr[v]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}