import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        HashSet<String> hset = new HashSet<>();

        for (int i = 0; i < N; i++) {
            hset.add(sc.nextLine());
        }

        List<String> list = new ArrayList<>(hset);

        // 해당 메소드를 사용할 때는 정렬이 가능한 타입으로 변환 HashSet XX
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int s1 = o1.length();
                int s2 = o2.length();
                if (s1 > s2) return 1; //위치 바꿈
                else if (s1 < s2) return -1; // 위치 그대로
                else { // 사전식 비교
                    int result = o1.compareTo(o2);
                    return result;
                }
            }
        });

        for (String str : list) {
            System.out.println(str);
        }
    }
}