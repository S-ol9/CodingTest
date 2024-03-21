import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = 0;
        int x = 0;
        for (int i = 0; i < 4; i++) {
            y += sc.nextInt();
        }
        if (y >= 60) {
            x += y / 60;
            y = y % 60;
        }
        System.out.println(x);
        System.out.println(y);
    }
}