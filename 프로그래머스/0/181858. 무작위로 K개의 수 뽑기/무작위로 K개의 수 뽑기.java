import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] arr, int k) {
//         int[] answer = new int[k];
//         Arrays.fill(answer, -1);
        
//         HashSet<Integer> set = new HashSet<>();
//         int idx = 0;
        
//         for(int i = 0; i < arr.length; i++) {
//             if(!set.contains(arr[i])) {
//                 set.add(arr[i]);
//                 answer[idx++] = arr[i];
                
//                 if(idx == k) {
//                     break;
//                 }
//             }
//         }
        
        Set<Integer> set = new HashSet<>();
        int[] answer = new int[k];
        
        int idx = 0;
        
        for (int a : arr) {
            if (!set.contains(a)) {
                set.add(a);
                answer[idx++] = a;
                
                if (idx == k) break; // k개 채우면 끝
            }
        }
        
        // 남은 자리 -1 채우기
        while (idx < k) {
            answer[idx++] = -1;
        }
        
        return answer;
    }
}