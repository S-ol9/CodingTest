import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0;
        int min = 100;
        for (int i = 0; i < 7; i++) {
            int N = sc.nextInt();
            if (N % 2 != 0) {
                odd += N;
                min = Math.min(min, N);
            }
        }
        if (odd == 0) {
            System.out.println(-1);
        } else {
            System.out.println(odd);
            System.out.println(min);
        }
    }
}