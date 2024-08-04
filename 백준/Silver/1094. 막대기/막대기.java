import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int stick = 64;
        int cnt = 0;

        while (X > 0) {
            if (X < stick) {
                stick /= 2;
            } else {
                X -= stick;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}