import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char alpa = br.readLine().charAt(0);

        System.out.println((alpa == 'N' || alpa == 'n') ? "Naver D2" : "Naver Whale");
    }
}