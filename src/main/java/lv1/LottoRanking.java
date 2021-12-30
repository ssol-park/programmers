package lv1;

public class LottoRanking {

    public int[] solution(int[] lottos, int[] win_nums) {

        int matchCount = 0;
        int zeroCount = 0;

        for(int i = 0; i < lottos.length; i++) {

            if(lottos[i] == 0) zeroCount++;

            for(int j = 0; j < win_nums.length; j++) {

                if(win_nums[j] == lottos[i]) {
                    matchCount++;
                    break;
                }
            }
        }

        return new int[] { getResult(zeroCount + matchCount), getResult(matchCount)};
    }

    public int getResult(int count) {
        return Math.min(7 - (count), 6);
    }

}
