import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            Map<String, Integer> map = new HashMap<>();
            int N = Integer.parseInt(br.readLine());
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String S = st.nextToken();
                int L = Integer.parseInt(st.nextToken());

                map.put(S, L);
            }

            for(Map.Entry<String, Integer> entry : map.entrySet()) {
                if(entry.getValue() == Collections.max(map.values())) {
                    sb.append(entry.getKey()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}