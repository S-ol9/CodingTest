class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        char[] arr = String.valueOf(age).toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            sb.append((char) ('a' + (arr[i] - '0')));
        }
        return sb.toString();
    }
}