import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 2;
        for (int i = 1; i <= N; i++) {
            sum += sum - 1;
        }
        System.out.println(sum * sum);
        // 규칙 찾기: 한 변에 생기는 점의 개수 파악
    }
}