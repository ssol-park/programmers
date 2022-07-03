package lv1;

public class PrimeNumber {

    public int solution(int[] nums) {

        int answer = 0;

        for (int i = 0; i < nums.length; i++) {

            for(int j = i + 1; j < nums.length; j++) {

                for (int n = j + 1; n < nums.length; n++) {

                    int t = nums[i] + nums[j] + nums[n];

                    boolean b = true;

                    for(int k = 2; k < t; k++) {

                        if(t % k == 0) {
                            b = false;

                            break;
                        }
                    }

                    if(b) {
                        answer++;
                    }

                }
            }
        }

        return answer;
    }

}
