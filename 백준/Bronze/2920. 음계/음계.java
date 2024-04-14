import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] c = sc.nextLine().split(" ");
        int[] arr = new int[c.length];

        for (int i = 0; i < c.length; i++) {
            arr[i] = Integer.parseInt(c[i]);
        }

        int acount = 0;
        int bcount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] == -1) {
                acount++;
            } else if (arr[i] - arr[i + 1] == 1) {
                bcount++;
            }
        }

        if (acount >= 7) {
            System.out.println("ascending");
        } else if (bcount >= 7) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}