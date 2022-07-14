package lv1;

import java.util.ArrayList;
import java.util.List;

public class FailureRate {

    public int[] solution(int N, int[] stages) {

        int[] answer = new int[N];

        double users = stages.length;

        List<double[]> failureRates = new ArrayList<>();

        int cnt = 0;

        for (int i = 1; i <= N; i++) {

            for (int j = 0; j < stages.length; j++) {

                if(i == stages[j]) {
                    cnt++;
                }

            }

            if(cnt == 0) {
                failureRates.add(new double[]{i, 0});
                continue;
            }

            failureRates.add(new double[]{i, cnt/users});

            users -= cnt;

            cnt = 0;
        }

        failureRates.sort((a, b) -> Double.compare(b[1], a[1]));

        for (int i = 0; i < failureRates.size(); i++) {

            answer[i] = (int) failureRates.get(i)[0];

        }

        return answer;
    }

}
