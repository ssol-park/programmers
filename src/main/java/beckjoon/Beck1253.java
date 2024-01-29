package beckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beck1253 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] array = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        int cnt = 0;

        for (int k = 0; k < n; k++) {
            int target = array[k];
            int i = 0, j = n - 1;

            while (i < j) {

                int sum = array[i] + array[j];

                if(sum > target) {
                    j--;

                }else if(sum < target) {
                    i++;

                }else if(sum == target) {
                    if(i != k && j != k) { cnt++; break; }

                    else if(i == k) { i++; }

                    else if(k == k) { j--; }
                }
            }
        }

        System.out.println(cnt);
    }
}
