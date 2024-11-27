import java.util.*;

class Solution {
    public int solution(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(char c: s.toCharArray()) {
            if( !stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // 같으면 꺼내고
            } else {
                stack.push(c); // 다르면 넣는다.
            }
        }
        
        // 스택이 비어있으면 1, 아니면 0
        return stack.isEmpty() ? 1 : 0;
    }
}