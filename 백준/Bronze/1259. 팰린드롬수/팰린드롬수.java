import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();while (true) {
            String st = br.readLine();

            if (st.equals("0")) break;

            StringBuilder sb = new StringBuilder(st);
            String rst = String.valueOf(sb.reverse());

            if (st.equals(rst)) {
                ans.append("yes").append("\n");
            } else {
                ans.append("no").append("\n");
            }
        }
        System.out.println(ans);
    }
}