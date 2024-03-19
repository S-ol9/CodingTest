import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String str = sc.next();
            String[] arr = new String[2];
            arr[0] = String.valueOf(str.charAt(0));
            arr[1] = String.valueOf(str.charAt(str.length() - 1));
            System.out.println(arr[0] + arr[1]);
        }
    }
}