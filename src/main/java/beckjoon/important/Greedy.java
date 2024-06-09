package beckjoon.important;

import java.util.PriorityQueue;
import java.util.Scanner;

/*
* Beck11047
* */
public class Greedy {


    public static void main(String[] args) {
    }

    public static void beck11047() {
        /*
         * 동전 개수의 최솟값 구하기
         * 입력값 n = 10, k = 4200
         * 코인가격 prices = {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000
         * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        int coinCnt = 0;

        for (int i = n -1; i >= 0 ; i--) {
            if(prices[i] <= k) {
                coinCnt += k / prices[i];
                k = k % prices[i];
            }
        }

        System.out.println(coinCnt);
    }
}
