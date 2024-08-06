import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n]; // 해당 인덱스는 0 ~ n-1까지

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] ans = new int[n][n];
        ans[0][0] = arr[0][0]; // 초기값 설정

        for (int i = 1; i < n; i++) { // 아래로 내려가면서 최대 합 계산
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    ans[i][j] = ans[i - 1][j] + arr[i][j]; // 왼쪽 끝 값은 그대로
                } else if (j == i) {
                    ans[i][j] = ans[i - 1][j - 1] + arr[i][j]; // 오른쪽 끝 값
                } else {
                    ans[i][j] = Math.max(ans[i - 1][j - 1], ans[i - 1][j]) + arr[i][j];
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) { // 마지막 줄 각 원소가 최대 합
            sum = Math.max(sum, ans[n - 1][i]);
        }
        System.out.println(sum);
    }
}