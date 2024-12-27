class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int i = 0;
        while(true) {
            answer += numbers[i];
            if(answer > n) {
                break;
            }
            i++;
        }
        return answer;
    }
}