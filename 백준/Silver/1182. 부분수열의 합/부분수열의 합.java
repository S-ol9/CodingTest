import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N, S;
    static int[] arr;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);

        if (S == 0) {
            System.out.println(cnt - 1);
            return;
        }

        System.out.println(cnt);

    }

    private static void dfs(int depth, int sum) {
        if (depth == N) { // 배열의 크기가 같고
            if (sum == S) cnt++; // sum과 S가 같다면
            return;
        }

        dfs(depth + 1, sum + arr[depth]); // 현재 위치 원소 선택
        dfs(depth + 1, sum); // 현재 위치 원소 선택 안 함
    }
}