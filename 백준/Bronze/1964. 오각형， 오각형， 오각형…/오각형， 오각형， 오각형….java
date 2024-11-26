import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        long count = 5;

        for (int i = 2; i <= N; i++) {
            int num = (i + 1) * 3 - 2;
            count += num;
        }

        System.out.println(count % 45678);
    }
}