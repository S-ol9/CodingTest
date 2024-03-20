import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        for (long i = N; i >= 1; i--) {
            System.out.println(i);
        }
    }
}