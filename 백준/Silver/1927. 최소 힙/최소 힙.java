import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt((br.readLine()));
        StringBuilder sb = new StringBuilder();
        PriorityQueue pQ = new PriorityQueue<>(); // 작은 숫자 먼저 출력

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                if (pQ.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(pQ.poll()).append("\n");
                }
            } else {
                pQ.offer(input);
            }
        }
        System.out.println(sb);
    }
}