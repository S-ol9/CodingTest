import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ys = 0;
        int ms = 0;

        for (int i = 0; i < N; i++) {
            int call = Integer.parseInt(st.nextToken());
            ys += ((call / 30) + 1) * 10;
            ms += ((call / 60) + 1) * 15;
        }

        StringBuilder sb = new StringBuilder();
        if (ys > ms) { // 민식 요금제가 더 저렴할 경우
            sb.append("M ").append(ms);
        } else if ( ys == ms ) {
            sb.append("Y M ").append(ms);
        } else {
            sb.append("Y ").append(ys);
        }

        System.out.println(sb);
    }
}