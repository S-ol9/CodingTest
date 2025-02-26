import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken()); // 12 ~ 16 점심
        int S = Integer.parseInt(st.nextToken()); // 0: 숱 X, 1: 술 O

        if((T>=12 && T <=16) && S == 0) {
            System.out.println(320);
        } else {
            System.out.println(280);
        }
    }
}