import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        arr = Arrays.stream(arr).sorted().toArray();
        for(int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}