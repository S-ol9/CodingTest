class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        int i = 0;
        while ( n != 0 ) {
            answer[i] = (int)(n % (long) 10);
            
            n /= 10;
            i++;
        }
        return answer;
    }
}