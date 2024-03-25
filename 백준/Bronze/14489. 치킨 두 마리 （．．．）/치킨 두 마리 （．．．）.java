import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int C = sc.nextInt();

        if (A + B >= C * 2) {
            System.out.println(A + B - C * 2);
        } else {
            System.out.println(A + B);
        }
    }
}