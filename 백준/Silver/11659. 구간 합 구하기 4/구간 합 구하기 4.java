import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] str = br.readLine().split(" ");
        int[] arr = new int[N + 1];

        // 누적합 계산으로 변경
        for (int i = 0; i < str.length; i++) {
            arr[i + 1] = arr[i] + Integer.parseInt(str[i]);
        }
        

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int st1 = Integer.parseInt(st.nextToken());
            int st2 = Integer.parseInt(st.nextToken());
            int sum = arr[st2] - arr[st1 - 1]; // 구간 외의 값 제거
            System.out.println(sum);
        }
    }
}