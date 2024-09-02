import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 1000 - Integer.parseInt(br.readLine()); // 잔 돈
        int ans = 0;
        int[] arr = {500, 100, 50, 10, 5, 1};
        for (int i = 0; i < arr.length; i++) {
            ans += N / arr[i];
            N = N % arr[i];
        }
        System.out.println(ans);
    }
}