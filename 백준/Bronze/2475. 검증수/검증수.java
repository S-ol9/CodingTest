import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        for (int i = 0; i < 5; i++) {
            int A = sc.nextInt();
            answer += A * A;
        }
        System.out.println(answer % 10);
    }
}