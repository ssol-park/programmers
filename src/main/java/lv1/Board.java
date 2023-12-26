package lv1;

public class Board {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        int[] hArr = new int[]{-1,1,0,0};
        int[] wArr = new int[]{0,0,-1,1};

        String targetStr = board[h][w];
        int boardLen = board.length;

        for (int i = 0; i < 4; i++) {
            int hCheck = h + hArr[i];
            int wCheck = w + wArr[i];

            if((hCheck > -1 && hCheck < boardLen) && (wCheck > -1 && wCheck < boardLen))
                answer = targetStr.equals(board[hCheck][wCheck]) ? ++answer : answer;
        }

        return answer;
    }
}
