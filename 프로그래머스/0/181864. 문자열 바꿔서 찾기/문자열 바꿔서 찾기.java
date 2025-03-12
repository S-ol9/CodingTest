class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'A') sb.append('B');
            else sb.append('A');
        }
        
        answer = sb.toString().contains(pat) ? 1 : 0;
        
        return answer;
    }
}