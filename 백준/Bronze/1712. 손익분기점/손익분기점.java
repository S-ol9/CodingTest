import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 고정 비용
        int B = Integer.parseInt(st.nextToken()); // 가변 비용
        int C = Integer.parseInt(st.nextToken()); // 노트북 가격

        // 총 비용 = 고정비용 + (가변 비용 * 판매 대수)
        // 총 수입 = 노트북 가격 * 판매 대수
        if (C <= B) { // 판매 대수를 곱하는데 C가 B보다 작으면 손익분기점을 절대 넘길 수 없음.
            System.out.println(-1);
        } else { // 총 비용 = 총 수입 => 수식으로 변환
            System.out.println(A / (C - B) + 1);
        }
    }
}