import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 참가자 수
        int jm = Integer.parseInt(st.nextToken()); // 김지민
        int hs = Integer.parseInt(st.nextToken()); // 임한수

        int cnt = 0;

        while (true) {
            jm = jm / 2 + jm % 2; // 홀수 일 때는 +1을 해야히므로 나머지 값을 더해준다.
            hs = hs / 2 + hs % 2;
            cnt++;
            
            if (jm == hs) break;
        }
        System.out.println(cnt);
    }
}