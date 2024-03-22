import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            String in = br.readLine();
            String out = "";
            for (int j = M-1; j >= 0; j--) {
                out += String.valueOf(in.charAt(j));
            }
            bw.write(out + "\n");
        }

        bw.flush();
        bw.close();
    }
}