import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        int count = 0;
        while(!(line = br.readLine()).equals("#")) {
            line = line.toLowerCase();
            for(int i =0; i<line.length(); i++) {
                if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u') {
                    count++;
                }
            }
            bw.write(count + "\n");
            count = 0;
        }
        bw.flush();
        bw.close();
    }
}