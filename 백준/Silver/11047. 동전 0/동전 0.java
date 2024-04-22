import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            int a = Integer.parseInt(sc.nextLine());
            arr.add(a);
        }
        
        int answer = 0;

        for(int i = arr.size() -1; i >= 0; i--) {
            if(arr.get(i) <= K) {
                answer += K / arr.get(i);
                K %= arr.get(i);
            }
        }
        System.out.println(answer);
    }
}