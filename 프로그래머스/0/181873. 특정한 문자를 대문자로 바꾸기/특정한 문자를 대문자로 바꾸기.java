class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            answer.append(ch==alp.charAt(0) ? Character.toUpperCase(ch) : ch);
        }
        
        return answer.toString();
    }
}
