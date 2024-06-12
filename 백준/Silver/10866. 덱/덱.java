import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deq = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("push_front")) {
                String str2 = st.nextToken();
                deq.addFirst(Integer.valueOf(str2));
            } else if (str.equals("push_back")) {
                String str2 = st.nextToken();
                deq.addLast(Integer.valueOf(str2));
            } else if (str.equals("pop_front")) {
                if (deq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deq.pollFirst()).append("\n");
                }
            } else if (str.equals("pop_back")) {
                if (deq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deq.pollLast()).append("\n");
                }

            } else if (str.equals("size")) {
                sb.append(deq.size()).append("\n");
            } else if (str.equals("empty")) {
                if (deq.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (str.equals("front")) {
                if (deq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deq.peekFirst()).append("\n");
                }
            } else if (str.equals("back")) {
                if (deq.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deq.peekLast()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}