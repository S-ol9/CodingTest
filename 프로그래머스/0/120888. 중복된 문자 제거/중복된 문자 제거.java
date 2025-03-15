import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> arr = new LinkedHashSet<>();
        
        for(char c : my_string.toCharArray()) {
            if(arr.add(c)) { // LinkedHashSet은 중복 불가
                sb.append(c);
            }
        }
        return sb.toString();
    }
}