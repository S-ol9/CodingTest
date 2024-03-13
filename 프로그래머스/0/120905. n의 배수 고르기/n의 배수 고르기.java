import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0, j = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer.add(numlist[i]);
                j++;
            }
        }
        // ArrayList로 배열 길이 모를 때 사용한다.
        // 변경시 데이터 구조 타입도 같이 변경해줘야 함.
        return answer;
    }
}