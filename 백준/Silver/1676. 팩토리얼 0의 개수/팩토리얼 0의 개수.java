import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        // 끝자리 0 기준 => 10 = 2 * 5;
        // 2의 개수는 5의 개수보다 훨씬 많기에 5를 기준으로 0의 개수 세기.
        while(N >= 5) {
            count += N / 5;
            N /= 5;
        }
        System.out.println(count);
    }
}