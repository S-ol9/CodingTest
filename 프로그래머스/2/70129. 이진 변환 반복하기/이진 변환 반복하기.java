class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        // 변환 횟수, 0 개수 기록
        
        while (s.length() > 1) {
            int count = 0;
            
            // s 길이까지 0인 개수 count
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') answer[1]++;
                else count++;
            }
            // 1 개수 카운트해서 해당 값 이진 변환
            s = Integer.toBinaryString(count);
            
            // 변환 횟수 증가
            answer[0]++;
        }
        
        return answer;
    }
}