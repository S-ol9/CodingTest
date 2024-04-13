import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().toUpperCase();
        //65 - 91까지 A - Z
        int[] arr = new int[26];
        for (int i = 0; i < string.length(); i++) {
            arr[Integer.parseInt(String.valueOf(string.charAt(i) - 'A'))]++;
        }
        int max = -1;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        int count = 0;
        for (int e : arr) {
            if (max == e) {
                count++;
            }
        }
        if (count >= 2) {
            System.out.println("?");
        } else {
            System.out.print((char) (index + 65));
        }

    }
}