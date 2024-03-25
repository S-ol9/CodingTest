import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        if (S+K+H >=100) {
            bw.write("OK");
        } else if(S ==  Math.min(S, Math.min(K,H))) {
            bw.write("Soongsil");
        } else if (K ==  Math.min(S, Math.min(K,H))) {
            bw.write("Korea");
        } else {
            bw.write("Hanyang");
        }

        bw.flush();
        bw.close();
    }
}