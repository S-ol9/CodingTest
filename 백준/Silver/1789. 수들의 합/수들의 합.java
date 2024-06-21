import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long N = 0;
        long sum = 0;
        while (true) {
            sum += N;
            if (sum > S) {
                // 개수 == 방금 넣은 값
                // 넘은 숫자 == 이미 넣은 값에 포함 => 값 하나 빼주면 된다.
                N--;
                break;
            }
            N++;
        }

        System.out.println(N);
    }
}