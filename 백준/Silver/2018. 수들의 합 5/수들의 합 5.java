import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int start_idx = 1; // 투 포인터, 같은 자리
        int end_idx = 1;
        int sum = 1;

        while (end_idx != N) {
            if (sum == N) { // count++, end_idx++, sum 변경
                count++;
                end_idx++;
                sum += end_idx;
            } else if (sum > N) { // sum 변경, start_idx++
                sum -= start_idx;
                start_idx++;
            } else if (sum < N) { // sum 변경, end_idx++
                end_idx++;
                sum += end_idx;
            }
        }

        System.out.println(count);
    }
}