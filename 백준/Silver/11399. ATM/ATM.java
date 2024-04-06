import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i< N; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);
        int min = 0;
        int sum = 0;

        for(int i = 0; i <arr.size(); i++) {
            min += arr.get(i);
            sum += min;
        }
        System.out.println(sum);
    }
}