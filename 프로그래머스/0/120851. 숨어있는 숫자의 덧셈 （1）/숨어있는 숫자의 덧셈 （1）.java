import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        ArrayList <Integer> list = new ArrayList<>();

        for (int i = 0, j = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) { // 숫자인지 확인 (isDigit)
                list.add(Integer.parseInt(String.valueOf(my_string.charAt(i)))); // list에 추가
                answer += list.get(j);
                j++;
            }
        }
        return answer;
    }
}