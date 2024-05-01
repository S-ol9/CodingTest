import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] st = new String[20][3];
        HashMap<String, Double> grade = new HashMap<>();
        grade.put("A+", 4.5);
        grade.put("A0", 4.0);
        grade.put("B+", 3.5);
        grade.put("B0", 3.0);
        grade.put("C+", 2.5);
        grade.put("C0", 2.0);
        grade.put("D+", 1.5);
        grade.put("D0", 1.0);
        grade.put("F", 0.0);

        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            st[i][0] = input[0];
            st[i][1] = input[1];
            st[i][2] = input[2];
        }

        double one = 0.0;
        double sum = 0.0;
        // 전공 평점 => 학점 X 과목 평점
        for (int i = 0; i < st.length; i++) {
            if (st[i][2].equals("P")) {
                continue;
            }
            one += Double.parseDouble(st[i][1]) * grade.get(st[i][2]);
            sum += Double.parseDouble(st[i][1]);
        }
        double aver = one / sum;
        System.out.printf("%.6f", aver);
    }

}