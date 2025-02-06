class Solution {
    public int solution(String my_string, String is_prefix) {
        
        if(my_string.length() < is_prefix.length()) return 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.substring(0, i).equals(is_prefix)) return 1; 
        }
        
        return 0;
    }
}