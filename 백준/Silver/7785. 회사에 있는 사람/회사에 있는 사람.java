import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        HashMap<String, String> hm = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            String name = st.nextToken();
            String check = st.nextToken();

            if (hm.containsKey(name)) {
                hm.remove(name);
            } else {
                hm.put(name, check);
            }
        }

        ArrayList<String> arr = new ArrayList<String>(hm.keySet());
        // keySet을 ArrayList로
        Collections.sort(arr, Collections.reverseOrder()); // 내림차순

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}