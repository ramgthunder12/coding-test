import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> list = new ArrayList<>();

        // 1. 참석 가능한 학생만 담기 (index, rank)
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                list.add(new int[]{i, rank[i]});
            }
        }

        // 2. rank 기준 오름차순 정렬
        list.sort((a, b) -> a[1] - b[1]);

        // 3. 상위 3명 추출
        int a = list.get(0)[0];
        int b = list.get(1)[0];
        int c = list.get(2)[0];

        return 10000 * a + 100 * b + c;
    }
//     public int solution(int[] rank, boolean[] attendance) {
//         int answer = 0;
//         int[] winner = attendRank(rank, attendance);
        
//         answer = 10000 * winner[0] + 100 * winner[1] + winner[2];
//         return answer;
//     }
    
//     public int[] attendRank(int[] rank, boolean[] attendance) {
//         int count = 0;
//         int rankNumber = 1;
//         int[] winner = new int[3];
        
//         while(count < 3) {
//             for(int i = 0; i < rank.length; i++) {
//                 if(rankNumber == rank[i] ) {
//                     if(attendance[i]) {
//                         winner[count++] = i;
//                     } else {
//                         break;
//                     }
//                 }
//             }
//             rankNumber++;
//         }
//         return winner;
//     }
}
