import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 앨범에 수록된 곡의 개수
        int I = sc.nextInt(); // 평균 값
        System.out.println(A * (I-1) + 1);
    }
}