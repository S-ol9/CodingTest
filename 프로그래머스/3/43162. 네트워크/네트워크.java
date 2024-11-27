class Solution {
    private boolean[] check; // 방문 여부
    public int solution(int n, int[][] computers) {
        check = new boolean[n];
        int count = 0; // 네트워크 개수

        for (int i = 0; i < n; i++) {
            if (!check[i]) { // 방문 X 일 경우,
                dfs(i, computers);
                count++;
            }
        }
        
        return count; // 네트워크 개수 반환
    }

    private void dfs(int node, int[][] computers) {
        check[node] = true; // 현재 노드 방문 처리

        for (int i = 0; i < computers.length; i++) {
            if (computers[node][i] == 1 && !check[i]) {
                // 연결되어 있으며, 방문하지 않은 노드
                // 방문했을 경우에는 굳이 재탐색하지 않음.
                dfs(i, computers);
            }
        }
    }
}