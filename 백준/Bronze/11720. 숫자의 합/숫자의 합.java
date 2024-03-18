import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        int num = 0;
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            a[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            num += a[i];
        }

        System.out.println(num);
    }
}