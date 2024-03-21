import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a1 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int a3 = Integer.parseInt(br.readLine());

        if (a1 == 60 && a1 == a2 && a2 == a3) {
            bw.write("Equilateral");
        } else if (a1 + a2 + a3 == 180 && (a1 == a2 || a2 == a3 || a1 == a3)) {
            bw.write("Isosceles");
        } else if (a1 + a2 + a3 == 180) {
            bw.write("Scalene");
        } else {
            bw.write("Error");
        }
        bw.flush();
        bw.close();
    }
}