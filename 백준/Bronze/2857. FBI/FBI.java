import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= 5; i++) {
            String str = br.readLine();

            if(str.contains("FBI")) {
                sb.append(i).append(" ");
            }
        }

        if(sb.length() == 0) {
            sb.append("HE GOT AWAY!");
        }

        System.out.println(sb);
    }
}