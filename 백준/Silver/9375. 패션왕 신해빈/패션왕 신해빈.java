import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int N = Integer.parseInt(br.readLine());
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken(); // 옷 name
                String type = st.nextToken(); // 옷 type

                if (!map.containsKey(type)) {
                    map.put(type, 0);
                }
                
                map.put(type, map.get(type) + 1);
            }

            int ans = 1;
            for (Integer value : map.values()) {
                ans *= value + 1; // +1: 해당 value 안입는 경우
            }
            System.out.println(ans - 1); // 아예 입지 않는 경우 -1
        }
    }
}