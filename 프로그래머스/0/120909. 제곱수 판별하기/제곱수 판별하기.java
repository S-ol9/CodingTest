class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = (int)Math.sqrt(n);
        if( n == num*num ) {
            answer = 1;
        } else { answer = 2; }
        return answer;
    }
}