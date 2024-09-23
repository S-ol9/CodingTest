import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int ans = gcd(A, B);

        // 최대공약수, 최소공배수 순
        sb.append(ans).append("\n").append((A * B) / ans);
        System.out.println(sb);
    }

    private static int gcd(int A, int B) {
        if (A % B == 0) return B;
        else return gcd(B, A % B);
    }
}