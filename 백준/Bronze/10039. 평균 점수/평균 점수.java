import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        for(int i =0; i<5; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a < 40) {
                a = 40;
            }
            answer += a;
        }
        answer /= 5;

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}