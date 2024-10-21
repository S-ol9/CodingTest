import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long N = Long.parseLong(br.readLine());

        // 규칙성 찾기
        System.out.println(N % 5 == 0 || N % 5 == 2 ? "CY" : "SK");

        // 상근이 선 => 돌 가져간 후 i - 4의 n제곱으로 정의
        // i - 4의 n제곱 = false 인 경우 => 창영 패
    }
}