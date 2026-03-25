import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answerList = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int delete_num : delete_list) {
            set.add(delete_num);
        }
        
        for(int num : arr) {
            if(set.contains(num)) {
            } else {
                answerList.add(num);
            }
        }
        
        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}