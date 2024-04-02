import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스
        for (int i = 0; i < T; i++) {
            int money = sc.nextInt();
            int Q = money / 25;
            money = money % 25;
            int D = money / 10;
            money = money % 10;
            int N = money / 5;
            money = money % 5;
            int P = money;
            System.out.println(Q + " " + D + " " + N + " " + P);
        }
    }
}