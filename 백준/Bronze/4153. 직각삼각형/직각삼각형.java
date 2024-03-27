import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        while (true) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            Arrays.sort(arr);
            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }

            if (arr[2] * arr[2] == arr[0] * arr[0] + arr[1] * arr[1]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}