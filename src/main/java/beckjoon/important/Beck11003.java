package beckjoon.important;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

@Slf4j
public class Beck11003 {
    public static void main(String[] args) throws IOException {
        log.info(" >>>>>> 입력");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int windowSize = Integer.parseInt(st.nextToken());
        int[] result = new int[n];
        Deque<Integer> deque = new LinkedList<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);

        log.info("??? {} ", deque.pollLast());

        log.info(">>>> 숫자 입력");
        for (int i = 0; i < n; i++) {
            br = new BufferedReader(new InputStreamReader(System.in));

            int num = Integer.parseInt(br.readLine());
            log.info(">>>> 입력 값: {}", num);

            if(!deque.isEmpty() && deque.getLast() > num) {
                deque.removeLast();
            }

            deque.addLast(num);
            result[i] = deque.getFirst();

            if(i - windowSize >= deque.size()) {
                deque.removeFirst();
            }
        }

        log.info("result :: {}", Arrays.toString(result));
    }


    /* solved
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int l = Integer.parseInt(st.nextToken());
    Deque<Node> deque = new LinkedList<>();

    st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

        int now = Integer.parseInt(st.nextToken());

        while (!deque.isEmpty() && deque.getLast().value >= now) {
            deque.removeLast();
        }

        deque.addLast(new Node(i, now));

        if (deque.getFirst().idx <= i - l) {
            deque.removeFirst();
        }

        bw.write(deque.getFirst().value + " ");
    }

        bw.flush();
        bw.close();

    private static class Node {
        int idx;
        int value;

        public Node(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }
    }*/
}
