package lv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataAnalysis {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        Map<String, Integer> fieldCode = new HashMap<>();
        fieldCode.put("code", 0);
        fieldCode.put("date", 1);
        fieldCode.put("maximum", 2);
        fieldCode.put("remain", 3);

        List<int[]> filteredList = new ArrayList<>();

        int targetField = fieldCode.get(ext);

        for (int[] each : data)
            if(each[targetField] < val_ext) filteredList.add(each);

        int sortField = fieldCode.get(sort_by);
        int[][] answer = new int[filteredList.size()][4];

        for (int i = 0; i < filteredList.size(); i++)
            for (int j = 0; j < filteredList.get(i).length; j++)
                answer[i][j] = filteredList.get(i)[j];


        for (int i = 0; i < answer.length; i++) {
            for (int j = i + 1; j < answer.length; j++) {
                if(answer[i][sortField] > answer[j][sortField]) {
                    int[] temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }

        return answer;
    }
}
