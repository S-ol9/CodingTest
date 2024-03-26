import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken()); // 층 수
            int W = Integer.parseInt(st.nextToken()); // 방 수
            int N = Integer.parseInt(st.nextToken()); // 몇 번째 손님

            int Y = N % H;
            int X = N / H + 1;

            if (Y == 0) {
                Y = H;
                X = N/H;
            }
            bw.write(Y + "");

            if (X < 10) {
                bw.write("0");
            }
            bw.write(X + "\n");
        }
        bw.flush();
        bw.close();
    }
}