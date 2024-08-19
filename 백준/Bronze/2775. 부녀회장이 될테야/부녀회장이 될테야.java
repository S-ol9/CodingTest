import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(cnt(k, n));
        }
    }

    private static int cnt(int k, int n) {
        if (k == 0) return n;
        if (n == 1) return 1;
        return (cnt(k, n - 1) + cnt(k - 1, n));
    }
}