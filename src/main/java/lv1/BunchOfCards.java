package lv1;

public class BunchOfCards {
    public static void main(String[] args) {
        String[] cards1 = new String[]{"i", "water", "drink"};
        String[] cards2 = new String[]{"want", "to"};
        String[] goal = new String[]{"i", "want", "to", "drink", "water"};


        String result = solution(cards1, cards2, goal);

        System.out.println("result = " + result);
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int goalLength = goal.length;
        int cards1Length = cards1.length;
        int cards2Length = cards2.length;

        int curIdxCards1 = 0;
        int curIdxCards2 = 0;
        
        for (int i = 0; i < goalLength; i++) {

            String targetStr = goal[i];

            if(targetStr.equals(cards1[curIdxCards1])) {
                if(curIdxCards1 < cards1Length - 1) curIdxCards1++;

            }else if(targetStr.equals(cards2[curIdxCards2])) {
                if(curIdxCards2 < cards2Length - 1) curIdxCards2++;

            }else {
                answer = "No";
                break;
            }
        }

        return answer;
    }
}
