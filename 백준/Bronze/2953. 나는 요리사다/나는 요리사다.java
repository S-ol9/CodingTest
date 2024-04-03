import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            sum = 0;
            for (int j = 1; j <= 4; j++) {
                sum += sc.nextInt();
            }
            max = Math.max(sum, max);
            if (sum == max) {
                count = i;
            }
        }
        System.out.println(count + " " + max);
    }
}