import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String string = br.readLine();
        double answer = 0.0;

        char s0 = string.charAt(0);

        if (s0 == 'A') {
            answer = 4.0;
        } else if (s0 == 'B') {
            answer = 3.0;
        } else if (s0 == 'C') {
            answer = 2.0;
        } else if (s0 == 'D') {
            answer = 1.0;
        } else if (s0 == 'F') {
            answer = 0.0;
        }
        if (string.length() == 2) {
            char s1 = string.charAt(1);
            if (s1 == '+') {
                answer += 0.3;
            } else if (s1 == '-') {
                answer -= 0.3;
            }
        }
        
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}