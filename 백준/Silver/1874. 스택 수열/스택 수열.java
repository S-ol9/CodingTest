import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(sc.nextLine());
        int temp = 1;
        boolean bool = false;

        // 스택 = 자료를 넣는 입구(push) == 자료를 뽑는 입구(pop)
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int T = Integer.parseInt(sc.nextLine());

            for (; temp <= T; temp++) {
                stack.push(temp);
                sb.append("+").append("\n");
            }

            if (stack.peek() == T) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                bool = true;
                break;
            }
        }

        if (bool) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}