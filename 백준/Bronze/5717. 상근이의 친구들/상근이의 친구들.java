import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = 0;
            int f1 = Integer.parseInt(st.nextToken());
            int f2 = Integer.parseInt(st.nextToken());
            if(f1 == 0 && f2 == 0) {
                break;
            }
            count = f1 +f2;
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }
}