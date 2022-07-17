package lv1;

public class FailureRate {

    public int[] solution(int N, int[] stages) {

        int[] answer = new int[N];
        double[] tempArr = new double[N];

        int stageLength = stages.length;
        int cnt = stageLength;

        double tempD = 0;
        int tempI = 0;

        for (int i = 0; i < stageLength; i++) {

            int stage = stages[i];

            if(stage <= N) {
                answer[stage - 1] += 1;
            }

        }
        // [0, 0, 0, 4]

        for (int i = 0; i < N; i++) {

            int users = answer[i];

            tempArr[i] = (double) users / cnt;

            cnt -= users;

            answer[i] = i + 1;
        }
        // [1, 2, 3, 4]

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N - i; j++) {

                if(tempArr[j - 1] < tempArr[j]) {

                    tempD = tempArr[j - 1];
                    tempArr[j - 1] = tempArr[j];
                    tempArr[j] = tempD;

                    tempI = answer[j - 1];
                    answer[j - 1] = answer[j];
                    answer[j] = tempI;
                }

            }
        }

        return answer;
    }

}
