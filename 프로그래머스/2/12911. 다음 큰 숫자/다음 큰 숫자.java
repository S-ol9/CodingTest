class Solution {
    public int solution(int n) {
        // n의 다음 큰 숫자 정의
        
        int countOne = Integer.bitCount(n);
        int compareNum = n+1;
        
        while(Integer.bitCount(compareNum) != countOne) {
            // 두 값이 같지 않으면 값 증가 => 같은 값 찾기
            compareNum++;
        }
        
        return compareNum;
    }
}