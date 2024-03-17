import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //흰색 킹(1), 퀸(1), 룩(2), 비숍(2), 나이트(2), 폰(8)
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();

        System.out.println((1-A) + " " + (1-B) + " " + (2-C) + " " + (2-D) + " " + (2-E) + " " + (8-F));
    }
}