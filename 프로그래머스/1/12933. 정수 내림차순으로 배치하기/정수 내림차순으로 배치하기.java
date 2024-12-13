import java.util.*;

class Solution {
    public long solution(long n) {
        char[] arr = Long.toString(n).toCharArray();
        
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder(new String(arr));
        sb.reverse();
        
        return Long.parseLong(sb.toString());
    }
}