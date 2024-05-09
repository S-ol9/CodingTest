import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        ArrayList<Character> arr = new ArrayList<>(); // 결과

        while (N > 0) { // N이 나눌 수 있는 경우
            if (N % B < 10) { // 나머지가 10보다 아래인 경우에는 그대로 사용
                arr.add((char) (N % B + '0')); //
            } else { // 클 경우에는 -10을 해주고 'A'를 더해줌
                arr.add((char) (N % B - 10 + 'A'));
            }
            // -10을 안하고 그대로 더해주면 해당 범위를 벗어난다.
            N /= B;
        }

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i));
        }
    }
}