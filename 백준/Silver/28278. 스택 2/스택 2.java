import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder(); // 빌더 사용

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            if (str.equals("1")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (str.equals("2")) {
                if (stack.isEmpty()) {
                    sb.append("-1" + "\n");
                } else {
                    sb.append(stack.lastElement() + "\n");
                    stack.pop();
                }
            } else if (str.equals("3")) {
                sb.append(stack.size() + "\n");
            } else if (str.equals("4")) {
                if (stack.isEmpty()) {
                    sb.append("1" + "\n");
                } else {
                    sb.append("0" + "\n");
                }
            } else if (str.equals("5")) {
                if (stack.empty()) {
                    sb.append("-1" + "\n");
                } else {
                    sb.append(stack.lastElement() + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}