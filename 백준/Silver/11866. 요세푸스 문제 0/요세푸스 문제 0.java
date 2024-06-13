import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> q = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }
        sb.append("<");
        while (q.size() > 1) {
            // 해당 인덱스 전까지는 값을 꺼내 뒤로 넣기
            for (int i = 1; i < K; i++) {
                int num = q.poll();
                q.offer(num);
            }
            // 헤당 인덱스의 값을 꺼낸다.
            sb.append(q.poll()).append(", ");
        }

        // 마지막 값 출력
        sb.append(q.poll()).append(">");
        System.out.println(sb);
    }
}