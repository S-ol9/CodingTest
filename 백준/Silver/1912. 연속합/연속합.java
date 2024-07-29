import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        dp[0] = arr[0];
        for (int i = 1; i < N; i++) { // 새로 시작 기준 정하기
            if (dp[i - 1] + arr[i] < arr[i]) dp[i] = arr[i]; // 현재 원소 포함 유리 vs 새로 시작
            else dp[i] = dp[i - 1] + arr[i]; // 누적 합
        }

        int ans = -1001;
        for (int i = 0; i < N; i++) if (ans < dp[i]) ans = dp[i];

        System.out.println(ans);
    }
}