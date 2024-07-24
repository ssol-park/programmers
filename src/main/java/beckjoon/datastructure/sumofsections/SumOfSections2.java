package beckjoon.datastructure.sumofsections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 백준 11660
 * 문제: 구간 합 구하기 5
 * */
public class SumOfSections2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arraySize = Integer.parseInt(st.nextToken());
        int questionCnt = Integer.parseInt(st.nextToken());

        int[][] array = new int[arraySize + 1][arraySize + 1];

        for (int i = 1; i <= arraySize; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= arraySize; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] sumArray = new int[arraySize + 1][arraySize + 1];

        for (int i = 1; i <= arraySize; i++) {
            for (int j = 1; j <= arraySize ; j++) {
                sumArray[i][j] = sumArray[i][j - 1] + sumArray[i - 1][j] - sumArray[i - 1][j - 1] + array[i][j];
            }
        }

        for (int i = 0; i < questionCnt; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = sumArray[x2][y2] - sumArray[x1 - 1][y2] - sumArray[x2][y1 - 1] + sumArray[x1 - 1][y1 - 1];

            System.out.println(result);
        }
    }
}
