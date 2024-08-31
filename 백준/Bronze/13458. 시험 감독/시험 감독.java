import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 시험장 개수
        int[] arr = new int[N];

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 각 시험장 응시자 수
        }

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken()); // 총감독관이 한 시험장에서 감시할 수 있는 응시자 수
        int C = Integer.parseInt(st.nextToken()); // 부괌독관이 한 시험장에서 감시할 수 있는 응시자 수

        long ans = N;

        for (int i = 0; i < N; i++) {
            arr[i] -= B; // 총감독관은 각 시험장마다 무조건 필요

            if (arr[i] > 0) {
                ans += arr[i] / C;

                if (arr[i] % C != 0) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}