import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // 다이나믹 프로그래밍 => 점화식 사용
        // db[n] = dp[n-1] + dp[n-2] + dp[n-3];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            arr.add(2);
            arr.add(4);

            for (int j = 3; j < n; j++) {
                arr.add(arr.get(j - 1) + arr.get(j - 2) + arr.get(j - 3));
            }

            bw.write(arr.get(n - 1) + "\n");
        }
        bw.flush();
        bw.close();
    }
}