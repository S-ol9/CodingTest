import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int t = n * 2;

            // 에라토스테네스의 체 알고리즘
            // 2부터 시작하여 배수값을 찾아 false로 지정하여 소수 판별
            boolean[] bool = new boolean[t + 1];
            Arrays.fill(bool, true); // 배열값 전체 true로 변경
            bool[0] = false;
            bool[1] = false;

            for (int i = 2; i * i <= t; i++) {
                if (bool[i]) { // 만약 true 라면
                    for (int j = i * i; j <= t; j += i) {
                        bool[j] = false; // i의 배수 = 소수 X
                    }
                }
            }
            int count = 0;
            for (int i = n + 1; i <= t; i++) {
                if (bool[i]) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}