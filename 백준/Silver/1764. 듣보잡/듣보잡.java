import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> hset = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String string = br.readLine();
            hset.add(string);
        }

        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String string = br.readLine();
            if (hset.contains(string)) {
                answer.add(string);
            }
        }

        bw.write(answer.size() + "\n");
        Collections.sort(answer);
        for (String s : answer) {
            bw.write(s + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
