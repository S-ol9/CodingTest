import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = N, y = 0; i > 0; i--, y++) {
            for (int x = 0; x < y; x++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}