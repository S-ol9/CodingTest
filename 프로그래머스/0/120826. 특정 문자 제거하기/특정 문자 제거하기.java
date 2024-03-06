class Solution {
    public String solution(String my_string, String letter) { 
        // 문자열 인덱스로 바로 접근 불가 char로 변경하기
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (!letter.equals(String.valueOf(my_string.charAt(i)))) {
                answer = answer + my_string.charAt(i);
            }
        }
        return answer;
    }
}