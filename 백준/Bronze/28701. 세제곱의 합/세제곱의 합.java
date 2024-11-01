import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int ans1 = 0;
        int ans2 = 0;
        int ans3 = 0;

        for (int i = 1; i <= N; i++) {
            ans1 += i;
            ans3 += Math.pow(i,3);
        }
        sb.append(ans1).append("\n");

        ans2 += Math.pow(ans1, 2);

        sb.append(ans2).append("\n");
        sb.append(ans3).append("\n");

        System.out.println(sb);
    }
}