import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (true) {
            if (check(N)) {
                System.out.println(N);
                break;
            } else {
                N--;
            }
        }
    }

    private static boolean check(int n) {
        while (n > 0) {
            int num = n % 10;
            if (num != 4 && num != 7) return false;
            n /= 10;
        }
        return true;
    }
}