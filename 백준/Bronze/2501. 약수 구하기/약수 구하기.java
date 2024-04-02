import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 1; i<=N; i++) {
            if (N%i == 0) {
                arr.add(i);
            }
        }
        if(arr.toArray().length < K) {
            System.out.println(0);
        } else {
            System.out.println(arr.get(K-1));
        }
    }
}