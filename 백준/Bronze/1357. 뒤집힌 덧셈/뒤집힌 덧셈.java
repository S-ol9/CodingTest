import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int revX = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
        int revY = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());

        int ans = Integer.parseInt(String.valueOf(new StringBuffer(String.valueOf(revX + revY)).reverse()));

        System.out.println(ans);
    }
}