package beckjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Greedy {

    public static void main(String[] args) {

    }

    /*
     * 동전 개수의 최솟값 구하기
     * 입력값 n = 10, k = 4200
     * 코인가격 prices = {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000
     * */
    public static void beck11047() {
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

    /*
     * 카드 정렬하기
     * 카드 묶음 수 n =3
     * 카드 묶음 크기 cards = {10, 20, 40}
     * */
    public static void beck1715() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            queue.add(scanner.nextInt());
        }

        int sum = 0;
        int firstBundle = 0;
        int secBundle = 0;

        while(queue.size() != 1) {
            firstBundle = queue.remove();
            secBundle = queue.remove();

            sum += firstBundle + secBundle;

            queue.add(sum);
        }

        System.out.println(sum);
    }
}
