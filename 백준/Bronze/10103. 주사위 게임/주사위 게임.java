import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int chang = 100;
        int sang = 100;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int chang1 = Integer.parseInt(st.nextToken());
            int sang1 = Integer.parseInt(st.nextToken());

            if(chang1 > sang1) sang -= chang1;
            else if(sang1 > chang1) chang -= sang1;

        }

        System.out.println(chang);
        System.out.println(sang);
    }
}