import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[31]; // 길이 31의 배열

        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            arr[num]++;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
