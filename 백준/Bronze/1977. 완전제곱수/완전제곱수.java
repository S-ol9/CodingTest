import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = N;

        for (int i = 1; i * i <= N; i++) {
            if (i * i >= M && i * i <= N) {
                sum += i * i;
                min = Math.min(i * i, min);
            }
        }

        StringBuilder sb = new StringBuilder();
        if (sum == 0) {
            sb.append(-1);
        } else {
            sb.append(sum).append("\n").append(min);
        }

        System.out.println(sb);
    }
}