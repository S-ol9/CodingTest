import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String str = (N % 2 == 1) ? "SK" : "CY"; // 홀수면 상근, 짝수면 찬영 승
        System.out.println(str);
    }
}