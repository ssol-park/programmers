package lv1;

import java.util.*;

public class MemoryScore {

    public static void main(String[] args) {

        String[] name = new String[]{"may", "kein", "kain", "radi"};
        int[] yearning = new int[]{5, 10, 1, 3};
        String[][] photo = new String[][]{
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
        };

        // Expected Result : [19, 15, 6]
        int[] result = solution(name, yearning, photo);

        for (int score : result) {
            System.out.println(score);
        }
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {

        Map<String, Integer> scoreMap = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < name.length; i++) scoreMap.put(name[i], yearning[i]);

        for (int i = 0; i < photo.length; i++) {

            int score = 0;

            for (String photoName : photo[i]) {
                if(scoreMap.containsKey(photoName))
                    score += scoreMap.get(photoName);
            }

            resultList.add(score);
        }

//        int[] answer = resultList.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();

        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}
