import java.util.HashSet;

class Solution {
    public String solution(String my_string, int[] indices) {
        HashSet<Integer> arr = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i : indices) { // 빠른 검색 HashSet
            arr.add(i);
        }

        for (int i = 0; i < my_string.length(); i++) {
            if (!arr.contains(i)) { // indices의 원소에 해당하지 않으면 추가
                sb.append(my_string.charAt(i));
            }
        }
        
        return sb.toString();
    }
}
