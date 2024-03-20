import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = N; i > 0; i--) { // 받은 크기만큼
            for (int j = 1; j <= N; j++) { // 1부터 N까지
                if (j >= i) { // j가 i보다 크다면
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}