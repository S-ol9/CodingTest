public class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) { // 각 행마다 원소 개수 달라짐
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
                // i+1 : i 행 아래
            }
        }

        // 최댓값 리턴
        return triangle[0][0];
    }
}
