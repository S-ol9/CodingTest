import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int count = 1;
        int now = 1;
        while (N > count) { 
            count += now * 6; // 한 레이어 누적하기
            now++;
        }
        System.out.println(now);
    }
}