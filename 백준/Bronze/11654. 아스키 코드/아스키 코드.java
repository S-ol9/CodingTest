import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int num = (int)c;
        System.out.println(num);

        // 아스키코드 값으로 변환하기 위해 받은 값 변환 charAt();
        // 값을 int로 형변환
    }
}