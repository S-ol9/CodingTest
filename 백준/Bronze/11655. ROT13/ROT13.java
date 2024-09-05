import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isAlphabetic(c)) {
                sb.append(c);
                continue;
            }

            int n = (int) c + 13;

            if (Character.isUpperCase(c) && n > 90 || Character.isLowerCase(c) && n > 122) {
                n -= 26;
            }
            sb.append((char) n);
        }

        System.out.println(sb);
    }
}