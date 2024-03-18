import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        long max = 0;
        long sum = 0;
        for(int i =0; i<N; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
            sum += arr[i];
        }
        System.out.println((double)sum * 100 / max / N);
    }
}