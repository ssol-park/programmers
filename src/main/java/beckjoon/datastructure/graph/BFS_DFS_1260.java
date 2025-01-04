package beckjoon.datastructure.graph;

import java.util.*;

public class BFS_DFS_1260 {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int N, M, start;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();  // 노드 수
        M = sc.nextInt();  // 간선 수
        start = sc.nextInt();

        start = sc.nextInt();  // 시작 노드
        visited = new boolean[N + 1];

        // 그래프 초기화
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        dfs(start);
        System.out.println();

        Arrays.fill(visited, false);

        bfs(start);
    }

    private static void bfs(int start) {
         Queue<Integer> queue = new LinkedList<>();
         queue.add(start);
         visited[start] = true;

         while (!queue.isEmpty()) {
             int node = queue.poll();

             System.out.println(node + " ");

             for (int next : graph.get(node)) {
                 if (!visited[next]) {
                     visited[next] = true;
                     queue.add(next);
                 }
             }
         }
    }

    private static void dfs(int node) {
        visited[node] = true;

        System.out.println(node + " ");

        for (int next : graph.get(node)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
