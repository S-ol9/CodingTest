import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken()); // 지구 (1 ~ 15)
        int S = Integer.parseInt(st.nextToken()); // 태양 (1 ~ 28)
        int M = Integer.parseInt(st.nextToken()); // 달 (1 ~ 19)

        int e = 0, s = 0, m = 0;
        int count = 0;
        while (true) {
            count++;
            e++;
            s++;
            m++;

            if (e == 16) e = 1;
            if (s == 29) s = 1;
            if (m == 20) m = 1;
            if (e == E && m == M && s == S) break;
        }
        System.out.println(count);
        // 1년이 지날 때마다 E, S, M ==> +1;

    }
}