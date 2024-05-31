import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 우선순위 큐 사용! -- 내림차순 선언 한번에 가능
        PriorityQueue<Integer> pque = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (pque.isEmpty()) {
                    sb.append(0 + "\n");
                } else {
                    sb.append(pque.poll() + "\n");
                }
            } else {
                pque.add(x); //offer 사용 가능 => 값 추가 실패시 false
            }
        }

        System.out.println(sb);
    }
}