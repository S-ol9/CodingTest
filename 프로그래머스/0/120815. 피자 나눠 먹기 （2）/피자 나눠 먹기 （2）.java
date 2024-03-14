class Solution {
    public int solution(int n) {
        int answer = 0;
        int piece = 6;
        while(true) {
            if (piece % n == 0) {
                answer = piece / 6;
                break;
            } else {
                piece += 6;
            }
        }
        return answer;
    }
}