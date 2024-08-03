import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] T = new int[N];
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken()); // 근무 일수
            P[i] = Integer.parseInt(st.nextToken()); // 금액
        }

        int[] dp = new int[N + 1]; // N일에 일한 돈은 N+1에 누적

        for (int i = 0; i < N; i++) {
            if (i + T[i] <= N) { // 날짜가 넘어가지 않는 동안
                dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
            }
            // 현재 일 수에서 추가 일 수 더한 날 = 그 전 날의 값에 해당 날 금액 추가

            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
            // 일을 하지 않는 경우에도 최대 수익을 전달하기 위해
        }
        System.out.println(dp[N]);
    }
}