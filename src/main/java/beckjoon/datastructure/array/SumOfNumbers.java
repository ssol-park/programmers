package beckjoon.datastructure.array;

import java.util.Scanner;

/*
* 백준 11720
* 문제: 숫자의 합 구하기
* */
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String strNumbers = sc.next();

        char[] chars = strNumbers.toCharArray();

        int sum = 0;
        for (char num : chars) {
          sum += num - '0';
        }

        System.out.println(sum);
    }
}
