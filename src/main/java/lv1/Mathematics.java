package lv1;

import java.util.ArrayList;
import java.util.List;

public class Mathematics {

    public int[] solution(int[] answers) {

        List<Integer> list = new ArrayList<>();

        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5,};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int answer1 = 0, answer2 = 0, answer3 = 0;

        for (int i = 0; i < answers.length; i++) {

            if(answers[i] == person1[i % person1.length])
                answer1++;

            if(answers[i] == person2[i % person2.length])
                answer2++;

            if(answers[i] == person3[i % person3.length])
                answer3++;

        }

        int[] results = {answer1, answer2, answer3};

        int max = 0;

        for (int i = 0; i < results.length; i++) {

            if(results[i] >= max) {
                max = results[i];
            }
        }

        for (int i = 0; i < results.length; i++) {

            if(max == results[i]) {
                list.add(i + 1);
            }

        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

}
