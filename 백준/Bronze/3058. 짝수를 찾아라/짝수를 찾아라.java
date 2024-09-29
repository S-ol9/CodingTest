import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0; j < 7; j++) {
                int x = Integer.parseInt(st.nextToken());
                if (x % 2 == 0) {
                    arr.add(x);
                    sum += x;
                }
            }
            Collections.sort(arr);
            sb.append(sum).append(" ").append(arr.get(0)).append("\n");
        }
        System.out.println(sb);
    }
}