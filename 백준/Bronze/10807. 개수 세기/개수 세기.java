import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            arr[i] = A;
        }
        int v = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (v == arr[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}