import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long C;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());

        System.out.println(pow(A, B));
    }

    public static long pow(long A, long B) {
        if (B == 1) { // 지수 1
            return A % C;
        }
        long ans = pow(A, B / 2); // 지수를 반으로 나눈다.
        if (B % 2 == 1) { // 지수가 홀수라면? A 한 번 더 추가
            return (ans * ans) % C * A % C;
        }

        return (ans * ans) % C;
    }
}