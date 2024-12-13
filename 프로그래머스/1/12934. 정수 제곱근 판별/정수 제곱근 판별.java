class Solution {
    public long solution(long n) {
        long answer = -1;
        long sqrt = (long)Math.sqrt(n);
        // Math.sqrt는 double형 반환하므로 강제 형변환 후 정수부분만 비교
        if(sqrt * sqrt == n) {
            answer = (sqrt + 1) * (sqrt + 1);
        }
        
        return answer;
    }
}