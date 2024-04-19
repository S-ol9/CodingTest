import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        sc.nextLine();
        int sum = 0;
        for (int i = 0; i < C; i++) {
            sum = 0;
            String[] st = sc.nextLine().split(" ");
            for (int j = 1; j < st.length; j++) {
                sum += Integer.parseInt(st[j]);
            }
            double average = (double) sum / Integer.parseInt(st[0]);
            int count = 0;
            for (int z = 1; z < st.length; z++) {
                if (average < Integer.parseInt(st[z])) {
                    count++;
                }
            }
            double upaver = (double) count / Integer.parseInt(st[0]) * 100;
            System.out.printf("%.3f%%\n", upaver);
        }
    }
}