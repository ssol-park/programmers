package lv1;

import java.util.Arrays;

public class Budget {

    public boolean getDepartmentCount(int[] d, int departments, int budget) {

        int cnt = 0;

        for (int i = 0; i < departments; i++) {
            cnt += d[i];
        }

        if(cnt <= budget) {
            return true;
        }

        return false;
    }


    public int mySolution(int[] d, int budget) {
        int answer = 0;

        int departments = d.length;

        for (int i = 0; i < d.length; i++) {

            boolean result = getDepartmentCount(d, departments, budget);

            if(result) {
                answer = departments;
                break;
            }

            if(i == 0) Arrays.sort(d);

            departments--;
        }

        return answer;
    }

    public int othersSolution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];

            if (budget < 0) break;

            answer++;
        }

        return answer;
    }
}
