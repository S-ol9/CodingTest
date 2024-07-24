import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] stair = new int[N + 1];
        int[] score = new int[N + 1]; // 해당 계단까지 최댓값

        for (int i = 1; i <= N; i++) {
            stair[i] = Integer.parseInt(br.readLine()); // 계단 점수
        }

        score[1] = stair[1];
        if (N >= 2) score[2] = stair[1] + stair[2];
        for (int i = 3; i <= N; i++) {
            score[i] = Math.max(score[i - 2], score[i - 3] + stair[i - 1]) + stair[i];
            // 두 칸, 두 칸 + 한 칸
        }

        System.out.println(score[N]);
    }
}