import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int min1 = 2000;

        for (int i = 0; i < 3; i++) {
            int N = Integer.parseInt(br.readLine());
            if (min1 > N) {
                min1 = N;
            }
        }

        int min2 = 2000;
        for (int i = 0; i < 2; i++) {
            int N = Integer.parseInt(br.readLine());
            if (min2 > N) {
                min2 = N;
            }
        }
        bw.write(min1 + min2 - 50 + "\n");
        bw.flush();
        bw.close();
    }
}