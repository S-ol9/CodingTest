import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int cnt1 = 1;
    static int cnt2 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        fib(n);
        fibonacci(n);
        sb.append(cnt1).append(" ").append(cnt2);
        System.out.println(sb);
    }

    private static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            cnt1++;
            return (fib(n - 1) + fib(n - 2));
        }
    }

    private static int fibonacci(int n) {
        int[] f = new int[41];
        f[1] = f[2] = 1;
        for (int i = 3; i <= n; i++) {
            cnt2++;
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}