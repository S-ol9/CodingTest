import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String ans = "";

        if (str.equals("NLCS")) {
            ans = "North London Collegiate School";
        } else if (str.equals("BHA")) {
            ans = "Branksome Hall Asia";
        } else if (str.equals("KIS")) {
            ans = "Korea International School";
        } else if (str.equals("SJA")) {
            ans = "St. Johnsbury Academy";
        }

        System.out.println(ans);
    }
}