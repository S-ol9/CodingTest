import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int n_max = Integer.MIN_VALUE;
        int m_max = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());
        int temp = 0;
        for (int i = 0; i < N; i++) {
            temp = Integer.parseInt(st.nextToken());
            n_max = Math.max(n_max, temp);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            temp = Integer.parseInt(st.nextToken());
            m_max = Math.max(m_max, temp);
        }

        System.out.println(n_max + m_max);
    }
}