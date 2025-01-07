class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        
        for(int i = 2; i <= number; i++) {
            if(number % n == 0 && number % m == 0) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}