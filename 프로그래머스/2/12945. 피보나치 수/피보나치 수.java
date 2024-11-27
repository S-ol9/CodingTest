class Solution {
    public int solution(int n) {
        final int num = 1234567;
        
        int f1 = 0;
        int f2 = 1;
        int next = 0;
        
        for(int i = 2; i <= n; i++) {
            next = (f1 + f2) % num;
            
            f1 = f2;
            f2 = next;
        }
        
        return  next;
    }
}