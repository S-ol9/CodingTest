import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong(); // 1제곱미터당 사람 수
        long P = sc.nextLong(); // 파티가 열렸던 곳의 넓이

        for (int i = 0; i < 5; i++) {
            long N = sc.nextLong();
            if (L * P == N) {
                System.out.print(0 + " ");
            } else {
                System.out.print(N - (L * P) + " ");
            }
        }

    }
}