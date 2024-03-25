import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            if (A.equals("#") && B == 0 && C == 0) {
                break;
            }
            if (B > 17 || C >= 80) {
                bw.write(A + " Senior" + "\n");
            } else {
                bw.write(A + " Junior" + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}