package lv1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Addition {

    public int[] solution(int[] numbers) {

        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1 + i; j < numbers.length; j++) {
                result.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[result.size()];

        int cnt = 0;

        for (Integer integer : result) {
            answer[cnt] = integer;

            cnt++;
        }

        Arrays.sort(answer); // TreeSet을 사용하면 정렬 알고리즘 생략 가능, 자동으로 정렬 됨

        return answer;
    }

}
