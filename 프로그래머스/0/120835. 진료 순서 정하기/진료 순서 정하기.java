import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] arr = emergency.clone(); // 배열 복사
        
        Arrays.sort(arr); // 오름차순
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < emergency.length; i++) {
            map.put(arr[i], emergency.length - i); // 오름차순된 배열의 값 삽입
            // 가장 작은 값 = 제일 마지막
        }
        
        int[] answer = new int[emergency.length];
        
        for(int i = 0; i < emergency.length; i++) {
            answer[i] = map.get(emergency[i]);
            // 배열 원소 값의 위치 반환
        }
        return answer;
    }
}