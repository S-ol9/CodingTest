class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int index = 0;
        for(int i = 0; i < sides.length; i++) {
            if( max < sides[i] ) {
                max = sides[i];
                index = i;
            }
        }
        int[] ans = new int[2];
        for(int i = 0, j = 0; i < sides.length; i++) {
            if(i != index) {
                ans[j] = sides[i];
                j++;
            }
        }
        
        if(max < ans[0] + ans[1]) {
            answer = 1;
        } else { answer = 2; }
        return answer;
    }
}