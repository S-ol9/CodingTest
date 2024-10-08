import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = (int) (N * 0.78);
        int b = (int) (N * 0.8 + (N * 0.2) * 0.78 );

        sb.append(a).append(" ").append(b);
        System.out.println(sb);
    }
}