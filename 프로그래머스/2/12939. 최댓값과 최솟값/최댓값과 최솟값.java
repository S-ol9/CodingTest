import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(String num : str) {
            int n = Integer.parseInt(num);
            if(min > n) {
                min = n;
            };
            
            if(max < n) {
                max = n;
            };
        };
        
        return min + " " + max;
    };
};