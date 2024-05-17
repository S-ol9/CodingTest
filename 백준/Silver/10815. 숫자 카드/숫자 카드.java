import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        HashSet<Integer> aSet = new HashSet<>();
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        for (int i = 0; i < N; i++) {
            aSet.add(Integer.valueOf(st.nextToken()));
        }

        int M = Integer.parseInt(sc.nextLine());
        int[] b = new int[M];
        
        st = new StringTokenizer(sc.nextLine());

        for (int i = 0; i < M; i++) {
            if (aSet.contains(Integer.parseInt(st.nextToken()))) {
                b[i] = 1;
            } else {
                b[i] = 0;
            }
        } // HashSet은 포함 여부만 확인하면 된다.

        for (int e : b) {
            System.out.print(e + " ");
        }
    }
}