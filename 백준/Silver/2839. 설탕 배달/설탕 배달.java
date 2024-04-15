import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int bag5 = N / 5;
        int remain5 = N % 5;
        int result = -1;
        while (bag5 >= 0) {
            if (remain5 % 3 == 0) {
                int bag3 = remain5 / 3;
                result = bag5 + bag3;
                break;
            }
            bag5--;
            remain5 += 5; // 5kg 봉지를 줄이고, 3kg 봉지 늘리기.
        }
        System.out.println(result);
    }
}