package lv1;

import java.util.Stack;

public class ClawMachine {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);

        for(int move : moves) {
            for(int j = 0; j < board.length; j++) {

                if(board[j][move-1] != 0) {
                    if(stack.peek() == board[j][move-1]) {
                        answer += 2;
                        stack.pop();
                    }else {
                        stack.push(board[j][move-1]);
                    }

                    board[j][move-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
