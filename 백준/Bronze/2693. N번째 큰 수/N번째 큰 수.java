import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer[] arr = new Integer[10];
            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr, Collections.reverseOrder());
            // Collections.reverseOrder()를 쓸 때는 배열의 타입이 Integer여야 한다.

            sb.append(arr[2]).append("\n");
        }

        System.out.println(sb);
    }
}