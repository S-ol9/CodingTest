class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double ans = 0;
        ans = (double)num1/ num2 * 1000;
        answer = (int)ans;
        return answer;
    }
}