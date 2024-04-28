import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int count = 0;
        if (X < 100) {
            count = X;
        } else {
            count = 99; // 99까지는 다 등차수열로 본다.
            for (int i = 100; i <= X; i++) {
                int A = i / 100;
                int B = (i / 10) % 10;
                int C = i % 10;

                if (B - A == C - B) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}