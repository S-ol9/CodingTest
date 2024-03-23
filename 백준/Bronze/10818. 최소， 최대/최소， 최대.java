import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long min = 1000000;
        long max = -1000000;

        for(long i = 0; i<N; i++) {
            long x = sc.nextLong();
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        System.out.print(min + " " + max);
    }
}