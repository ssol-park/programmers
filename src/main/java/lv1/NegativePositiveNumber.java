package lv1;

public class NegativePositiveNumber {

    class Solution {
        public int solution(int[] absolutes, boolean[] signs) {

            int answer = 0;

            for (int i = 0; i < absolutes.length; i++) {

                int number = signs[i] ? absolutes[i] : absolutes[i] * -1;

                answer += number;
            }


            return answer;
        }
    }



}
