import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();

        long A = 300;
        long B = 60;
        long C = 10;

        long sA = T / A;
        long sB = (T % A) / B;
        long sC = ((T % A) % B) / C;
        if (T % A == 0) {
            sB = 0;
            sC = 0;
            System.out.println(sA + " " + sB + " " + sC);
        } else {
            if ((T % A) % B == 0) {
                System.out.println(sA + " " + sB + " " + sC);
            } else {
                if (((T % A) % B) % C == 0) {
                    System.out.println(sA + " " + sB + " " + sC);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}