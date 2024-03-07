class Solution {
    public int solution(int n) {
        int answer = 0;
        while(n!=0) {
            answer = answer + n%10; // n을 10으로 나눈 나머지
            n = n/10; // n을 10으로 나눈 몫
            System.out.println(answer);
        }
        return answer;
    }
}