import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 절댓값 기준
                if (Math.abs(o1) > Math.abs(o2)) {
                    return 1; // 크면 o1을 뒤로
                } else if (Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2; // 실제 값 기준 오름차순
                } else { // o2가 더 크면 o1을 앞으로,
                    return -1; // 음수 반환
                }
            }
        });

        // 양수: 첫번째 인자가 두번째 인자 뒤로
        // 0: 인자 순서 그대로
        // 음수: 첫번째 인자가 두번째 인자 앞으로
        // => 큰 값이 뒤에 있어야 함.

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (pq.isEmpty()) {
                    sb.append("0").append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            } else {
                pq.offer(x);
            }
        }
        System.out.println(sb);
    }
}