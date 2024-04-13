import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charr = sc.nextLine().toCharArray();
        int count = 0;
        int sum = 0;
        for (int i = 0; i < charr.length; i++) {
            if (charr[i] <= 67) {
                count = 2;
            } else if (charr[i] <= 70) {
                count = 3;
            } else if (charr[i] <= 73) {
                count = 4;
            } else if (charr[i] <= 76) {
                count = 5;
            } else if (charr[i] <= 79) {
                count = 6;
            } else if (charr[i] <= 83) {
                count = 7;
            } else if (charr[i] <= 86) {
                count = 8;
            } else if (charr[i] <= 90) {
                count = 9;
            }
            sum += count;
        }

        System.out.println(sum+charr.length);
    }
}