import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] bool;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken()); // 배열 길이

        bool = new boolean[N];
        arr = new int[M];

        dfs(0, 0);
        System.out.print(sb);
    }

    private static void dfs(int start, int depth) {
        if (depth == M) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < N; i++) { // 시작 지점 변수 추가
            if (!bool[i]) { // false 라면 == 방문 X
                bool[i] = true; // true로 변경 == 방문 O
                arr[depth] = i + 1; // 해당 변수는 depth
                dfs(i + 1, depth + 1);
                bool[i] = false; // 자식 노드 방문 후 방문 X 상태로 변경
            }
        }
    }
}