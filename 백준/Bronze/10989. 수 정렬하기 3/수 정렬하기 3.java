import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[10001]; // 범위 수정
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        StringBuilder st = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                for (int j = 1; j <= arr[i]; j++) {
                    st.append(i).append("\n");
                }
            }
        }
        System.out.println(st);
    }
}
