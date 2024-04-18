import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> iarr = new ArrayList<>();

        for (int i = 1; i < 10000; i++) {
            iarr.add(i);
        }

        int n = 1;
        while (n < 10000) {
            String ntos = String.valueOf(n);
            int fsum = 0;

            for (int i = 0; i < ntos.length(); i++) {
                fsum += Character.getNumericValue(ntos.charAt(i));
            }

            int sum = n + fsum;
            int index = iarr.indexOf(sum);
            if (iarr.contains(sum)) {
                iarr.remove(index);
            }
            n++;
        }

        for (Integer e : iarr) {
            bw.write(e + "\n");
        }
        bw.flush();
        bw.close();
    }
}