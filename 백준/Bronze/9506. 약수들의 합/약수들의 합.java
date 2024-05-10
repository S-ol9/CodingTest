import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(sc.nextLine());
            if (n == -1) {
                break;
            }
            ArrayList<Integer> arr = new ArrayList<>();
            int sum = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    arr.add(i);
                    sum += i;
                }
            }

            if (sum != n) {
                sb.append(n + " is NOT perfect. \n");
                continue;
            }

            sb.append(n + " = 1"); //3
            for (int i = 1; i < arr.size(); i++) {
                sb.append(" + " + arr.get(i));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}