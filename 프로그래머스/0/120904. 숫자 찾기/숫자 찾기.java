class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        char[] arr = String.valueOf(num).toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            if((arr[i] - '0') == k) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}