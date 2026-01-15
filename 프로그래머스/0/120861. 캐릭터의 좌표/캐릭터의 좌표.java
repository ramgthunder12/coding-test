import java.lang.Math;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};

        for(String input : keyinput) {
            int x = answer[0];
            int y = answer[1];
            switch(input) {
                case "left":
                    x--;
                    break;
                case "right":
                    x++;
                    break;
                case "up":
                    y++;
                    break;
                case "down":
                    y--;
                    break;
            }
            if(Math.abs(x) <= board[0] / 2 && Math.abs(y) <= board[1] / 2 ) {
                answer[0] = x;
                answer[1] = y;
            }
        }
        return answer;
    }
}