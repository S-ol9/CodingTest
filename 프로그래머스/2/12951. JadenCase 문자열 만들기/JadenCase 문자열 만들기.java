class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean check = true;
        
        for(char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                check = true;
            } else if (check) {
                sb.append(Character.toUpperCase(c));
                check = false;
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        
        return sb.toString();
    }
}