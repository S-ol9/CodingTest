import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int ans = 10;
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == str.charAt(i - 1)) ans += 5;
            else ans += 10;
        }

        System.out.println(ans);
    }
}