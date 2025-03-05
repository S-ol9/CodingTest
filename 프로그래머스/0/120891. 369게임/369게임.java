class Solution {
    public int solution(int order) {
        int answer = 0;
        
        for(char c : String.valueOf(order).toCharArray()) {
            int num = c - '0';
            if( num != 0 && num % 3 == 0 ) answer += 1;
        }
        
        return answer;
    }
}