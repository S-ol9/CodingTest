import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0, end = 0, sum = 0, cnt = 0;

        while (true) {
            if (sum >= M) { // 합을 넘어가기 때문
                sum -= arr[start++]; // 투 포인터 중 start 인덱스 뒤로, 그 전까지 더한 값은 취소
            } else if (N == end) {
                break;
            } else {
                sum += arr[end++]; // 해당 end를 더하고 ++ => 해당 값은 다음 반복문에서 적용
            }

            if (sum == M) cnt++;
        }

        System.out.println(cnt);
    }
}