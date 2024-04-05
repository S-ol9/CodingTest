import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int s1 = N / 10;
        int s2 = N % 10;
        int sa = (s1 + s2) % 10;
        int comN = 0;
        int count = 1;
        while (true) {
            comN = Integer.parseInt(String.valueOf(s2) + String.valueOf(sa));
            sa = (s2 + sa) % 10;
            s2 = comN % 10;
            if (N == comN) {
                break;
            }
            count++;
        }

        System.out.println(count);
    }
}