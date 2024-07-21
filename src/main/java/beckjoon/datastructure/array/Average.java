package beckjoon.datastructure.array;

import java.util.Scanner;

/*
* 백준 1546
* 문제: 평균구하기
* */
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        long max = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            if(scores[i] > max) max = scores[i];

            sum += scores[i];
        }

        System.out.println(sum * 100.0 / max / n);
    }
}
