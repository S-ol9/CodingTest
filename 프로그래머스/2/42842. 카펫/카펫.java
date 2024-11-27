class Solution {
    public int[] solution(int brown, int yellow) {
        int totalSize = brown + yellow;
        
        int[] arr = new int[2];
        
        // 가로 * 세로 = 노란 색의 개수가 나와야 함 => 약수
        for(int i = 1; i * i <= yellow; i++) {
            if( yellow % i == 0 ) { // 약수이면
                int weight = yellow / i;
                
                if((weight + 2) * (i + 2) == totalSize) {
                    arr[0] = weight + 2;
                    arr[1] = i + 2;
                    return arr;
                }
            }
        }
        
        return arr;
    }
}