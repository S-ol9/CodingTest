import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] charr = br.readLine().toCharArray();
        ArrayList<Integer> iarr = new ArrayList<>();
        for(char e : charr) {
            iarr.add(Character.getNumericValue(e));
        }

        Collections.sort(iarr, Collections.reverseOrder());

        for(Integer e : iarr) {
            bw.write(e+"");
        }
        bw.flush();
        bw.close();
    }
}