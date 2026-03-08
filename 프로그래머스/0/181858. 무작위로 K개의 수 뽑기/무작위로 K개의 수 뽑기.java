import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        HashSet<Integer> set = new HashSet<>();
        int idx = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])) {
                set.add(arr[i]);
                answer[idx++] = arr[i];
                
                if(idx == k) {
                    break;
                }
            }
        }
        return answer;
    }
}