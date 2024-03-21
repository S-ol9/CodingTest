import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); // 방학 일수
        int A = sc.nextInt(); // 국어
        int B = sc.nextInt(); // 수학
        int C = sc.nextInt(); // 일일 국어 최대 페이지
        int D = sc.nextInt(); // 일일 수학 최대 페이지

        int max = 0;
        int ko = A / C;
        int ma = B / D;
        if (A % C == 0 && B % D == 0) {
            max = Math.max(ko, ma);
        } else if (A % C == 0) {
            max = Math.max(ko, ma +1);
        } else if (B % D == 0) {
            max = Math.max(ko + 1, ma);
        } else {
            max = Math.max(ko, ma) + 1;
        }
        System.out.println(L - max);
    }
}