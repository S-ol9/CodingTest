import java.util.*;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        StringTokenizer st = new StringTokenizer(binomial);
        
        int A = Integer.parseInt(st.nextToken());
        String op = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        
        switch (op) {
            case "+":
                answer = A + B;
                break;
            case "-":
                answer = A - B;
                break;
            case "*":
                answer = A * B;
                break;
        }
        
        return answer;
    }
}