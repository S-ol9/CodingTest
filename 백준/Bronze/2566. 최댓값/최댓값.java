import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
                max = Math.max(arr[i][j], max);

                if (arr[i][j] == max) {
                    num1 = i + 1;
                    num2 = j + 1;
                }
            }
            System.out.println();
        }
        System.out.println(max);
        System.out.print(num1 + " " + num2);
    }
}