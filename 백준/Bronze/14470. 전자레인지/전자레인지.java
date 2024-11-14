import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine()); // 고기 온도
        int B = Integer.parseInt(br.readLine()); // 목표 온도
        int C = Integer.parseInt(br.readLine()); // 얼은 고기 1도 데우는 데 걸리는 시간
        int D = Integer.parseInt(br.readLine()); // 해동 시간
        int E = Integer.parseInt(br.readLine()); // 얼지 않은 고기 1도 데우는 데 걸리는 시간

        int answer = 0;

        if (A < 0) {
            answer = (Math.abs(A) * C) + D + (B * E);
        } else if (A == 0) {
            answer = D + (B * E);
        } else {
            answer = (B - A) * E;
        }

        System.out.println(answer);
    }
}