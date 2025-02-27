import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        
        for(int n : arr) { // arr 원소 중
            if(!Arrays.stream(delete_list).anyMatch(i -> i == n)) {
                // delete_list 에 포함되지 않는다면 (현재 for 문을 비교하는 값)
                answer.add(n);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}