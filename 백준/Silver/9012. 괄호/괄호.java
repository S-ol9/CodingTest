import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            StringBuffer sb = new StringBuffer(sc.nextLine());
            int j = 0;

            while (true) {
                if (j == sb.length() - 1 || sb.length() == 0) {
                    break;
                }

                if (sb.charAt(j) == '(') {
                    for (int z = j + 1; z < sb.length(); z++) {
                        if (sb.charAt(z) == ')') {
                            sb.deleteCharAt(z);
                            sb.deleteCharAt(j);
                            j = 0;
                            break;
                        } else if (z == sb.length() - 1) {
                            j++;
                        }
                    }
                } else {
                    j++;
                }
            }
            String answer = (sb.length() == 0) ? "YES" : "NO";

            System.out.println(answer);
        }

    }
}