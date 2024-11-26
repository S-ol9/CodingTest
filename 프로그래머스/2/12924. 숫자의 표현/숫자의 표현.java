class Solution {
    public int solution(int n) {
        int cnt = 0;
        
        // n까지 횟수
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            
            // 각 연속하는 자연수끼리의 합
            for(int j = i; j <= n; j++) {
                sum += j;
                
                if(sum == n) {
                    cnt++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        
        return cnt;
    }
}