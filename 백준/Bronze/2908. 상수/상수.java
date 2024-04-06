import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        sb1.append(sc.nextInt());
        sb2.append(sc.nextInt());

        int A = Integer.parseInt(sb1.reverse().toString());
        int B = Integer.parseInt(sb2.reverse().toString());

        System.out.println(Math.max(A, B));
    }
}