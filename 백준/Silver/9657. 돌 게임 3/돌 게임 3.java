import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[1001]; // N의 입력 값이  4보다 작을 수 있음.
        arr[1] = 1;
        arr[2] = 0;
        arr[3] = 1;
        arr[4] = 1;

        for (int i = 5; i <= N; i++) {
            if ((arr[i - 1] & arr[i - 3] & arr[i - 4]) == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(arr[N] == 1 ? "SK" : "CY");
    }
}