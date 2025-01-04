package beckjoon.datastructure.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFS_11724 {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void dfs(int node) {
        visited[node] = true;

        for (int i : graph.get(node)) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int A = 0;

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                dfs(i);
                A++;
            }

        }
    }
}
