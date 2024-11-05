import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            int S = Integer.parseInt(br.readLine()); // 자동차 가격
            int N = Integer.parseInt(br.readLine()); // 옵션의 개수

            int sum = S;
            while (N != 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int q = Integer.parseInt(st.nextToken()); // 특정 옵션 개수
                int p = Integer.parseInt(st.nextToken()); // 해당 옵션 가격
                sum += q * p;
                N--;
            }

            System.out.println(sum);
        }
    }
}