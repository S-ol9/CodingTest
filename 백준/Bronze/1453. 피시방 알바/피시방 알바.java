import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[101];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (arr[num] == 1) {
                sum += 1;
            } else {
                arr[num] = 1;
            }
        }
        System.out.println(sum);
    }
}