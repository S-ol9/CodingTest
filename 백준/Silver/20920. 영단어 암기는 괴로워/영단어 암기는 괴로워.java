import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() >= M) {
                map.put(word, map.getOrDefault(word, 0) + 1); // 같은 단어가 있을 경우 +1
            }
        }

        List<String> list = new ArrayList<>(map.keySet()); // 리스트에 단어 넣기

        list.sort((o1, o2) -> {
            int num1 = map.get(o1);
            int num2 = map.get(o2);

            if (num1 == num2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 알파벳 순
                }
                return o2.length() - o1.length(); // 단어가 길수록 앞
            }
            return num2 - num1; // 빈도 수 높은 단어 앞
        });

        for (String i : list) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}