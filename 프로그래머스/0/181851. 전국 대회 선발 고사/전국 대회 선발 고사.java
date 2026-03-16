import java.util.Arrays;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] winner = attendRank(rank, attendance);
        
        answer = 10000 * winner[0] + 100 * winner[1] + winner[2];
        return answer;
    }
    
    public int[] attendRank(int[] rank, boolean[] attendance) {
        int count = 0;
        int rankNumber = 1;
        int[] winner = new int[3];
        
        while(count < 3) {
            for(int i = 0; i < rank.length; i++) {
                if(rankNumber == rank[i] ) {
                    if(attendance[i]) {
                        winner[count++] = i;
                    } else {
                        break;
                    }
                }
            }
            rankNumber++;
        }
        return winner;
    }
}