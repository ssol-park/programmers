package beckjoon.important;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
* DFS(깊이 우선 탐색)
* 6 5
1 2
2 5
5 1
3 4
4 6
* */
@Slf4j
public class Beck11724 {
    static ArrayList<Integer>[] A;
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 노드 개수
        int m = Integer.parseInt(st.nextToken());   // 에지 개수

        A = new ArrayList[n + 1];       // 인접 리스트
        visited = new boolean[n + 1];   // 방문 리스트
        log.info("방문리스트 :: {}", Arrays.toString(visited));

        // 인접리스트 초기화
        for (int i = 1; i < n + 1; i++) {
            A[i] = new ArrayList<>();
        }
        log.info("인접리스트 초기화 :: {}", Arrays.toString(A));

        // 방향이 없는(양방향) 에지, 양쪽에 에지를 더한다
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e);
            A[e].add(s);
        }

        log.info("인접리스트 :: {}", Arrays.toString(A));

        // 방문하지 않은 노드가 없을 때 까지 반복
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if(!visited[i]) {
                count++;
                DFS(i);
            }
        }

        log.info("count:{}", count);
    }

    private static void DFS(int v) {
        log.info("DFS :: v{} isVisited:{} {}", v, visited[v], Arrays.toString(visited));
        if(visited[v]) {
            return;
        }

        visited[v] = true;
        for (int i : A[v]) {
            if(!visited[i]) {
                DFS(i);
            }
        }
    }
}
