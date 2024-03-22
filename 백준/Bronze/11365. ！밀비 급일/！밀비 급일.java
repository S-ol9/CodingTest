import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;

        while (!(line = br.readLine()).equals("END")) {
            for (int i = line.length() - 1; i >= 0; i--) {
                String line2 = String.valueOf(line.charAt(i));
                bw.write(line2);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}