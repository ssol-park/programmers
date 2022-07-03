package lv1;

import java.util.HashMap;
import java.util.Map;

public class Player {

    public String solution(String[] participants, String[] completions) {

        String answer = "";

        Map<String, Integer> participantsMap = new HashMap();

        for (String participant : participants) {

            if(!participantsMap.containsKey(participant)) {

                participantsMap.put(participant, 1);
            }else {

                participantsMap.put(participant, participantsMap.getOrDefault(participant, 0) + 1);
            }

        }


        for (String completion : completions) {

            participantsMap.put(completion, participantsMap.get(completion) - 1);
        }

        for (Map.Entry<String, Integer> info : participantsMap.entrySet()) {

            if(info.getValue() > 0) {
                answer = info.getKey();

                break;
            }
        }

        return answer;
    }

}
