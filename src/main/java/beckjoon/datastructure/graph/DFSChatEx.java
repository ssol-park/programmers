package beckjoon.datastructure.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFSChatEx {
    static int N, M;
    static int[][] maze;
    static boolean[][] visited;
    static int minDistance = Integer.MIN_VALUE;

    // 이동 방향 (상, 하, 좌, 우)
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        maze = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();

            for (int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        dfs(0, 0, 1); // 시작점 0,0 / 이동거리 1
    }

    private static void dfs(int x, int y, int distance) {

        // 종료 조건
        if (x == N - 1 && y == M - 1) {
            minDistance = Math.min(minDistance, distance);
            return;
        }

        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = dx[i];
            int ny = dy[i];

            // nx, ny 가 범위 내에 있고, 방문하지 않은경우
            if (nx >= 0 && ny >= 0 && nx < N && ny < M
                    && maze[nx][ny] == 1 && !visited[nx][ny] == false) {
                dfs(nx, ny, distance + 1);
            }
        }

        // 백트래킹 (다른 경로 탐색을 위해 방문 해제)
        visited[x][y] = false;
    }
}
