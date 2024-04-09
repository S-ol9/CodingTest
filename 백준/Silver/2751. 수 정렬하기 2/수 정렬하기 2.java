import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long N = Long.parseLong(br.readLine());

        ArrayList<Long> arrlong = new ArrayList<>();

        for(long i = 0; i < N; i++) {
            arrlong.add(Long.valueOf(br.readLine()));
        }

        Collections.sort(arrlong);

        for(long e : arrlong) {
            bw.write(e + "\n");
        }
        bw.flush();
        bw.close();
    }
}