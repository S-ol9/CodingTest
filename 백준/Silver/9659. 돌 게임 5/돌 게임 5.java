import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        // 홀수: 상근 승 - 짝수: 창영 승
        System.out.println(N % 2 == 1 ? "SK" : "CY");
    }
}