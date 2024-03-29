import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N + 1];

        for (int o = 1; o < arr.length; o++) {
            arr[o] = o;
        }

        for (int x = 0; x < M; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int o = 1; o < arr.length; o++) {
            System.out.print(arr[o] + " ");
        }
    }
}
