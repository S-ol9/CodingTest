import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());

        int sum = 0;
        for (int i = 1; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());

            if (temp == 0) {
                arr[i] = 0;
            } else {
                if (arr[i - 1] >= 1) {
                    arr[i] = arr[i - 1] + 1;
                } else {
                    arr[i] = temp;
                }
            }
        }

        for (int i : arr) {
            sum += i;
        }

        System.out.println(sum);
    }
}