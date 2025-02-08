import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            if(Character.isDigit(my_string.charAt(i))) {
                list.add(my_string.charAt(i) - '0');
            }
        }
        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}