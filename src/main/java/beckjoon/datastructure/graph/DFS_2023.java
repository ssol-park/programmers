package beckjoon.datastructure.graph;

import java.util.Scanner;

public class DFS_2023 {
    static int N;
    static int[] primeArray = new int[]{1, 3, 5, 7};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(6, 1);
    }

    private static void dfs(int num, int digit) {
        if (digit == N) {
            System.out.println(num);
            return;
        }

        for (int nextDigit : primeArray) {
            int nextNum = num * 10 + nextDigit;

            if (isPrime(nextNum)) {
                dfs(nextNum, digit + 1);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % 2 == 0)
                return false;
        }

        return true;
    }
}
