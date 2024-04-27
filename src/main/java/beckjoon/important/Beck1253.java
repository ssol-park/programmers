package beckjoon.important;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beck1253 {
    public static void main(String[] args) throws IOException {


        int n = 10;
        int[] arr = {1,7,9,4,6,5,2,8,3,10};

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int result = 0;

        for (int k = 1; k <= n; k++) {
            int i = 0;
            int j = n - 1;

            System.out.println("k = " + k);
            while (i < j) {
                int num = arr[i] + arr[j];
                System.out.println("num = " + num);
                if(num == k) {
                    if(i != k && j != k) {
                        result++;
                        break;
                    }
                    if(i == k) {
                        i++;
                    }
                    if(j == k) {
                        j--;
                    }
                }
                if(num > k) {
                    j--;
                }
                if(num < k) {
                    i++;
                }
            }
        } // end for

        System.out.println("result:" + result);
    }

   /* solved
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

        System.out.println(cnt);*/
}
