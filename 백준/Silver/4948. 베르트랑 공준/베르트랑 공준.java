import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int count = 0;
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int t = n * 2;
            boolean bool = false;
            for (int i = n + 1; i <= t; i++) {
                int num = (int) Math.sqrt(i);
                for (int j = 2; j <= num; j++) {
                    if (i % j == 0) { // 소수가 아님
                        bool = true;
                        break;
                    }
                }
                if (!bool) { // 소수가 아니라면
                    count++;
                }
                bool = false;
            }
            System.out.println(count);
        }
    }
}