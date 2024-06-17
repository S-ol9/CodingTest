import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N]; // 내림차순 정렬 위해 Integer 선언

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr, Collections.reverseOrder());
        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, arr[i] * (i + 1));
            // 내림차순 정렬
            // i값 기준 중량 계산 ==> 해당 중량 값을 넘어가면 안됨.
        }

        System.out.println(max);
    }
}