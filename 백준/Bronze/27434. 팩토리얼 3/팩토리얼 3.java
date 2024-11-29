import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(1);
            return;
        }

        BigInteger fac = factorial(1, N);
        System.out.println(fac);
    }

    private static BigInteger factorial(int a, int b) {
        if (a == b) {
            return BigInteger.valueOf(a);
        }

        int mid = (a + b) / 2;
        
        // 분할정복
        BigInteger left = factorial(a, mid);
        BigInteger right = factorial(mid + 1, b);
        return left.multiply(right);
    }
}