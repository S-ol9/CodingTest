import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong(); // 과자 한 개의 가격
        long N = sc.nextLong(); // 사려고 하는 과자의 개수
        long M = sc.nextLong(); // 현재 가진 돈의 액수

        long answer = K * N - M;
        if (answer <= 0) {
            answer = 0;
        }
        System.out.println(answer);
    }
}