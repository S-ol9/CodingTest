import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int result = 0; // 결과
        int tmp = 1; // 가중치

        for (int i = N.length() - 1; i >= 0; i--) {
            char C = N.charAt(i);
            if (C >= 'A' && C <= 'Z') {
                result += (C - 'A' + 10) * tmp;
                // 10을 더해주는 이유는 숫자로 표현할 수 없는 자리는 10부터 시작하기 떄문
            } else {
                result += (C - '0') * tmp;
            }
            tmp *= B; //자릿수 변환
        }
        System.out.println(result);
    }
}