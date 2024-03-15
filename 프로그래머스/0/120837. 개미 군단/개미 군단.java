class Solution {
    public int solution(int hp) {
        int answer = 0;
        if (hp % 5 == 0) {
            answer = hp / 5;
        } else {
            if ((hp % 5) > 3) {
                answer = hp / 5 + (hp % 5) / 3 + ((hp % 5) / 3) / 1;
            } else if ((hp % 5) == 3) {
                answer = hp / 5 + (hp % 5) / 3;
            } else {
                answer = hp / 5 + (hp % 5) / 1;
            }
        }
        // answer = (hp/5) + ((hp%5) / 3) + ((hp%5) % 3); 한 줄로 끝낼 수 있음
        return answer;
    }
}
