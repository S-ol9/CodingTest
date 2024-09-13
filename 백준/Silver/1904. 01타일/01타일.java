import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        dp[0] = 0;

        System.out.println(cal(N));
    }

    private static int cal(int num) {
        if (dp[num] != 0) {  // 이미 계산된 값이 있는 경우 추가
            return dp[num];
        }

        if (num == 1) {
            return dp[1] = 1;
        } else if (num == 2) {
            return dp[2] = 2;
        } else {
            dp[num] = (cal(num - 1) + cal(num - 2)) % 15746;
            return dp[num];
        }
    }
}