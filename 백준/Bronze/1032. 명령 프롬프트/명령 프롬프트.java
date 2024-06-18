import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        // 배열에 파일 이름 저장
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr[0].length(); i++) {
            boolean bool = true;
            char c = arr[0].charAt(i);
            for (int j = 1; j < N; j++) {
                if (c != arr[j].charAt(i)) {
                    // 첫번째 배열의 i값과 j번째 배열의 j값 비교
                    bool = false;
                }
            }

            if (bool) {
                sb.append(c);
            } else {
                sb.append("?");
            }
        }
        System.out.println(sb);
    }
}