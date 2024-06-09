import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long N = sc.nextLong();
        System.out.println(N * (N - 1) / 2); // 1 ~ (n-1)까지의 합
        System.out.println(2);
    }
}