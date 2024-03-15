import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
            // 문자열과 조합이 아닌 경우 수식 자유롭게 작성
            // sc에 들어오는 값이 정수일 때만 true
        }
    }
}