class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        for(int i = n; i < num_list.length; i++) {
            answer[i - n] = num_list[i];
        }
        
        for(int i = answer.length - n, j = 0; i < num_list.length; i++, j++) {
            answer[i] = num_list[j];
        }
        
        return answer;
    }
}