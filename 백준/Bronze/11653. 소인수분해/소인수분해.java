import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        for (int i = 2; i <= Math.sqrt(N); i++) {
            // 두 인수 중 한 수는 N의 제곱근보다 작게 되어있음.
            // ==> N까지 반복할 필요 없음.
            while (N % i == 0) {
                sb.append(i).append("\n");
                N /= i;
            }
        }

        // 반복문이 끝났으나 1이 되지 않은 경우, 즉 소수일 경우
        if (N != 1) {
            sb.append(N).append("\n");
        }

        System.out.print(sb);
    }
}