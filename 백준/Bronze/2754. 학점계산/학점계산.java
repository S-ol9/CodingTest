import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        double A = 4.0;
        double B = 3.0;
        double C = 2.0;
        double D = 1.0;

        if (string.charAt(0) == 'A') {
            if (string.charAt(1) == '+') {
                A += 0.3;
            } else if (string.charAt(1) == '-') {
                A -= 0.3;
            }
            System.out.println(A);
        }
        if (string.charAt(0) == 'B') {
            if (string.charAt(1) == '+') {
                B += 0.3;
            } else if (string.charAt(1) == '-') {
                B -= 0.3;
            }
            System.out.println(B);
        }
        if (string.charAt(0) == 'C') {
            if (string.charAt(1) == '+') {
                C += 0.3;
            } else if (string.charAt(1) == '-') {
                C -= 0.3;
            }
            System.out.println(C);
        }
        if (string.charAt(0) == 'D') {
            if (string.charAt(1) == '+') {
                D += 0.3;
            } else if (string.charAt(1) == '-') {
                D -= 0.3;
            }
            System.out.println(D);
        }
        if (string.charAt(0) == 'F') {
            System.out.println("0.0");
        }
    }
}