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

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 등장 횟수
                if (Integer.compare(map.get(o1), map.get(o2)) != 0) {
                    return Integer.compare(map.get(o2), map.get(o1));
                } // 내림차순

                // 등장 횟수가 같을 경우 길이가 긴 단어
                if (o1.length() != o2.length()) {
                    return o2.length() - o1.length();
                } // 내림차순

                // 등장 횟수가 같을 경우 사전 순
                return o1.compareTo(o2);
                // 오름차순
            }
        });

        for (String i : list) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}