package lv1;

import java.util.HashMap;
import java.util.Map;

public class Running {
    public static void main(String[] args) {

    }

    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankMap = new HashMap<>();

        int playerSize = players.length;
        for (int i = 0; i < playerSize; i++) {
            rankMap.put(players[i], i);
        }

        for (String player : callings) {

            int currentRank = rankMap.get(player);

            String otherPlayer = players[currentRank - 1];

            players[currentRank] = otherPlayer;
            players[currentRank - 1] = player;

            rankMap.put(player, currentRank - 1);
        }

        return players;
    }

    public String[] solution2(String[] players, String[] callings) {
        Map<String, Integer> playersMap = new HashMap<>();
        for(int i=0; i<players.length; i++) playersMap.put(players[i], (i+1));

        for(int i=0; i<callings.length; i++) {
            String temp = "";
            temp = players[playersMap.get(callings[i])-2];
            players[playersMap.get(callings[i])-2] = players[playersMap.get(callings[i])-1];
            players[playersMap.get(callings[i])-1] = temp;

            playersMap.put(callings[i], playersMap.get(callings[i])-1);
            playersMap.put(temp, playersMap.get(temp)+1);

        }
        return players;
    }
}
