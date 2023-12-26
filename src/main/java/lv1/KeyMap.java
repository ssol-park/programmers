package lv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyMap {
    public static void main(String[] args) {
        String[] keymap = new String[]{"ABACD", "BCEFD"};
        String[] targets = new String[]{"ABCD"};

        int[] result = solution(keymap, targets);

        for (int i : result) {
            System.out.println("i = " + i);
        }
    }

    public static int[] solution(String[] keymap, String[] targets) {
        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        for (String key : keymap) {

            char[] keyMapChar = key.toCharArray();

            for (char c : keyMapChar) {
                int idx = key.indexOf(c);

                if(map.containsKey(c)) {
                    if(map.get(c) > idx + 1) {
                        map.put(c, idx + 1);
                    }
                }else {
                    map.put(c, idx + 1);
                }
            }
        }

        for (String target : targets) {
            int total = 0;
            char[] targetChar = target.toCharArray();

            for (char c : targetChar) {
                if(map.containsKey(c)) {
                    total += map.get(c);
                }
            }

            list.add(total != 0 ? total : -1);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
