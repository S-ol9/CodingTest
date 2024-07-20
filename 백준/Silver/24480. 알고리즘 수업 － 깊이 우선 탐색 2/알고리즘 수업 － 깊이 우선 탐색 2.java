import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 노드와 간선 표현 그래프
    static int[] visited; // 방문 노드 체크 배열
    static int count; // 방문 순서

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점 개수
        int M = Integer.parseInt(st.nextToken()); // 간선 개수
        int R = Integer.parseInt(st.nextToken()); // 처음 노드

        visited = new int[N + 1];

        // 첫 시작 -> 시작과 연결된 노드 중 가장 작은 숫자 탐색 -> 탐색한 숫자는 제외
        for (int i = 0; i <= N; i++) {
            // 각 노드별 빈 리스트 생성
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 0; i < graph.size(); i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        count = 1; // visted 배열과 혼동이 올 수 있음.
        dfs(R);

        // visited에 몇 번째로 출력되는지 출력 => 방문 순번!!
        for (int i = 1; i < visited.length; i++) {
            System.out.println(visited[i]);
        }

    }

    private static void dfs(int start) {
        visited[start] = count;
        for (int i = 0; i < graph.get(start).size(); i++) {
            int y = graph.get(start).get(i);

            if (visited[y] == 0) {
                count++;
                dfs(y);
            }
        }
    }
}
