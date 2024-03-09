class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        for(int i = 0; i < str1.length(); i++) {
            if(str1.contains(str2)) {
                answer = 1;
            } else { answer = 2; }
        }
        return answer;
    }
}