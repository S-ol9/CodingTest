import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int A = sc.nextInt();

            arr[i] = A % 42;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int check = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    check++;
                }
            }
            if (check == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
