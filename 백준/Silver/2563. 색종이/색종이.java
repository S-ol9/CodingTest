import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int count = 0;
        boolean[][] arr = new boolean[100][100];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!arr[j][k]) { // false면
                        arr[j][k] = true;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}