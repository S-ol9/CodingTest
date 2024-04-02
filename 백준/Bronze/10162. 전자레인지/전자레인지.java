import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        if (T % 10 != 0) {
            System.out.println(-1);
        } else {
            int A = T / 300;
            T = T % 300;
            int B = T / 60;
            T = T % 60;
            int C = T / 10;
            System.out.println(A + " " + B + " " + C);
        }
    }
}
