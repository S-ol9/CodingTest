import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int B = Integer.parseInt(br.readLine());
        System.out.println(B - B / 11); // 총 금액 - 부가가치세 => 원금액
        // B * 10 / 11 과 동일한 결과
    }
}