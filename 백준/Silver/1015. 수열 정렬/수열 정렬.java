import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = A[i];
        }

        Arrays.sort(B);

        for (int i = 0; i < N; i++) { // 기존 배열에서
            for (int j = 0; j < N; j++) { // 정렬된 배열의 인덱스 값 찾기
                if (A[i] == B[j]) { // 해당 값이 같을 경우,
                    sb.append(j + " "); // 정렬된 인덱스 값 출력
                    B[j] = -1;
                    break;
                }
            }
        }

        System.out.println(sb);

    }
}