import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N+1];

        for(int i = 1; i<=N; i++) {
            arr[i] = i;
        }

        for(int x =1; x<=M; x++) {
            st = new StringTokenizer(sc.nextLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int temp = 0;

            for (int y = 0; y < (j - i + 1) / 2; y++) {
                temp = arr[i + y];
                arr[i + y] = arr[j - y];
                arr[j - y] = temp;
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(arr[i] + "\n");
        }

    }
}