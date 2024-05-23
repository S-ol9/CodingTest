import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            map1.put(str, i);
            map2.put(i, str);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();

            if (input.charAt(0) <= 57) { // 숫자
                sb.append(map2.get(Integer.parseInt(input)) + "\n");
            } else { // 문자
                sb.append(map1.get(input) + "\n");
            }
        }
        System.out.println(sb);
    }
}
