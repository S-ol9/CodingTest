import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int one = 0;
        for (int i = 0; i < N; i++) {
            one += sc.nextInt();
        }
        if (one < (double)N / 2) {
            System.out.println("Junhee is not cute!");
        } else {
            System.out.println("Junhee is cute!");
        }
    }
}