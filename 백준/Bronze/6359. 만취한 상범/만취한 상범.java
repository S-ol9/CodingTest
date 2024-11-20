import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= T; i++) { // 각 테스트 케이스
            int n = Integer.parseInt(br.readLine());

            int count = 0;
            for(int k = 1;  k * k <= n; k++) { // 게임
                count++;
            }

            sb.append(count).append("\n");
        }

        // 보통 약수의 개수는 짝수 개이지만 완전 제곱수는 홀수 개
        // => 완전제곱수의 값만 열려있게 된다.
        
        System.out.println(sb);
    }
}