import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<String> input = new HashSet<>(); // 중복값 받지 않음
        int count = 0;
        int N = Integer.parseInt(br.readLine());

        while(N --> 0) { // N이 0이 되는 동안,
            String st = br.readLine();

            if(st.equals("ENTER")) {
                count += input.size();
                input.clear();
                continue;
            }

            input.add(st);
        }

        count += input.size();

        br.close();
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}