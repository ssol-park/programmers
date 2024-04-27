package beckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Back11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
            int firstAbs = Math.abs(a);
            int secondAbs = Math.abs(b);

            if(firstAbs == secondAbs)
                return a > b ? 1 : -1;
            else
                return firstAbs - secondAbs;
        });

        for (int i = 0; i < N; i++) {
            int request = Integer.parseInt(br.readLine());

            if(request == 0) {
                if(queue.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(queue.poll());
            }else {
                queue.add(request);
            }
        }
    }
}
