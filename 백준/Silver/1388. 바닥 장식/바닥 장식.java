import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;

    static char[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 행
        M = Integer.parseInt(st.nextToken()); // 열

        arr = new char[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j); // 받은 String 타입을 char 타입으로 변경
            }
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) { // 방문하지 않았다면 dfs
                    dfs(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void dfs(int i, int j) {
        visited[i][j] = true;
        if (arr[i][j] == '-') { // 현재 -일 때,
            if (j + 1 < M && arr[i][j+1] == '-' && !visited[i][j+1]) { // 다음 값도 -인지 확인
                dfs(i, j + 1);
            }

        } else if (arr[i][j] == '|') {
            if (i + 1 < N && arr[i+1][j] == '|' && !visited[i+1][j]) {
                dfs(i + 1, j);
            }

        }
    }
}