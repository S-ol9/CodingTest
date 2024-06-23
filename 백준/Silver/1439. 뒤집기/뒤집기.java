import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        StringTokenizer st1 = new StringTokenizer(N, "0"); // 1이 연속된 개수
        StringTokenizer st0 = new StringTokenizer(N, "1"); // 0이 연속된 개수

        // 각 0과 1로 니누었을 때 토큰 개수가 적은 것이 최소 행동 개수
        int min = Math.min(st0.countTokens(), st1.countTokens());
        System.out.println(min);
    }
}