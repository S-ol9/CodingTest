import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int answer = x;
        if (y < answer) {
            answer = y;
        }
        if (w - x < answer) {
            answer = w - x;
        }
        if (h - y < answer) {
            answer = h - y;
        }
        System.out.println(answer);
    }
}