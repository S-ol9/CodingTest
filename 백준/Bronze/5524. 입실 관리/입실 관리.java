import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String Si = sc.nextLine(); // 엔터 문자열
        for (int i = 0; i < N; i++) {
            Si = sc.nextLine();
            Si = Si.toLowerCase();
            System.out.println(Si);
        }
    }
}