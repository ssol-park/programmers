package lv1;

import java.util.Arrays;

public class NthNumber {

    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        int cnt = 0;

        for (int[] command : commands) {
            int i = command[0] - 1;
            int j = command[1];
            int k = command[2];

            int[] target = Arrays.copyOfRange(array, i, j);

            Arrays.sort(target);

            answer[cnt] = target[k - 1];

            cnt++;
        }

        return answer;
    }

}
