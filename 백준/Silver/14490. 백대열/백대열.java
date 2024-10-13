import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int gcd = func(Math.max(n, m), Math.min(n, m));

        System.out.println(n / gcd + ":" + m / gcd);
    }

    // 최대공약수 구하기
    private static int func(int n, int m) {
        if (m == 0) {
            return n;
        } else {
            return func(m, n % m);
        }
    }
}