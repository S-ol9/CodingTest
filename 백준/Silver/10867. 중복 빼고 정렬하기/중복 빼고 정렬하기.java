import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> hs = new HashSet<>();
        for(int i= 0; i < N; i++) {
            hs.add(Integer.valueOf(st.nextToken()));
        }

        List<Integer> list = new ArrayList<>(hs);
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(Integer i : list) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }

}