import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[5][15];
        int max = 0;
        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            arr[i] = str.toCharArray();
            max = Math.max(max, str.length());
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < arr[j].length && arr[j][i] != '\0') { // 빈 문자열일 경우
                    System.out.print(arr[j][i]);
                }
            }
        }

    }
}