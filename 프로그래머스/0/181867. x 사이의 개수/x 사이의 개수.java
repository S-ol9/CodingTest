class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x", -1); // 구분된 문자열이 연속일 경우
        int[] answer = new int[str.length];
        
        for(int i = 0; i < str.length; i++) {
            answer[i] = str[i].length();
        }
        
        return answer;
    }
}