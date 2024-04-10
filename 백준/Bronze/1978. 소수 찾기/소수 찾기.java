import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int scount = 0;
        for (int i = 0; i < N; i++) {
            int acount = 0;
            int a = sc.nextInt();
            for (int j = 1; j <= a; j++) {
                if (a % j == 0) {
                    acount++;
                }
            }
            if (acount == 2) {
                scount++;
            }
        }
        System.out.println(scount);
    }
}