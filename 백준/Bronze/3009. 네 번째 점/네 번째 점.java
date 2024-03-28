import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int x = 0;
        int y = 0;

        if(a1 == b1 && a1 != c1) {
            x = c1;
        } else if ( b1 == c1 && a1 != c1) {
            x = a1;
        } else if ( a1 == c1 && a1 != b1) {
            x = b1;
        }

        if(a2 == b2 && a2 != c2) {
            y = c2;
        } else if ( b2 == c2 && a2 != c2) {
            y = a2;
        } else if ( a2 == c2 && a2 != b2) {
            y = b2;
        }

        System.out.println(x + " " + y);
    }
}