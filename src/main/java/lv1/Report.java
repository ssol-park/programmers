package lv1;

import java.util.*;

public class Report {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, HashSet<String>> reporters = new HashMap<>();
        Map<String, Integer> reportedCounts = new HashMap<>();
        HashSet<String> reportInfos = new HashSet<>(Arrays.asList(report));

        for (String reportInfo : reportInfos) {

            String reporter = reportInfo.split(" ")[0];
            String target = reportInfo.split(" ")[1];

            reporters.putIfAbsent(reporter, new HashSet<>() {{
                add(target);
            }});

            reporters.get(reporter).add(target);
            reportedCounts.put(target, reportedCounts.getOrDefault(target, 0) + 1);
        }

        for (String target : reportedCounts.keySet()) {
            int reportedCount = reportedCounts.get(target);

            if(reportedCount >= k) {
                for (int i = 0; i < id_list.length; i++) {
                    if(reporters.containsKey(id_list[i]) && reporters.get(id_list[i]).contains(target)) {
                        answer[i]++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;


        int[] test = solution(id_list, report, k);

        System.out.println(test);

    }
}
