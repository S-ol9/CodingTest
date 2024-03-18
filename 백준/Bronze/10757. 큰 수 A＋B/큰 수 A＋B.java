import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        System.out.println(A.add(B));

        // long보다 더 큰 수 담을 때.
        // BigInteger는 따로 메소드를 사용하여 연산해야 한다.
    }
}