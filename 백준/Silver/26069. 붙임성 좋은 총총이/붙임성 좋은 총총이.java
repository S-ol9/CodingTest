import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        StringTokenizer st;
        String A, B;

        HashSet<String> user = new HashSet<>();
        user.add("ChongChong");
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(sc.nextLine());
            A = st.nextToken();
            B = st.nextToken();

            if (user.contains(A) || user.contains(B)) {
                user.add(A);
                user.add(B);
            }
        }
        System.out.println(user.size());
    }
}