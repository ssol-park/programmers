package beckjoon;

import java.util.Scanner;

public class Beck10986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long result = 0;

        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] nArray = new long[n];
        long[] mArray = new long[m];

        nArray[0] = sc.nextInt();

        for (int i = 1; i < n; i++) {
            nArray[i] = nArray[i - 1] + sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int remainder = (int) (nArray[i] % m);

            if(remainder == 0) result++;

            mArray[remainder]++;
        }

        for (int i = 0; i < m; i++) {
            if(mArray[i] > 1)
                result = result + (mArray[i] * (mArray[i] - 1) / 2);

        }

        System.out.println(result);
    }
}
