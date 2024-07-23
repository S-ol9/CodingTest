import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { // 에라토스테네스의 체
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] bool = new boolean[N + 1];

        // 0, 1 소수 제외
        bool[0] = true;
        bool[1] = true;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (!bool[i]) {
                for (int j = i * i; j <= N; j += i) { // i를 가진 소수가 아닌 값 제거
                    bool[j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = M; i <= N; i++) {
            if (!bool[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}