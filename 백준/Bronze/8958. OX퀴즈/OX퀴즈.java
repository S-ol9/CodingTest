import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String test = "";
        int count;
        int sum;
        for(int i = 0; i < N; i++) {
            count = 0;
            sum = 0;
            test = sc.next();
            for(int j = 0; j<test.length(); j++) {
                if(test.charAt(j) =='O') {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
