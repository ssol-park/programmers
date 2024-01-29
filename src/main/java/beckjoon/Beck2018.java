package beckjoon;

import java.util.Scanner;

public class Beck2018 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int startIdx = 1, endIdx = 1, cnt = 1, sum = 1;

        while (endIdx != n) {

            if(sum < n) {
                endIdx++;
                sum += endIdx;
            }

            if(sum == n) {
                cnt++;
                endIdx++;
                sum += endIdx;
            }

            if(sum > n) {
                sum -= startIdx;
                startIdx++;
            }
        }

        System.out.println(cnt);
    }
}
