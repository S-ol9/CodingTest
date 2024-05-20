import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<String> has = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            has.add(str);
        }
        
        int count = 0;
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (has.contains(str)) {
                count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}