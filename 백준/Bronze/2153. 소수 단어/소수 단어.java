import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int sum = 0;
        boolean bool = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sum += (int) c - 96;
            } else if (c >= 'A' && c <= 'Z') {
                sum += (int) c - 38;
            }
        }

        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                bool = true;
                break;
            }
        }
        String answer = bool ? "It is not a prime word." : "It is a prime word.";
        System.out.print(answer);
    }
}