import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine());

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(sc.nextLine());
            if (n == 0) {
                arr.remove(arr.size() - 1);
                // arr은 이미 변형되었으므로 i로 따질 수 없음.
            } else {
                arr.add(n);
            }
        }
        long sum = 0;
        for (Integer e : arr) {
            sum += e;
        }
        System.out.println(sum);
    }
}