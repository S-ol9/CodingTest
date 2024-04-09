import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int mul = A * B * C;
        int[] arr = new int[10];
        for (int i = 0; i < String.valueOf(mul).length(); i++) {
            arr[Character.getNumericValue(String.valueOf(mul).charAt(i))]++;
        }

        for (int e : arr) {
            System.out.println(e);
        }
    }
}