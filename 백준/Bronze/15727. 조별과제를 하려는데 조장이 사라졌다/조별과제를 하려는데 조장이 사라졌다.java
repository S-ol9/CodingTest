import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextInt();

        if (L % 5 != 0) {
            System.out.println(L / 5 + 1);
        } else {
            System.out.println(L / 5);
        }
    }
}