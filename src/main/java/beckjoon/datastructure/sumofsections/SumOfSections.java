package beckjoon.datastructure.sumofsections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 백준 11659
 * 문제: 구간 합 구하기 4
 * */
public class SumOfSections {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numberSize = Integer.parseInt(st.nextToken());
        int questionCnt = Integer.parseInt(st.nextToken());

        long[] sumArray = new long[numberSize + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= numberSize; i++) {
            sumArray[i] = sumArray[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < questionCnt; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            System.out.println(sumArray[end] - sumArray[start - 1]);
        }
    }
}
