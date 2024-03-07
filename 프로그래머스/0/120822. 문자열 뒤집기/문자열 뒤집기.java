class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = my_string.length() - 1; i >=0; i--) {
            answer = answer + String.valueOf(my_string.charAt(i));
            // 문자열 각 자리마다 뽑아서 넣어주기
        }
        return answer;
    }
}