import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(A * B / gcd(A, B)).append("\n");
        }
        System.out.println(sb);
    }
    
    private static int gcd(int A, int B) {
        if (B == 0) {
            return A;
        } else {
            return gcd(B, A % B); // 나머지 값
        }
    }
}