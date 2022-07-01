package lv1;

import java.util.Arrays;

public class AnEmptyNumber {

    class Solution {
        public int solution(int[] numbers) {

            int[] localNumbers = {0,1,2,3,4,5,6,7,8,9};

            int answer = 0;

            for (int i = 0; i < localNumbers.length; i++) {

                int target = localNumbers[i];

                boolean isExist = Arrays.stream(numbers).anyMatch(num -> num == target);

                if(!isExist) {
                    answer += localNumbers[i];
                }

            }

            return answer;
        }
    }

}
