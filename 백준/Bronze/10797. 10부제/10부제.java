import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (day == sc.nextInt()) {
                count++;
            }
        }
        System.out.println(count);
    }
}