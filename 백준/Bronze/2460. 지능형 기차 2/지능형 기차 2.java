import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int max = 0;
        for(int i =0; i< 10; i++) {

            int out = sc.nextInt();
            int in = sc.nextInt();
            num = num - out + in;
            max = Math.max(num, max);
        }
        System.out.println(max);
    }
}