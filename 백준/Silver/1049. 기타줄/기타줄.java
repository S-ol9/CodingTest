import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int packMin = 1001; // 가격 범위 0~1000
        int eachMin = 1001;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            packMin = Math.min(packMin, Integer.parseInt(st.nextToken()));
            eachMin = Math.min(eachMin, Integer.parseInt(st.nextToken()));
        }

        int answer = Math.min(((N / 6) * packMin) + Math.min(packMin, (N % 6) * eachMin), N * eachMin);
        // 묶음 =>  묶음 개수 * 패키지 + 남은 수량 묶음 가격 or 남은 수량 * 낱개 가격
        System.out.println(answer);
    }
}