import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int answer = 0;
        if (A == B && B == C) {
            answer = 10000 + A * 1000;
        } else if (A == B || B == C || C == A) { // 세 개 다 같은건 이미 위에서 처리
            if (A == B) {
                answer = 1000 + A * 100;
            } else {
                answer = 1000 + C * 100;
            }
        } else {
            int max = 0;
            max = Math.max(A, (Math.max(B, C)));
            answer = max * 100;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}