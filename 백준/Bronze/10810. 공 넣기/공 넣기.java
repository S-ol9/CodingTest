import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 공을 넣을 횟수

        int[] arr = new int[N];
        for (int x = 0; x < M; x++) {
            int i = sc.nextInt(); // i번 바구니
            int j = sc.nextInt(); // j번 바구니
            int k = sc.nextInt(); // k 번호가 적혀져 있는 공

            for (int y = i - 1; y <= j - 1; y++) {
                arr[y] = k;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}