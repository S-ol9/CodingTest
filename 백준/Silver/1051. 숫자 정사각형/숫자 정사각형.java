import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = temp.charAt(j) - '0';
            }
        }

        int ans = 1;
        int size = Math.min(N, M);
        // 작은 값ㅇ르 저장하는 이유: 최대 가능한 정사각형의 길이를 찾기 위해
        // ex) N: 3, M: 5 일 경우, 5 x 5는 불가능 => 작은 차원 기준으로 결정

        for (int i = 2; i <= size; i++) { // 정사각형 한 변의 길이, 1 x 1은 기본으로 존재하기 때문에 i = 2부터 시작
            for (int x = 0; x < N - i + 1; x++) { // i + x가 N을 넘지 않아야 한다.
                for (int y = 0; y < M - i + 1; y++) {
                    int topLeft = arr[x][y];
                    int topRight = arr[x][y + i - 1];
                    int bottomLeft = arr[x + i - 1][y];
                    int bottomRight = arr[x + i - 1][y + i - 1];
                    if (topLeft == topRight && topLeft == bottomLeft && topLeft == bottomRight) {
                        if (ans < i) {
                            ans = i;
                        }
                    }
                }
            }
        }

        System.out.println(ans * ans);
    }
}