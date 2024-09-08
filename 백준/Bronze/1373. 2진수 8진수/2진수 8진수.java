import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        BigInteger N = new BigInteger(str, 2); // 받은 값 2진수로 변환
        
        String ans = N.toString(8); // 2 -> 8진수로 변환 

        System.out.println(ans);
    }
}