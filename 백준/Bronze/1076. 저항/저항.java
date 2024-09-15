import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> map = new HashMap<>() {{
            put("black", "0");
            put("brown", "1");
            put("red", "2");
            put("orange", "3");
            put("yellow", "4");
            put("green", "5");
            put("blue", "6");
            put("violet", "7");
            put("grey", "8");
            put("white", "9");
        }};

        String c1 = br.readLine();
        String c2 = br.readLine();
        String c3 = br.readLine();

        long ans = Long.parseLong(map.get(c1) + map.get(c2));
        ans *= Math.pow(10, Integer.parseInt(map.get(c3)));
        System.out.println(ans);
    }
}