import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = Integer.parseInt(sc.nextLine());
        int N = Integer.parseInt(sc.nextLine());

        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            boolean check = true;
            if (i == 1) check = false;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                sum += i;
                arr.add(i);
            }
        }
        Collections.sort(arr);

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(arr.get(0));
        }
    }
}