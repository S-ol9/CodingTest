import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String ans = "";

        if (str.equals("SONGDO")) {
            ans = "HIGHSCHOOL";
        } else if (str.equals("CODE")) {
            ans = "MASTER";
        } else if (str.equals("2023")) {
            ans = "0611";
        } else if (str.equals("ALGORITHM")) {
            ans = "CONTEST";
        }

        System.out.println(ans);
    }
}