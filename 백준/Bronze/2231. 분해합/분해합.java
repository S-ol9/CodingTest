import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = 0; i < N; i++) {
            int num = i;
            int sum = 0;

            // 각 자릿수 더하기
            while(num != 0) {
                sum += num % 10;
                num = num / 10;
            }

            if (sum + i == N) {
               ans = i;
               break;
            }
        }
        System.out.println(ans);
    }
}