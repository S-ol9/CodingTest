import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2) - Integer.parseInt(str3));
        System.out.println(Integer.parseInt(str1 + str2) - Integer.parseInt(str3));
    }
}