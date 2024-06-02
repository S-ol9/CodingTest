import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        HashSet<Integer> hset1 = new HashSet<>();
        HashSet<Integer> hset2 = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            hset1.add(Integer.valueOf(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B; i++) {
            hset2.add(Integer.valueOf(st.nextToken()));
        }

        int answer = 0;

        for (int a : hset1) {
            if (!hset2.contains(a)) {
                answer++;
            }
        }

        for (int b : hset2) {
            if (!hset1.contains(b)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
