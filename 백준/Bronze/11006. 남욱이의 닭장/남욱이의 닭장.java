import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 모든 닭의 다리 수의 합
            int M = Integer.parseInt(st.nextToken()); // 닭의 수

            int U = M * 2 - N; // 잘린 닭의 수
            int healthy = M - U;
            sb.append(U).append(" ").append(healthy).append("\n");
        }

        System.out.println(sb);
    }
}