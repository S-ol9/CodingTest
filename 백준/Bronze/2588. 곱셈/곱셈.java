import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();

        for(int i = 2; i>=0; i--) {
            int c = a * Integer.parseInt(String.valueOf(b.charAt(i)));
            System.out.println(c);
        }
        System.out.println(a * Integer.parseInt(b));
    }
}